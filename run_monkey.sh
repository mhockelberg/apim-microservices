#!/bin/bash
export SSG_LICENSE="$(cat $HOME/CATechnologies_8011955308725460639_SSG_Gateway_9.xml | gzip | base64)"
mvn clean install
docker run \
        -d \
        -e MYSQL_ROOT_PASSWORD=Password1 \
        -e MYSQL_DATABASE=lacadmindb \
        -e MYSQL_USER=lacadminuser \
        -e MYSQL_PASSWORD=Password2 \
        --volume=$PWD/lacadmin:/var/lib/mysql \
        -p 3306:3306 \
        mysql:5.6.29
		
docker run \
        -d \
        -e RDS_HOSTNAME=172.16.160.129 \
        -e RDS_PORT=3306 \
        -e RDS_USERNAME=lacadminuser \
        -e RDS_PASSWORD=Password2 \
        -e RDS_DB_NAME=lacadmindb \
        -e LAC_ADMIN_MAX_CONN=100 \
        -p 9090:8080 \
        caliveapicreator/release
cd docker
docker-compose up -d
sleep 10

cd ..
ssg=$(docker logs $(docker ps -q --filter "ancestor=caapim/gateway") 2>&1 | grep "apim-provisioning: INFO: waiting for the shutdown file")

echo "Looking to source control to deploy apim policy; waiting for APIM Gateway to start"
while [ "$ssg" != "apim-provisioning: INFO: waiting for the shutdown file at \"/userdata/shutdown\" to be created" ]; do
    echo "waiting for APIM Gateway to start"    
    ssg=$(docker logs $(docker ps -q --filter "ancestor=caapim/gateway") 2>&1 | grep "apim-provisioning: INFO: waiting for the shutdown file")
    sleep 10
done

#read -p "Press [Enter] key to deploy policy..."
cd ${PWD}/GMU
./GatewayMigrationUtility.sh migrateIn -h ms.apim.ca -p 8443 -u pmadmin --plaintextPassword 7layer --trustCertificate --trustHostname --bundle BUNDLES/bundle_ms.xml --results OUT/results.xml

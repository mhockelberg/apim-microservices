docker ps | grep hello | perl -MList::Util=shuffle -e 'print shuffle(<STDIN>);' | head -n 1 | awk '{print $1}' | xargs docker stop
#docker ps | grep hello | sort -R | head -n 1 | awk '{print $1}' | xargs docker stop

package users;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class usersController {
    
    @RequestMapping("/")
    public String index() {
        return "<root><Customer><email>stone@meekness.com</email><zip>07620 Alpine, N.J.</zip></Customer><Customer><email>ca-tech@dps.centrin.net.id</email><zip>94027 Atherton, Calif.</zip></Customer><Customer><email>trinanda_lestyowati@telkomsel.co.id</email><zip>10014 New York, N.Y.</zip></Customer><Customer><email>asst_dos@astonrasuna.com</email><zip>91008 Duarte, Calif.</zip></Customer><Customer><email>amartabali@dps.centrin.net.id</email><zip>90210 Beverly Hills, Calif.</zip></Customer><Customer><email>achatv@cbn.net.id</email><zip>92067 Rancho Santa Fe, Calif.</zip></Customer><Customer><email>bali@tuguhotels.com</email><zip>93108 Santa Barbara, Calif.</zip></Customer><Customer><email>baliminimalist@yahoo.com</email><zip>94024 Los Altos Hills, Calif.</zip></Customer><Customer><email>bliss@thebale.com</email><zip>10065 New York, N.Y.</zip></Customer><Customer><email>adhidharma@denpasar.wasantara.net.id</email><zip>07926 Brookside, N.J.</zip></Customer><Customer><email>centralreservation@ramayanahotel.com</email><zip>92661 Newport Beach, Calif.</zip></Customer><Customer><email>apribadi@balimandira.com</email><zip>21056 Gibson Island, Md.</zip></Customer><Customer><email>cdagenhart@ifc.org</email><zip>81654 Snowmass, Colo.</zip></Customer><Customer><email>dana_supriyanto@interconti.com</email><zip>11976 Water Mill, N.Y.</zip></Customer><Customer><email>dos@novotelbali.com</email><zip>11932 Bridgehampton, N.Y.</zip></Customer><Customer><email>daniel@hotelpadma.com</email><zip>10075 New York, N.Y.</zip></Customer><Customer><email>daniel@balibless.com</email><zip>91302 Hidden Hills, Calif.</zip></Customer><Customer><email>djoko_p@jayakartahotelsresorts.com</email><zip>10013 New York, N.Y.</zip></Customer><Customer><email>expdepot@indosat.net.id</email><zip>89125 Las Vegas, Nev.</zip></Customer><Customer><email>feby.adamsyah@idn.xerox.com</email><zip>81611 Aspen, Colo.</zip></Customer><Customer><email>christian_rizal@interconti.com</email><zip>10577 Purchase, N.Y.</zip></Customer><Customer><email>singgih93@mailcity.com</email><zip>92657 Newport Coast, Calif.</zip></Customer><Customer><email>idonk_gebhoy@yahoo.com</email><zip>94528 Diablo, Calif.</zip></Customer><Customer><email>info@houseofbali.com</email><zip>10012 New York, N.Y.</zip></Customer><Customer><email>kyohana@toureast.net</email><zip>94010 Hillsborough, Calif.</zip></Customer><Customer><email>sales@nusaduahotel.com</email><zip>94920 Tiburon, Calif.</zip></Customer><Customer><email>jayakarta@mataram.wasantara.net.id</email><zip>11765 Mill Neck, N.Y.</zip></Customer><Customer><email>mapindo@indo.net.id</email><zip>10007 New York, N.Y.</zip></Customer><Customer><email>sm@ramayanahotel.com</email><zip>10021 New York, N.Y.</zip></Customer><Customer><email>anekabeach@dps.centrin.net.id</email><zip>10003 New York, N.Y.</zip></Customer><Customer><email>yogya@jayakartahotelsresorts.com</email><zip>95030 Monte Sereno, Calif.</zip></Customer></root>";
   }
}
package tasksArray;

public class FastFoodRestaruants {
    public static void main(String[] args) {
        String[] restaurants = {"324 Main St,Massena,McDonald's,13662,NY,http://mcdonalds.com",
                "530 Clinton Ave,Washington Court House,Wendy's,43160,OH,http://www.wendys.com",
                "408 Market Square Dr,Maysville,Frisch's Big Boy,41056,KY,http://www.frischs.com",
                "6098 State Highway 37,Massena,McDonald's,13662,NY,http://mcdonalds.com",
                "139 Columbus Rd,Athens,OMG! Rotisserie,45701,OH,http://www.omgrotisserie.com",
                "4182 Tonya Trl,Hamilton,Domino's Pizza,45011,OH,https://www.dominos.com/en/?redirect=homepage",
                "590 S Main St,Englewood,Domino's Pizza,45322,OH,https://www.dominos.com/en/",
                "401 N Jennings St,Saluda,McDonald's,29138,SC,http://www.mcdonalds.com",
                "205 W Church St,Batesburg,Wendy's,29006,SC,http://www.wendys.com",
                "2711 W. Kings Highway Ste. 18,Paragould,Pizza Hut,72450,AR,http://www.pizzahut.com",
                "613 W Center St,Sheridan,SONIC Drive In,72150,AR,https://locations.sonicdrivein.com/ar/sheridan/613-w--center-street.html",
                "512 Highway 425 S Lot B,Monticello,Domino's Pizza,71655,AR,https://www.dominos.com/en/?redirect=homepage",
                "1535 NW 50th St,Oklahoma City,McDonald's,73118,OK,http://mcdonalds.com",
                "125 Towne Center Dr,Lexington,Domino's Pizza,40511,KY,https://www.dominos.com/en/?redirect=homepageandutm_source=locallistingsandutm_medium=loclistandutm_campaign=localmaps",
                "66 14th St.,Tell City,Long John Silver's,47586,IN,http://www.ljsilvers.com",
                "301 University Blvd,Louisville,McDonald's,40208,KY,http://mcdonalds.com",
                "5812 NW Expressway,Oklahoma City,McDonald's,73132,OK,http://mcdonalds.com",
                "101 Thomas Garst Ln,Leland,Taco Bell,28451,NC,http://www.tacobell.com",
                "1111 New Pointe Blvd,Leland,McDonald's,28451,NC,http://mcdonalds.com",
                "782 Old Hickory Blvd Ste 120,Brentwood,Qdoba Mexican Grill,37027,TN,http://www.qdoba.com",
                "108 Village Rd NE,Leland,McDonald's,28451,NC,http://mcdonalds.com",
                "1116 Old Highway 60,Hardinsburg,McDonald's,40143,KY,http://mcdonalds.com",
                "1423 Southwest Pkwy,Wichita Falls,McDonald's,76302,TX,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referral",
                "908 Padre Blvd,South Padre Island,McDonald's,78597,TX,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referral",
                "1131n N Main St,Miami,McDonald's,74354,OK,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "3401 Hwy 165 North,Pineville,Pizza Hut,71360,LA,http://www.pizzahut.com",
                "1631 E Madison Ave,Bastrop,Sonic Drive-In,71220,LA,https://locations.sonicdrivein.com/la/bastrop/1631-e--madison.html",
                "301 S Lynn Riggs Blvd,Claremore,Domino's Pizza,74017,OK,https://www.dominos.com/en/?redirect=homepage",
                "601 E Lincolnway,Minerva,McDonald's,44657,OH,http://www.mcdonalds.com",
                "3211 S 4th St,Leavenworth,SONIC Drive In,66048,KS,https://locations.sonicdrivein.com/ks/leavenworth/3211-s-fourth-street.html",
                "105 Business Loop W,Jamestown,Taco Bell,58401,ND,http://www.tacobell.com",
                "1531 University Dr S,Fargo,Domino's Pizza,58103,ND,https://www.dominos.com/en/?redirect=homepage",
                "718 10th St SE,Jamestown,Taco John's,58401,ND,https://www.tacojohns.com",
                "1400 24th Ave SW,Minot,McDonald's,58701,ND,http://mcdonalds.com",
                "703 S Magnolia St,Woodville,Whataburger,75979,TX,https://locations.whataburger.com/tx/woodville/703-s--magnolia.html",
                "1535 S Broadway,Minot,Pizza Hut,58701,ND,http://www.pizzahut.com",
                "775 S Main St,Smithfield,Domino's Pizza,84335,UT,https://www.dominos.com/en/?redirect=homepageandutm_source=locallistingsandutm_medium=loclistandutm_campaign=localmaps",
                "218 W Main St,Ada,Hamburger King,74820,OK,",
                "3208 S Elm Pl,Broken Arrow,SONIC Drive In,74012,OK,https://locations.sonicdrivein.com/ok/broken-arrow/3208-s-elm-place.html",
                "3056 Classen Blvd Unit A,Norman,Domino's Pizza,73071,OK,https://www.dominos.com/en/?redirect=homepage",
                "982 Macon St,Warner Robins,Burger King,31098,GA,http://www.bk.com",
                "6060 San Mateo Blvd NE,Albuquerque,Burger King,87109,NM,http://www.bk.com",
                "8401 Gateway Blvd W Ste M4,El Paso,McDonalds,79925,TX,http://mcdonalds.com",
                "450 N Harrison Ave,Shawnee,SONIC Drive In,74801,OK,https://locations.sonicdrivein.com/ok/shawnee/450-n--harrison.html",
                "9455 SW Barbur Blvd,Portland,Taco Time,97219,OR,http://www.tacotime.com/stores/6254",
                "351 River Hill Dr,Ashland,McDonald's,41101,KY,http://www.mcdonalds.com",
                "18000 Bagley Rd,Cleveland,Burger King,44130,OH,http://www.bk.com",
                "3700 N 1st Ave,Evansville,McDonald's,47710,IN,http://mcdonalds.com",
                "895 N Highway 77 Ste 300,Waxahachie,Jimmy John's,75165,TX,http://www.jimmyjohns.com",
                "819 SW 19th St,Oklahoma City,Domino's Pizza,73160,OK,https://www.dominos.com/en/?redirect=homepage",
                "95-1249 Meheula Parkway,Mililani,Jersey Mike's Subs,96789,HI,https://www.jerseymikes.com/44004http://www.jerseymikes.com",
                "1625 Veterans Pkwy,Jeffersonville,Popeyes Louisiana Kitchen,47130,IN,http://www.popeyes.com",
                "2730 S Hurstbourne Pkwy Suite 100,Louisville,Qdoba Mexican Grill,40220,KY,http://www.qdoba.com",
                "5680 Commercial St SE Ste 100,Salem,Domino's Pizza,97306,OR,https://www.dominos.com/en/?redirect=homepage",
                "2870 W Loop 1604 S,San Antonio,Whataburger,78245,TX,https://locations.whataburger.com/tx/san-antonio/2870-w-loop-1604-s.html/",
                "1321 Herr Ln Ste 150,Louisville,Qdoba Mexican Grill,40222,KY,https://locations.qdoba.com/us/ky/louisville/1321-herr-lane.html",
                "100 Northside Dr,Bennington,Taco Bell,5201,VT,http://www.tacobell.com",
                "6611 S Mo Pac Expy Ste B,Austin,Whataburger,78749,TX,https://locations.whataburger.com/tx/austin/6611-s-mo-pac-expy.html/",
                "9300 S Interstate 35 Bldg H,Austin,Whataburger,78748,TX,https://locations.whataburger.com/tx/austin/9300-s-interstate-35.html/",
                "315 N Stephenson Ave,Iron Mountain,Hardee's,49801,MI,http://www.hardees.com",
                "2439 Springs Rd NE,Hickory,McDonald's,28601,NC,http://www.mcdonalds.com",
                "9651 Natural Bridge Rd,Saint Louis,Rally's,63134,MO,https://locations.rallys.com/mo/st.-louis/9651-natural-bridge-roadhttp://rallys.com",
                "1665 Dove Park Rd Ste 300,Mandeville,Quiznos,70471,LA,http://restaurants.quiznos.com/la/mandeville/doveparkcommons-70471",
                "225 Grant Ave,Auburn,Burger King,13021,NY,http://www.bk.com",
                "5400 FM 1640 Rd Ste 500,Richmond,Whataburger,77469,TX,https://locations.whataburger.com/tx/richmond/5400-fm-1640-rd.html/",
                "2448 University Ave,Green Bay,Domino's Pizza,54302,WI,https://www.dominos.com/en/?redirect=homepage",
                "111 Commons Dr,Maumelle,SONIC Drive In,72113,AR,https://locations.sonicdrivein.com/ar/maumelle/111-commons-drive.html",
                "344 S Service Rd E,Sullivan,Taco Bell,63080,MO,http://www.tacobell.com",
                "6490 Memphis Arlington Rd Ste 103,Memphis,Domino's Pizza,38135,TN,https://www.dominos.com/en/?redirect=homepage",
                "2124 S 1st St,Yakima,Taco Bell,98903,WA,https://locations.tacobell.com/wa/yakima/2124-s-1st-street.html",
                "482 Branson Landing Blvd Ste 105,Branson,Jimmy John's,65616,MO,http://www.jimmyjohns.com",
                "406 S Thompson St,Springdale,Taco Bell,72764,AR,http://www.tacobell.com",
                "5094 Murfreesboro Rd Ste 1,La Vergne,Domino's Pizza,37086,TN,https://www.dominos.com/en/?redirect=homepageandutm_source=locallistingsandutm_medium=loclistandutm_campaign=localmaps",
                "801 S Vaughn Dr,Brusly,McDonald's,70719,LA,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "5100 NC Highway 87 S Ste 102,Fayetteville,Domino's Pizza,28306,NC,https://www.dominos.com/en/?redirect=homepage",
                "Co-Op City,Bronx,Burger King,10475,NY,http://www.bk.com",
                "3898 Cleveland Hwy,Dalton,McDonalds,30721,GA,http://mcdonalds.com",
                "1865 Blankenship Rd,West Linn,Jack in the Box,97068,OR,http://www.jackinthebox.com",
                "825 W 1100 S,Brigham City,Sonic Drive-In,84302,UT,https://locations.sonicdrivein.com/ut/brigham-city/825-west-1100-south.html",
                "955 S Main St,Brigham City,Taco Bell,84302,UT,http://www.tacobell.com",
                "875 W 1150 S,Brigham City,Subway,84302,UT,http://www.subway.com",
                "524 Indian Boundary Rd,Chesterton,Jimmy John's,46304,IN,http://www.jimmyjohns.com",
                "801 University St,Martin,McDonald's,38237,TN,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "2505 State Rd,La Crosse,Hardee's,54601,WI,http://www.hardees.com",
                "1610 Sycamore View Rd,Memphis,McDonald's,38134,TN,http://www.mcdonalds.com",
                "2437 George St,La Crosse,McDonald's,54603,WI,http://mcdonalds.com",
                "813 N Central Ave,Marshfield,Taco John's,54449,WI,https://www.tacojohns.com",
                "1101 N Central Ave,Marshfield,McDonald's,54449,WI,http://mcdonalds.com",
                "4601 Northfield Rd,Cleveland,Mr Hero,44128,OH,http://www.mrhero.com",
                "1601 W Lincoln Ave,Yakima,McDonald's,98902,WA,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://www.mcdonalds.com",
                "5706 W 7800 S,West Jordan,McDonald's,84081,UT,http://www.mcdonalds.com",
                "1014 Highway 82 E,Indianola,Taco Bell,38751,MS,http://www.tacobell.com",
                "640 Huebner Rd,Fort Riley,Domino's Pizza,66442,KS,https://www.dominos.com/en/?redirect=homepage",
                "1418 W Sunset Blvd,Saint George,Taco Bell,84770,UT,http://www.tacobell.com",
                "610 E Saint George Blvd,Saint George,Taco Bell,84770,UT,http://www.tacobell.com",
                "4651 W 6th St,Lawrence,Pizza Hut,66049,KS,http://www.pizzahut.com",
                "5540 Old Cheney Rd,Lincoln,Amigos/Kings Classic,68516,NE,http://www.facebook.com/amigoskingshttp://www.amigoskings.com",
                "7501 W 135th St,Overland Park,Raising Cane's Chicken Fingers,66223,KS,http://raisingcanes.com",
                "4204 Milan Rd,Sandusky,McDonalds,44870,OH,http://mcdonalds.com",
                "6300 Gulf Fwy,La Marque,Whataburger,77568,TX,https://locations.whataburger.com/tx/la-marque/6300-gulf-freeway.html",
                "1302 Highway 35 N,Rockport,McDonald's,78382,TX,http://mcdonalds.com",
                "3515 Springdale Rd,Cincinnati,Domino's Pizza,45251,OH,http://dominospizza.com",
                "7720 Laurel Ave,Cincinnati,Domino's Pizza,45243,OH,https://www.dominos.com/en/?redirect=homepageandutm_source=locallistingsandutm_medium=loclistandutm_campaign=localmaps",
                "123 Creekside Xing,New Braunfels,Whataburger,78130,TX,https://locations.whataburger.com/tx/new-braunfels/123-creekside-crossing.html/",
                "793 Roosevelt Trl,Windham,Burger King,4062,ME,http://www.bk.com",
                "14700 E Indiana Ave,Spokane,Taco Time,99216,WA,http://www.tacotime.com/stores/6406",
                "201 Commerce Dr,Jefferson City,SONIC Drive In,65109,MO,https://locations.sonicdrivein.com/mo/jefferson-city/201-commerce-drive.html",
                "3124 S Ten Mile Dr,Jefferson City,McDonald's,65109,MO,http://mcdonalds.com",
                "1417 Jackson Ave W,Oxford,Coop DeVille,38655,MS,http://www.coopdevillerecords.com",
                "2984 Upland Pkwy,Sidney,McDonalds,69162,NE,http://mcdonalds.com",
                "1002 J St,Auburn,Amigos/Kings Classic,68305,NE,http://www.amigoskings.com",
                "191 7th St,Garden City,B. Good,11530,NY,https://bgood.com/locations/191-7th-street-garden-city-ny",
                "544 Conestoga Pkwy,Shepherdsville,Domino's Pizza,40165,KY,https://www.dominos.com/en/?redirect=homepage",
                "101 Smith Rd,Glasgow,McDonald's,42141,KY,http://mcdonalds.com",
                "5212 Jackson St,Alexandria,Sonic Drive-In,71303,LA,https://locations.sonicdrivein.com/la/alexandria/5212-jackson-street.html",
                "131 S Highway 27,Somerset,McDonald's,42501,KY,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "1511 C Goff Blvd S W Plaza Rio Shpg Ctr,Albuquerque,Domino's Pizza,87105,NM,https://www.dominos.com/en/?redirect=homepageandutm_source=locallistingsandutm_medium=loclistandutm_campaign=localmaps",
                "4800 Frederica St,Owensboro,McDonald's,42301,KY,http://mcdonalds.com",
                "300 W Esplanade Ave,Kenner,Burger King,70065,LA,http://www.bk.com",
                "5963 W Main St,Houma,Sonic Drive-In,70360,LA,https://locations.sonicdrivein.com/la/houma/5963-w-main-street.html",
                "7849 Tramway Blvd NE Ste D,Albuquerque,Domino's Pizza,87122,NM,https://www.dominos.com/en/?redirect=homepage",
                "400 Clifty Dr,Madison,Rally's,47250,IN,https://locations.rallys.com/in/madison/400-clifty-drivehttp://rallys.com",
                "1228 Saint Charles St,Houma,Taco Bell,70360,LA,http://www.tacobell.com",
                "725 Sterlington Hwy,Farmerville,Taco Bell,71241,LA,https://locations.tacobell.com/la/farmerville/725-sterlington-highway.html",
                "1088 Westbank Expy,Westwego,Pizza Hut,70094,LA,http://www.pizzahut.com",
                "1000 Government St,Baton Rouge,Sonic Drive-In,70802,LA,https://locations.sonicdrivein.com/la/baton-rouge/1000-government-street.html",
                "314 E Carpenter St,Cleveland,Back Yard Burgers,38732,MS,http://www.backyardburgers.com",
                "120 S Davis Ave,Cleveland,McDonald's,38732,MS,http://mcdonalds.com",
                "1231 Holcomb Blvd,Camp Lejeune,Wendy's,28547,NC,http://www.wendys.com",
                "112 E 2nd St,Duluth,Domino's Pizza,55805,MN,https://www.dominos.com/en/?redirect=homepage",
                "976 William H Wilson Ave Ste 100,Fort Stewart,Burger King,31314,GA,https://locations.bk.com/ga/fort-stewart/976-william-h-wilson-ave.html",
                "2910 Lurleen B Wallace Blvd,Northport,Sonic Drive-In,35476,AL,https://locations.sonicdrivein.com/al/northport/2910-lurleen-b--wallace-blvd.html",
                "2441 James St,Coralville,Domino's Pizza,52241,IA,https://www.dominos.com/en/?redirect=homepage",
                "602 Highway 31 SW,Hartselle,Taco Bell,35640,AL,http://www.tacobell.com",
                "107 Jordan Plz,Elizabeth City,Domino's Pizza,27909,NC,https://www.dominos.com/en/?redirect=homepage",
                "905 W Corbett Ave,Swansboro,McDonalds,28584,NC,http://www.mcdonalds.com",
                "2001 Sutton Ln,Sutton,Arby's,26601,WV,http://www.arbys.com",
                "161 Church St,Burlington,Pacific Rim,5401,VT,",
                "3716 7th St,Bay City,Taco Bell,77414,TX,https://locations.tacobell.com/tx/bay-city/3716-seventh-street.html",
                "443 Killian Rd,Columbia,Panda Express,29203,SC,http://www.pandaexpress.com",
                "122 Hayward Ave,Ames,Domino's Pizza,50014,IA,https://www.dominos.com/en/?redirect=homepage",
                "1306 Scotland Crossing Dr,Laurinburg,Taco Bell,28352,NC,http://www.tacobell.com",
                "1700 Norman Dr Spc 1056,Valdosta,Chick-fil-A,31601,GA,http://www.chick-fil-a.com/valdostamallhttp://www.chick-fil-a.com",
                "502 W Columbia Ave,Batesburg,Hardee's,29006,SC,http://www.hardees.com",
                "4965 Centre Pointe Dr,North Charleston,Domino's Pizza,29418,SC,https://www.dominos.com/en/?redirect=homepage",
                "2441 Northgate St,Ottumwa,McDonald's,52501,IA,http://mcdonalds.com",
                "903 E Milam St,Mexia,McDonald's,76667,TX,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "5131 Government St,Baton Rouge,Captain D's,70806,LA,https://locations.captainds.com/la/baton-rouge/5131-government-st.html",
                "4021 Interstate Highway 69 Access Rd,Corpus Christi,Whataburger,78410,TX,https://locations.whataburger.com/tx/corpus-christi/4021-ih-69-access-rd.html",
                "839 E Mulberry St,Angleton,Jack in the Box,77515,TX,http://www.jackinthebox.com",
                "3900 University Pkwy,Natchitoches,Sonic Drive-In,71457,LA,https://locations.sonicdrivein.com/la/natchitoches/3900-university-parkway.html",
                "1855 Main Ave N,Tillamook,McDonald's,97141,OR,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "400 Downs Blvd Ste 100,Franklin,Domino's Pizza,37064,TN,https://www.dominos.com/en/?redirect=homepageandutm_source=locallistingsandutm_medium=loclistandutm_campaign=localmaps",
                "808 E Liberty St,Mexico,SONIC Drive In,65265,MO,https://locations.sonicdrivein.com/mo/mexico/808-e--liberty.html",
                "701 E Main St,Park Hills,SONIC Drive In,63601,MO,https://locations.sonicdrivein.com/mo/park-hills/701-e--main-street.html",
                "3039 W Peoria Ave,Phoenix,Samurai Sam's,85029,AZ,http://www.samuraisams.net/stores/5017",
                "324 W Bypass,Andalusia,Arby's,36420,AL,http://www.arbys.com",
                "1411 Q St,Lincoln,Amigos/Kings Classic,68508,NE,http://www.amigoskings.com",
                "525 W Crawford St,Clay Center,SONIC Drive In,67432,KS,https://locations.sonicdrivein.com/ks/clay-center/525-w--crawford.html",
                "5802 S Broadway Ave,Tyler,McDonald's,75703,TX,http://mcdonalds.com",
                "3112 N Navarro St,Victoria,McDonald's,77901,TX,http://mcdonalds.com",
                "2 N Mineral St,Keyser,Subway,26726,WV,http://www.subway.com",
                "1845 Fry Rd,Katy,McDonald's,77449,TX,http://mcdonalds.com",
                "100 W Loop 340,Woodway,Whataburger,76712,TX,https://locations.whataburger.com/tx/waco/100-west-loop-340.html",
                "104 E Grant St,Roma,McDonald's,78584,TX,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://www.mcdonalds.com",
                "441 Craig St,Buffalo,McDonalds,75831,TX,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referral",
                "2111 Ave F NW US 287,Childress,McDonald's,79201,TX,http://mcdonalds.com",
                "1005 S 14th St,Kingsville,Taco Bell,78363,TX,http://www.tacobell.com",
                "4622 S Fort Hood St,Killeen,McDonald's,76542,TX,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "404 N Wood St,Gilmer,Taco Bell,75644,TX,http://www.tacobell.com",
                "7104 S Fry Rd,Katy,McDonald's,77494,TX,http://mcdonalds.com",
                "1265 S Wheeler St,Jasper,McDonald's,75951,TX,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "307 E Wise St,Bowie,McDonald's,76230,TX,http://mcdonalds.com",
                "705 N McCoy Blvd,New Boston,Taco Bell,75570,TX,http://www.tacobell.com",
                "821 S Sam Houston Blvd,San Benito,McDonald's,78586,TX,http://www.mcdonalds.com",
                "2652 S Nc 127 Hwy,Hickory,Domino's Pizza,28602,NC,https://www.dominos.com/en/?redirect=homepageandutm_source=locallistingsandutm_medium=loclistandutm_campaign=localmaps",
                "1696 N Center St,Lonoke,SONIC Drive In,72086,AR,https://locations.sonicdrivein.com/ar/lonoke/1696-north-center-street.html",
                "651 Terry Pkwy Ste 101,Gretna,Domino's Pizza,70056,LA,https://www.dominos.com/en/?redirect=homepage",
                "1449 Papillion Dr,Papillion,Domino's Pizza,68133,NE,https://www.dominos.com/en/?redirect=homepage",
                "323 N 114th St,Omaha,Domino's Pizza,68154,NE,https://www.dominos.com/en/?redirect=homepage",
                "102 Pavilion Pkwy,Newport,Domino's Pizza,41071,KY,https://www.dominos.com/en/?redirect=homepage",
                "998 Nc Highway 150 W A,Greensboro,Domino's Pizza,27455,NC,https://www.dominos.com/en/?redirect=homepageandutm_source=locallistingsandutm_medium=loclistandutm_campaign=localmaps",
                "1518 N Ed Carey Dr,Harlingen,Taco Bell,78550,TX,http://www.tacobell.com",
                "1501 7th St,Las Vegas,McDonald's,87701,NM,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "1130 Burlington St,Holdrege,Sonic Drive-In,68949,NE,https://locations.sonicdrivein.com/ne/holdrege/1130-burlington-street.html",
                "1630 S Broadway,Minot,Taco Bell,58701,ND,http://www.tacobell.com",
                "801 Dakota Ave,Wahpeton,Taco John's,58075,ND,http://locations.tacojohns.com/nd/wahpeton/801-dakota-avenue.html",
                "223 N Josephine Ave,Madison,Taco John's,57042,SD,https://www.tacojohns.com",
                "327 S Canal St,Carlsbad,McDonalds,88220,NM,http://mcdonalds.com",
                "2005 E Madison Ave,Bastrop,McDonald's,71220,LA,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://www.mcdonalds.com",
                "2000 N Date St,Truth Or Consequences,Sonic Drive-In,87901,NM,https://locations.sonicdrivein.com/nm/truth-or-consequences/2000-north-date-street.html",
                "320 NW 2nd St,Madison,McDonald's,57042,SD,http://mcdonalds.com",
                "681 W Bridge St,Owatonna,Taco Bell,55060,MN,https://locations.tacobell.com/mn/owatonna/681-west-bridge-street.html",
                "2121 E Grand Ave,Laramie,Taco Bell,82070,WY,http://www.tacobell.com",
                "1401 Mill St,Belle Fourche,Taco John's,57717,SD,https://www.tacojohns.com",
                "1650 E Bert Kouns Industrial Loop,Shreveport,Whataburger,71105,LA,https://locations.whataburger.com/la/shreveport/1650-bert-kouns-road.html",
                "600 N Grand Ave,Tahlequah,Northeastern State University,74464,OK,https://www.nsuok.edu/muskogee.aspx",
                "507 MacArthur Dr,Alexandria,McDonald's,71303,LA,http://mcdonalds.com",
                "245 High St,Ellsworth,Taco Bell,4605,ME,http://www.tacobell.com",
                "259 High St,Ellsworth,McDonald's,4605,ME,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "6001 San Mateo Blvd Ne Ste G1,Albuquerque,Pizza Hut,87109,NM,http://www.pizzahut.com",
                "304 Keyser Ave,Natchitoches,McDonald's,71457,LA,http://mcdonalds.com",
                "192 Water St,Gardiner,Domino's Pizza,4345,ME,https://www.dominos.com/en/?redirect=homepage",
                "1306 S Thompson St,Springdale,SONIC Drive In,72764,AR,https://locations.sonicdrivein.com/ar/springdale/1306-s--thompson-street.html",
                "1310 E Main St,Stigler,McDonald's,74462,OK,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://t.co/FMvCN6Rr2V",
                "1510 S Mississippi Ave,Atoka,Taco Bell,74525,OK,https://locations.tacobell.com/ok/atoka/1510-s-mississippi-st.html?utm_source=yextandutm_campaign=yextpowerlistingsandutm_medium=referralandutm_term=029375andutm_content=website",
                "207 N Broadway St,Checotah,Subway,74426,OK,http://www.subway.com",
                "4105 Main St,Springfield,Domino's Pizza,97478,OR,https://www.dominos.com/en/?redirect=homepage",
                "499 Canal St,Brattleboro,Domino's Pizza,5301,VT,http://www.dominos.com",
                "105 Blake Dr,Wagoner,SONIC Drive In,74467,OK,https://locations.sonicdrivein.com/ok/wagoner/105-north-blake-drive.html",
                "5704 Jackson St,Alexandria,Subway,71303,LA,http://www.subway.com",
                "603 E Main St,Endicott,McDonald's,13760,NY,http://mcdonalds.com",
                "1052 Sagamore Pkwy W,West Lafayette,Jimmy John's,47906,IN,http://www.jimmyjohns.com",
                "363 Swanton Rd,Saint Albans,Taco Bell,5478,VT,http://www.tacobell.com",
                "580 Shelburne Rd Ste 11,Burlington,SUBWAY,5401,VT,http://subway.com",
                "2201 S Park Ave Ste 5,Alexandria,Pizza Hut,46001,IN,http://www.pizzahut.com",
                "25 Berlin St,Montpelier,Domino's Pizza,5602,VT,https://www.dominos.com/en/?redirect=homepage",
                "313 2nd St,North Wilkesboro,Wendy's,28659,NC,http://www.wendys.com",
                "127 North St,Houlton,Domino's Pizza,4730,ME,https://www.dominos.com/en/?redirect=homepageandutm_source=locallistingsandutm_medium=loclistandutm_campaign=localmaps",
                "1215 2nd Ave W,Williston,Taco John's,58801,ND,http://locations.tacojohns.com/nd/williston/1215-2nd-avenue-w.html",
                "7201 Two Notch Rd,Columbia,Sarku Japan,29223,SC,http://www.sarkujapan.com",
                "875 4th St SW,Mason City,Taco Bell,50401,IA,http://www.tacobell.com",
                "320 11th Street Sw Plz,Spencer,Taco Bell,51301,IA,http://www.tacobell.com",
                "120 E Jefferson St,Washington,Taco Bell,52353,IA,http://www.tacobell.com",
                "6694 Highway 431 S,Owens Cross Roads,Taco Bell,35763,AL,http://www.tacobell.com",
                "2721a Emanuel Church Rd,West Columbia,Pizza Hut,29170,SC,http://www.pizzahut.com",
                "837 W Morton Ave,Jacksonville,Taco Bell,62650,IL,http://www.tacobell.com",
                "2013 US Route 20,Seneca Falls,Burger King,13148,NY,http://www.bk.com",
                "2211 W Dekalb St,Camden,Chick-fil-A,29020,SC,http://www.chick-fil-a.com/camdenhttp://www.chick-fil-a.com",
                "1400 S Higley Blvd,Rawlins,Subway,82301,WY,https://www.ta-petro.com",
                "3 Spaulding Ave,Malone,Domino's Pizza,12953,NY,http://www.dominos.com",
                "80 Clinton Plz,Clinton,Taco Bell,61727,IL,http://www.tacobell.com",
                "776 E Main St,Cobleskill,Taco Bell,12043,NY,http://www.tacobell.com",
                "1134 Paterson St,Ogdensburg,McDonald's,13669,NY,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com",
                "201 Maple City Dr,Monmouth,Taco Bell,61462,IL,http://www.tacobell.com",
                "31305 Vine St,Eastlake,Burger King,44095,OH,http://www.bk.com",
                "2118 Missouri Blvd,Jefferson City,Captain D's,65109,MO,https://locations.captainds.com/mo/jefferson-city/2118-missouri-blvd.html",
                "1212 W Main St,Fairfield,McDonald's,62837,IL,http://www.mcdonalds.com",
                "2333 Missouri Blvd,Jefferson City,Jack in the Box,65109,MO,http://www.jackinthebox.com",
                "550 E Industrial Park Rd,Murphysboro,McDonald's,62966,IL,http://mcdonalds.com",
                "220 S Main St,Atmore,Burger King,36502,AL,http://www.bk.com",
                "1607 S State Route 127,Greenville,Taco Bell,62246,IL,http://www.tacobell.com",
                "51-67 E 161st St,Bronx,McDonald's,10451,NY,http://mcdonalds.com",
                "253 W 42nd St,New York,Five Guys,10036,NY,http://fiveguys.com",
                "4461 Market Commons Dr,Fairfax,Pei Wei,22033,VA,http://www.peiwei.com",
                "14493 Gideon Dr,Woodbridge,Wendy's,22192,VA,http://www.wendys.com",
                "2815 Fern Valley Rd,Louisville,Arby's,40213,KY,http://www.arbys.com",
                "2800 Outer Loop,Louisville,McDonald's,40219,KY,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referral",
                "6501 Paramount Park Dr,Louisville,Taco Bell,40213,KY,https://locations.tacobell.com/ky/louisville/6501-paramount-park-dr-.html?utm_source=yextandutm_campaign=yextpowerlistingsandutm_medium=referralandutm_term=031668andutm_content=website",
                "713 McCroskey St,Nixa,Arby's,65714,MO,http://www.arbys.com",
                "3409 W Blue Ridge Dr,Greenville,Taco Bell,29611,SC,http://www.tacobell.com",
                "6103 White Horse Rd,Greenville,McDonald's,29611,SC,http://mcdonalds.com",
                "2219 Madison Street,Clarksville,SONIC Drive In,37043,TN,https://locations.sonicdrivein.com/tn/clarksville/2219-madison-street.html",
                "788 Riverside Drive,Clarksville,Taco Bell,37040,TN,http://www.tacobell.com",
                "400 Lovell Rd,Knoxville,Wendy's,37934,TN,http://www.wendys.com",
                "13433 Leopard St,Corpus Christi,Burger King,78410,TX,http://www.bk.com",
                "208 E Highway 90,Dayton,Jack in the Box,77535,TX,http://www.jackinthebox.com",
                "3305 S Campbell Ave Ste E,Springfield,Jimmy John's,65807,MO,http://www.jimmyjohns.com",
                "1173 Murfreesboro Rd,Nashville,McDonald's,37217,TN,http://mcdonalds.com",
                "2203 E Hubbard St,Mineral Wells,Taco Bell,76067,TX,http://www.tacobell.com",
                "2901 Houston Hwy,Victoria,Wendy's,77901,TX,http://www.wendys.com",
                "6201 W Colonial Drive,Orlando,Krystal,32808,FL,http://www.krystal.com/locations/florida/orlando-west-colonial-drive/",
                "3596 MT Diablo Blvd,Lafayette,Baja Fresh,94549,CA,",
                "31707 LA Highway 16,Denham Springs,Mcdonald's,70726,LA,http://mcdonalds.com",
                "903 S Springfield Ave,Bolivar,McDonald's,65613,MO,http://mcdonalds.com",
                "1875 S Springfield Ave,Bolivar,Taco Bell,65613,MO,http://www.tacobell.com",
                "1905 Southwest Blvd,Jefferson City,Taco Bell,65109,MO,http://www.tacobell.com",
                "2605 Missouri Blvd,Jefferson City,Taco Bell,65109,MO,http://www.tacobell.com",
                "3407 Missouri Blvd,Jefferson City,Chick-fil-A,65109,MO,http://www.chick-fil-a.com/jeffersoncity",
                "1911 S Springfield Ave,Bolivar,Burger King,65613,MO,http://www.bk.com",
                "5160 Southport Supply Road,Southport,Bojangles' Famous Chicken 'n Biscuits,28461,NC,http://www.bojangles.com",
                "421 N 36th St,Quincy,Burger King,62301,IL,https://locations.bk.com/il/quincy/421-north-36th-st.html",
                "501 S 8th St,Rogers,Arby's,72756,AR,https://locations.arbys.com/us/ar/rogers/501-s-8th-st.html",
                "2000 S Pleasant St,Springdale,Wendy's,72764,AR,http://www.wendys.com",
                "311 N Gaskill St,Huntsville,SUBWAY,72740,AR,http://subway.com",
                "401 S Thompson St,Springdale,Hardee's,72764,AR,http://www.hardees.com",
                "1260 E Robinson Ave,Springdale,McDonald's,72764,AR,http://mcdonalds.com",
                "1300 S Thompson St,Springdale,Burger King,72764,AR,http://www.bk.com",
                "1407 Main St,Keokuk,McDonald's,52632,IA,http://mcdonalds.com",
                "1421 Avenue H,Fort Madison,Taco Bell,52627,IA,http://www.tacobell.com",
                "1029 S Range Line Rd,Joplin,Taco Bell,64801,MO,http://www.tacobell.com",
                "18710 S Dixie Hwy,Miami,Pollo Tropical,33157,FL,http://pollotropical.com",
                "709 N Jefferson St,Saint James,Burger King,65559,MO,http://www.bk.com",
                "9601 Jefferson Hwy,New Orleans,McDonald's,70123,LA,http://mcdonalds.com",
                "368 S Gloster St,Tupelo,Wendy's,38801,MS,http://www.wendys.com",
                "840 W Main St,Tupelo,Burger King,38801,MS,http://www.bk.com",
                "207 Highway 15 N,Pontotoc,Burger King,38863,MS,http://www.bk.com",
                "1130 Murfreesboro Rd,Franklin,Arby's,37064,TN,http://www.arbys.com",
                "116 Highway 15 N,Pontotoc,Domino's Pizza,38863,MS,https://www.dominos.com/en/?redirect=homepage",
                "1221 S Gloster St,Tupelo,Domino's Pizza,38801,MS,https://www.dominos.com/en/?redirect=homepage",
                "11292 Old 63 S,Lucedale,Burger King,39452-6632,AL,http://bk.com",
                "2395 Pass Rd,Biloxi,Burger King,39531,AL,https://locations.bk.com/ms/biloxi/2395-pass-rd.html",
                "309 S Pearson Rd.,Pearl,Waffle House,39208,AL,",
                "4337 Robinson St,Jackson,Popeye's Chicken & Biscuits,39209,AL,http://popeyes.com",
                "4725 Clinton Blvd,Jackson,Popeye's Chicken & Biscuits,39209,AL,http://popeyes.com",
                "605 W US Highway 18,Garner,Hardee's,50438,IA,http://www.hardees.com",
                "202 11th Street Sw Plz,Spencer,Burger King,51301,IA,http://www.bk.com",
                "1705 W Burlington Ave,Fairfield,McDonald's,52556,IA,http://mcdonalds.com",
                "3022 5th Ave S,Fort Dodge,Jimmy Johns,50501,IA,http://www.jimmyjohns.com"};

        //TASK 1. Find how many restaurants and print
        //System.out.println("Total number of restaurants: " + ???);
        System.out.println("Total number of restaurants: " + restaurants.length);
        //TASK 2. Print each restaurant information in separate line starting with a number.
        //1. 3022 5th Ave S,Fort Dodge,Jimmy Johns,50501,IA,http://www.jimmyjohns.com
        for (int i = 0; i < restaurants.length; i++) {
            System.out.println((i + 1) + "." + restaurants[i]);
        }
        System.out.println("======================");

        //TASK 3. count how many "McDonald's" in array
        int mcdonalsCount = 0;
        for (int i = 0; i < restaurants.length; i++) {
            String eachRest = restaurants[i];  // assign a string value to string variable
            if (eachRest.contains("McDonald's")) {
                ++mcdonalsCount;
            }
        }
        System.out.println("McDonald's Count: " + mcdonalsCount);
        System.out.println("========================");
        //TASK 4. Count number of Popeye's Chicken, Domino's Pizza, Taco Bell
        int popeyesCount = 0;
        int dominosCount = 0;
        int tacoBellCount = 0;

        for (int i = 0; i < restaurants.length; i++) {
            String eachRest = restaurants[i];
            if (eachRest.contains("Popeye's Chicken")) {
                popeyesCount++;
            }
            if (eachRest.contains("Domino's Pizza")) {
                dominosCount++;
            }
            if (eachRest.contains("Taco Bell")) {
                tacoBellCount++;
            }
        }
        System.out.println("popeyesCount = " + popeyesCount);
        System.out.println("dominosCount = " + dominosCount);
        System.out.println("tacoBellCount = " + tacoBellCount);
        System.out.println("===========================");
        //TASK 5. Find all McDonald's in TX and print out info with number:
        /*
        1. 4622 S Fort Hood St,Killeen,McDonald's,76542,TX,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com
        2. 343 S Java Hood St,Killeen,McDonald's,12345,TX,http://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referralhttp://mcdonalds.com
         */
        for (int i = 0; i < restaurants.length; i++) {
            String eachRest = restaurants[i];
            if (eachRest.contains("McDonald's") && eachRest.contains("TX")) {
                System.out.println((i + 1) + eachRest);
            }
        }
        System.out.println("==================");

        //TASK 6. Take first restaurant , split it with comma and print in below format
        //324 Main St,Massena,McDonald's,13662,NY,http://mcdonalds.com
        String[] firstRest = restaurants[0].split(",");
        for (String eachItem : firstRest) {
          System.out.print(eachItem + ",");
       }

        System.out.println("============================");
        //TASK 7. Print each restaurant name, City, state in above format for all restaurants
        for (int i = 0; i < restaurants.length; i++) {
            String[] eachRest = restaurants[i].split(" ");
            for (String eachRestInfo : eachRest) {
                System.out.print(eachRestInfo + " ");
            }
            System.out.println();
        }

        }
    }



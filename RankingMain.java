import javafx.print.PageLayout;
import sun.jvm.hotspot.oops.Mark;
import sun.security.x509.AVA;

import javax.xml.soap.Text;
import java.util.*;

public class RankingMain {
    public static void main(String [] args) {
        //Here we will store every player and team that we find in our rankings
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Player> players = new ArrayList<>();

        //create our Match object which we will use to run matches and update rankings
        Match m = new Match();

        //<editor-fold desc="Player Declarations">
        Player tucks = new Player("tucks");
        Player pecks = new Player("pecks");
        Player aliStair = new Player("aliStair");
        Player INS = new Player("INS");
        Player malta = new Player("malta");
        Player TOAO = new Player("TOAO");
        Player phr = new Player("phr");
        Player Furlan = new Player("Furlan");
        Player GruBy = new Player("GruBy");
        Player snatchie = new Player("snatchie");
        Player DEV7L = new Player("DEV7L");
        Player frozen = new Player("frozen");
        Player MonttY = new Player("MonttY");
        Player queztone = new Player("queztone");
        Player ZEDKO = new Player("ZEDKO");
        Player MAJ3R = new Player("MAJ3R");
        Player XANTARES = new Player("XANTARES");
        Player Calyx = new Player("Calyx");
        Player paz = new Player("paz");
        Player ngiN = new Player("ngiN");
        Player Magisk = new Player("Magisk");
        Player dazzLe = new Player("dazzLe");
        Player Jonji = new Player("Jonji");
        Player moose = new Player("moose");
        Player Ace = new Player("Ace");
        Player vSa = new Player("vSa");
        Player Grim = new Player("Grim");
        Player mCe = new Player("mCe");
        Player xCeed = new Player("xCeed");
        Player Voltage = new Player("Voltage");
        Player Snakes = new Player("Snakes");
        Player swag = new Player("swag");
        Player AZK = new Player("AZK");
        Player witmer = new Player("witmer");
        Player pollo = new Player("pollo");
        Player dapr = new Player("dapr");
        Player MAKKA = new Player("MAKKA");
        Player ShoT_UP = new Player("ShoT_UP");
        Player Oderus = new Player("Oderus");
        Player neptune = new Player("neptune");
        Player Douglas = new Player("Douglas");
        Player Twistzz = new Player("Twistzz");
        Player zews = new Player("zews");
        Player nitr0 = new Player("nitr0");
        Player jdm64 = new Player("jdm64");
        Player EliGE = new Player("EliGE");
        Player seangares = new Player("seang@res");
        Player ShahZam = new Player("ShahZam");
        Player SicK = new Player("SicK");
        Player AmaNEk = new Player("AmaNEk");
        Player devoduvek = new Player("devoduvek");
        Player USTILO = new Player("USTILO");
        Player Nifty = new Player("Nifty");
        Player jks = new Player("jks");
        Player AZR = new Player("AZR");
        Player NAF = new Player("NAF-FLY");
        Player Summer = new Player("Summer");
        Player AttackeR = new Player("AttackeR");
        Player Karsa = new Player("Karsa");
        Player kaze = new Player("kaze");
        Player LOVEYY = new Player("LOVEYY");
        Player KrizzeN = new Player("KrizzeN");
        Player qikert = new Player("qikert");
        Player Jame = new Player("Jame");
        Player dimasick = new Player("dimasick");
        Player buster = new Player("buster");
        Player jmqa = new Player("jmqa");
        Player Kvik = new Player("Kvik");
        Player waterfaLLZ = new Player("waterfaLLZ");
        Player Boombl4 = new Player("Boombl4");
        Player balblna = new Player("balblna");
        Player SIXER = new Player("SIXER");
        Player RpK = new Player("RpK");
        Player ScreaM = new Player("ScreaM");
        Player Happy = new Player("Happy");
        Player xms = new Player("xms");
        Player tarik = new Player("tarik");
        Player autimatic = new Player("autimatic");
        Player stew = new Player("Stewie2k");
        Player Skadoodle = new Player("Skadoodle");
        Player RUSH = new Player("RUSH");
        Player karrigan = new Player("karrigan");
        Player olof = new Player("olofmeister");
        Player GuardiaN = new Player("GuardiaN");
        Player NiKo = new Player("NiKo");
        Player rain = new Player("rain");
        Player seized = new Player("siezed");
        Player WorldEdit = new Player("WorldEdit");
        Player wayLander = new Player("wayLander");
        Player markeloff = new Player("markeloff");
        Player B1ad3 = new Player("B1ad3");
        Player bodyy = new Player("bodyy");
        Player shox = new Player("shox");
        Player kennyS = new Player("kennyS");
        Player NBK = new Player("NBK-");
        Player apEX = new Player("apEX");
        Player Edward = new Player("Edward");
        Player Zeus = new Player("Zeus");
        Player flamie = new Player("flamie");
        Player s1mple = new Player("s1mple");
        Player electronic = new Player("electronic");
        Player Spiidi = new Player("Spiidi");
        Player denis = new Player("denis");
        Player zehN = new Player("zehN");
        Player innocent = new Player("innocent");
        Player kRYSTAL = new Player("kRYSTAL");
        Player chopper = new Player("chopper");
        Player jR = new Player("jR");
        Player keshandr = new Player("keshandr");
        Player mir = new Player("mir");
        Player hutji = new Player("hutji");
        Player oskar = new Player("oskar");
        Player chrisJ = new Player("chrisJ");
        Player suNny = new Player("suNny");
        Player STYKO = new Player("STYKO");
        Player ropz = new Player("ropz");
        Player device = new Player("device");
        Player Kjaerbye = new Player("Kjaerbye");
        Player Xyp9x = new Player("Xyp9x");
        Player dupreeh = new Player("dupreeh");
        Player gla1ve = new Player("gla1ve");
        Player gobb = new Player("gob b");
        Player LEGIJA = new Player("LEGIJA");
        Player tabseN = new Player("tabseN");
        Player keev = new Player("keev");
        Player nex = new Player("nex");
        Player AdreN = new Player("AdreN");
        Player Dosia = new Player("Dosia");
        Player mou = new Player("mou");
        Player Hobbit = new Player("Hobbit");
        Player fitch = new Player("fitch");
        Player valde = new Player("valde");
        Player k0nfig = new Player("k0nfig");
        Player cajunb = new Player("cajunb");
        Player MSL = new Player("MSL");
        Player aizy = new Player("aizy");
        Player FalleN = new Player("FalleN");
        Player fer = new Player("fer");
        Player coldzera = new Player("coldzera");
        Player TACO = new Player("TACO");
        Player felps = new Player("felps");
        Player TaZ = new Player("TaZ");
        Player NEO = new Player("NEO");
        Player pasha = new Player("pashaBiceps");
        Player Snax = new Player("Snax");
        Player byali = new Player("byali");
        Player KRIMZ = new Player("KRIMZ");
        Player Lekr0 = new Player("Lekr0");
        Player Golden = new Player("Golden");
        Player flusha = new Player("flusha");
        Player JW = new Player("JW");
        Player steel = new Player("steel");
        Player mertz = new Player("mertz");
        Player boltz = new Player("boltz");
        Player naSteel = new Player("steel");
        Player koosta = new Player("koosta");
        Player f0rest = new Player("f0rest");
        Player get_right = new Player("GeT_RiGhT");
        Player Xizt = new Player("Xizt");
        Player draken = new Player("draken");
        Player REZ = new Player("REZ");
        Player es3tag = new Player("es3tag");
        Player JUGi = new Player("JUGi");
        Player MODDII = new Player("MODDII");
        Player niko = new Player("niko");
        Player Snappi = new Player("Snappi");
        Player RUBINO = new Player("RUBINO");
        Player MICHU = new Player("MICHU");
        Player jkaem = new Player("jkaem");
        Player Mo = new Player("Mo");
        Player xccurate = new Player("xccurrate");
        Player DD = new Player("DD");
        Player BnTeT = new Player("BnTeT");
        Player somebody = new Player("Somebody");
        Player XigN = new Player("XigN");
        Player solo = new Player("solo");
        Player HSK = new Player("HSK");
        Player glow = new Player("glow");
        Player zeff = new Player("zeff");
        Player woxic = new Player("woxic");
        Player DeadFox = new Player("DeadFox");
        Player ANGE1 = new Player("ANGE1");
        Player bondik = new Player("bondik");
        Player HS = new Player("HS");
        Player tiziaN = new Player("tiziaN");
        Player luckeRRR = new Player("luckeRRR");
        Player twist = new Player("twist");
        Player discodoplan = new Player("disco doplan");
        Player freddieb = new Player("freddieb");
        Player hampus = new Player("hampus");
        Player Brollan = new Player("Brollan");
        Player Coffee = new Player("Coffee");
        Player lollipop21k = new Player("lollipop21k");
        Player SADZED = new Player("SADZED");
        Player boX = new Player("boX");
        Player fnyekes = new Player("fnyekes");
        Player NaToSaphiX = new Player("NaToSaphiX");
        Player DJOXiC = new Player("DJOXiC");
        Player huNter = new Player("huNter");
        Player LETN1 = new Player("LETN1");
        Player emi = new Player("emi");
        Player pNshr = new Player("pNshr");
        Player SPELLAN = new Player("SPELLAN");
        Player bubble = new Player("bubble");
        Player SHiPZ = new Player("SHiPZ");
        Player v1c7oR = new Player("v1c7oR");
        Player dennis = new Player("dennis");
        Player Hatz = new Player("Hatz");
        Player emagine = new Player("emagine");
        Player Sico = new Player("Sico");
        Player liazz = new Player("liazz");
        Player BURNRUOk = new Player("BURNRUOk");
        Player ImpressioN = new Player("ImpressioN");
        Player Tommy = new Player("Tommy");
        Player splashske = new Player("splashske");
        Player Benkai = new Player("Benkai");
        Player moxie = new Player("moxie");
        Player ViperDemon = new Player("ViperDemon");
        Player bnwGiggs = new Player("bnwGiggs");
        Player veta = new Player("veta");
        Player MAIROLLS = new Player("MAIROLLS");
        Player Kntz = new Player("Kntz");
        Player s550 = new Player("s550");
        Player dmm = new Player("dmm");
        Player ECOKING = new Player("ECOKING");
        Player Lamplight = new Player("LampLight");
        Player Gn = new Player("Gn");
        Player Jewelry = new Player("Jewelry");
        Player jackhan = new Player("jackhan");
        Player Mrsix = new Player("Mr.six");
        Player Drea3er = new Player("Drea3er");
        Player xiaosaGe = new Player("xiaosaGe");
        Player LONSDALE = new Player("LONSDALE");
        Player Gratisfaction = new Player("Gratisfaction");
        Player n1ck = new Player("n1ck");
        Player RaZ = new Player("RaZ");
        Player Sys = new Player("Sys");
        Player Eeyore = new Player("Eeyore");
        Player roseau = new Player("roseau");
        Player FrostMisty = new Player("FrostMisty");
        Player hypathor = new Player("hypathor");
        Player TENGU9 = new Player("TENGU9");
        Player CHIMEI = new Player("CHIMEI");
        Player chancehangtsz = new Player("chancehangtsz");
        Player fagger = new Player("fagger");
        Player poem = new Player("poem");
        Player takej = new Player("takej");
        Player Laz = new Player("Laz");
        Player crow = new Player("crow");
        Player barce = new Player("barce");
        Player tb = new Player("tb");
        Player HZ = new Player("HZ");
        Player advent = new Player("advent");
        Player zhokiNg = new Player("zhokiNh");
        Player Savage = new Player("Savage");
        Player Ex6TenZ = new Player("Ex6TenZ");
        Player Faris = new Player("Faris");
        Player to1nou = new Player("to1nou");
        Player YOUYOU = new Player("YOUYOU");
        Player kioShiMa = new Player("kioShiMa");
        Player hAdji = new Player("hAdji");
        Player Kairi = new Player("Kairi");
        Player loWel = new Player("loWel");
        Player EasTor = new Player("EasTor");
        Player SOKER = new Player("SOKER");
        Player mixwell = new Player("mixwell");
        Player Max0b = new Player("Max0b");
        Player Kan4 = new Player("Kan4");
        Player LoWkii = new Player("LoWkii");
        Player Polox = new Player("Polox");
        Player Maka = new Player("Maka");
        Player hooch = new Player("hooch");
        Player effys = new Player("effys");
        Player cardiac = new Player("cardiac");
        Player krZ = new Player("krZ");
        Player vek = new Player("vek");
        Player Uber = new Player("Uber");
        Player NOtA = new Player("NOtA");
        Player natsu = new Player("natsu");
        Player thyx = new Player("thyx");
        Player nOxii = new Player("n0xii");
        Player Malikof = new Player("Malikof");
        Player freakazoid = new Player("freakazoid");
        Player SileNt = new Player("SileNt");
        Player ryan = new Player("ryan");
        Player Zellsis = new Player("Zellsis");
        Player cooper = new Player("Cooper-");
        Player els = new Player("els");
        Player OCEAN = new Player("OCEAN");
        Player dsr = new Player("dsr");
        Player LILMAN = new Player("LILMAN");
        Player TenZ = new Player("TenZ");
        Player JT = new Player("JT");
        Player Detrony = new Player("Detrony");
        Player Elusive = new Player("Elusive");
        Player Sonic = new Player("Sonic");
        Player Fadey = new Player("Fadey");
        Player caike = new Player("caike");
        Player iDk = new Player("iDk");
        Player trk = new Player("trk");
        Player Maluk3 = new Player("Maluk3");
        Player mch = new Player("mch");
        Player Zote = new Player("Zote");
        Player NikoM = new Player("NikoM");
        Player Noktse = new Player("Noktse");
        Player nbl = new Player("nbl");
        Player a1962 = new Player("1962");
        Player auman = new Player("auman");
        Player Ayeon = new Player("Ayeon");
        Player S0tF1k = new Player("S0tF1k");
        Player COLDYY1 = new Player("COLDYY1");
        Player somedieyoung = new Player("somedieyoung");
        Player DavCost = new Player("DavCost");
        Player Dima = new Player("Dima");
        Player Tomkeejs = new Player("Tomkeejs");
        Player EYO = new Player("EYO");
        Player capseN = new Player("capseN");
        Player Tusi = new Player("Tusi");
        Player beastik = new Player("beastik");
        Player fleav = new Player("fleav");
        Player Theelive = new Player("The eLiVe");
        Player gabesson = new Player("gabesson");
        Player Zero = new Player("Zero");
        Player kolor = new Player("kolor");
        Player ISSAA = new Player("ISSAA");
        Player ponczek = new Player("ponczek");
        Player Goofy = new Player("Goofy");
        Player tecek = new Player("tecek");
        Player SOON = new Player("SOON");
        Player stark = new Player("stark");
        Player TENZKI = new Player("TENZKI");
        Player AcilioN = new Player("AcilioN");
        Player nexa = new Player("nexa");
        Player EspiranTo = new Player("EspiranTo");
        Player nukkye = new Player("nukkye");
        Player Impulse = new Player("Impulse");
        Player NENO = new Player("NENO");
        Player mouz = new Player("mouz");
        Player MINISE = new Player("MINISE");
        Player rallen = new Player("rallen");
        Player reatz = new Player("reatz");
        Player erkaSt = new Player("erkaSt");
        Player Dickstacy = new Player("Dickstacy");
        Player dexter = new Player("dexter");
        Player refrezh = new Player("refrezh");
        Player stavn = new Player("stavn");
        Player dragonfly = new Player("dragonfly");
        Player Bubski = new Player("Bubski");
        Player torben = new Player("torben");
        Player FREDDyFROG = new Player("FREDDyFROG");
        Player Baaten = new Player("Baaten");
        Player Relaxa = new Player("Relaxa");
        Player PlesseN = new Player("PlesseN");
        Player kreaz = new Player("kreaz");
        Player liTTle = new Player("liTTle");
        Player Jerry = new Player("Jerry");
        Player facecrack = new Player("facecrack");
        Player scoobyxie = new Player("scoobyxie");
        Player svyat = new Player("svyat");
        Player FNS = new Player("FNS");
        Player dobu = new Player("dobu");
        Player kabal = new Player("kabal");
        Player PTC = new Player("PTC");
        Player forget = new Player("forget");
        Player bottle = new Player("bottle");
        Player ayaya = new Player("ayaya");
        Player shuadapai = new Player("shuadapai");
        Player AE = new Player("AE");
        Player Mrmao = new Player("Mr.mao");
        Player smooya = new Player("smooya");
        Player w1nt3r = new Player("w1nt3r");
        Player FugLy = new Player("FugLy");
        Player Brehze = new Player("Brehze");
        Player nahtE = new Player("nahtE");
        Player CeRq = new Player("CeRq");
        Player daps = new Player("daps");
        Player BL1TZ = new Player("BL1TZ");
        Player Lacore = new Player("Lacore");
        Player stat = new Player("stat");
        Player soju_j = new Player("soju_j");
        Player ap0c = new Player("ap0c");
        Player flickz = new Player("flickz");
        Player Texta = new Player("Texta");
        Player sterling = new Player("sterling");
        Player bld = new Player("bld");
        Player zqkS = new Player("zqkS");
        Player xand = new Player("xand");
        Player dukeN = new Player("dukeN");
        Player delboNi = new Player("delboNi");
        Player Relyks = new Player("Relyks");
        Player DESPE = new Player("DESPE");
        Player friberg = new Player("friberg");
        Player cromen = new Player("cromen");
        Player exit = new Player("exit");
        Player leo_druNky = new Player("leo_druNky");
        Player RCF = new Player("RCF");
        Player jnt = new Player("jnt");
        Player nak = new Player("nak");
        Player gade = new Player("gade");
        Player Freeman = new Player("Freeman");
        Player yel = new Player("yel");
        Player PKL = new Player("PKL");
        Player SHOOWTiME = new Player("SHOOWTiME");
        Player nekiz = new Player("nekiz");
        Player dephh = new Player("dephh");
        Player stanislaw = new Player("stanislaw");
        Player yay = new Player("yay");
        Player ANDROID = new Player("ANDROID");
        Player cadiaN = new Player("cadiaN");
        Player Rickeh = new Player("Rickeh");
        Player vice = new Player("vice");
        Player Hiko = new Player("Hiko");
        Player syrsoN = new Player("syrsoN");
        Player HUNDEN = new Player("HUNDEN");
        Player sftN = new Player("sftN");
        Player Console = new Player("Console");
        Player k1to = new Player("k1to");
        Player allu = new Player("allu");
        Player Aerial = new Player("Aerial");
        Player xseveN = new Player("xseveN");
        Player Aleksib = new Player("Aleksib");
        Player sergej = new Player("sergej");
        Player bitchiR = new Player("bitchiR");
        Player sperr = new Player("sperr");
        Player ViztA = new Player("VizrA");
        Player shokz = new Player("shokz");
        Player Dodz = new Player("Dodz");
        Player SmithZz = new Player("SmithZz");
        Player meisoN = new Player("meisoN");
        Player mopoz = new Player("mopoz");
        Player donQ = new Player("donQ");
        Player MUTiRiS = new Player("MUTiRiS");
        Player dragunov = new Player("dragunov");
        Player fox = new Player("fox");
        Player cheti = new Player("cheti");
        Player obj = new Player("obj");
        Player arki = new Player("arki");
        Player rmn = new Player("rmn");
        Player KILLDREAM = new Player("KILLDREAM");
        Player ALEX = new Player("ALEX");
        Player n0thing = new Player("n0thing");
        Player Subroza = new Player("Subroza");
        Player Wardell = new Player("Wardell");
        Player bit = new Player("bit");
        Player fnx = new Player("fnx");
        Player kNg = new Player("kNgV-");
        Player chelo = new Player("chelo");
        Player minixeta = new Player("minixeta");
        Player m1tch = new Player("m1tch");
        Player Infinite = new Player("Infinite");
        Player ptr = new Player("ptr");
        Player ryx = new Player("ryx");
        Player spacca = new Player("spacca");
        Player arT = new Player("arT");
        Player yuurih = new Player("yuurih");
        Player VINI = new Player("VINI");
        Player kscerato = new Player("kscerato");
        Player ub1que = new Player("ub1que");
        Player spiker = new Player("spiker");
        Player NickelBack = new Player("NickelBack");
        Player YEKINDAR = new Player("YEKINDAr");
        Player propleh = new Player("propleh");
        Player Jyo = new Player("Jyo");
        Player redhide = new Player("redhide");
        Player fejtZ = new Player("fejtZ");
        Player a1uke = new Player("1uke");
        Player rommi = new Player("rommi");
        Player almazer = new Player("almazer");
        Player xsepower = new Player("xsepower");
        Player malik = new Player("malik");
        Player AiyvaN = new Player("AiyvaN");
        Player def = new Player("def");
        Player Flarich = new Player("Flarich");
        Player kenzor = new Player("kenzor");
        Player morelz = new Player("morelz");
        Player HEN1 = new Player("HEN1");
        Player LUCAS1 = new Player("LUCAS1");
        Player z8z = new Player("z8z");
        Player Bobosaur = new Player("Bobosaur");
        Player LaNrefNi = new Player("LaNrefNi");
        Player Nertz = new Player("Nertz");
        Player shp3x = new Player("shp3x");
        Player anarkez = new Player("anarkez");
        Player ponkt = new Player("ponkt");
        Player yam = new Player("yam");
        Player zewsky = new Player("zewsky");
        Player ofnu = new Player("ofnu");
        Player QKA = new Player("QKA");
        Player insanity = new Player("insanity");
        Player JaCkz = new Player("JaCkz");
        Player Davidp = new Player("Davidp");
        Player Lucky = new Player("Lucky");
        Player JiNKZ = new Player("JiNKZ");
        Player sycrone = new Player("sycrone");
        Player PERCY = new Player("PERCY");
        Player SZPERO = new Player("SZPERO");
        Player mistou = new Player("mistou");
        Player glace = new Player("glace");
        Player diUP = new Player("di^");
        Player sancz = new Player("sancz");
        Player aKis = new Player("aKis");
        Player ichibaNNN = new Player("ichibaNNN");
        Player blade = new Player("blade");
        Player virtus = new Player("virtus");
        Player Toy = new Player("Toy");
        Player SEMPHIS = new Player("SEMPHIS");
        Player wizard = new Player("wizard");
        Player church = new Player("church");
        Player sonic = new Player("sonic");
        Player InfrequeNt = new Player("InfrequeNt");
        Player bLacKpoisoN = new Player("bLacKpoisoN");
        Player Golz = new Player("Golz");
        Player dreaM = new Player("dreaM");
        Player fANTASTIKA = new Player("fANTASTIKA");
        Player keeN = new Player("keeN");
        Player Ramz1k = new Player("Ramz1k");
        Player Zeroi = new Player("0i");
        Player Rita = new Player("Rita");
        Player Mh = new Player("Mh");
        Player acAp = new Player("acAp");
        Player xevR = new Player("xevR");
        Player aimaNNN = new Player("aimaNNN");
        Player pkZID = new Player("pkZ!D");
        Player TunGY = new Player("TunGY");
        Player Darkkis = new Player("Darkkis");
        Player Svbb = new Player("Svbb");
        Player krbl = new Player("krbl");
        Player qqGOD = new Player("qqGOD");
        Player Olivia = new Player("Olivia");
        Player Leaf = new Player("Lead");
        Player TOR = new Player("TOR");
        Player stk = new Player("stk");
        Player Slemmy = new Player("Slemmy");
        Player kaboose = new Player("kaboose");
        Player no_one = new Player("no_one");
        Player knc1 = new Player("knc1");
        Player DAVEY = new Player("DAVEY");
        Player SecretAgent = new Player("SecretAgent");
        Player MarKE = new Player("MarKE");
        Player k1Nky = new Player("k1Nky");
        Player Chuti = new Player("Chuti");
        Player spaydeR = new Player("spaydeR");
        Player pava = new Player("pava");
        Player AlaNDieg0R = new Player("AlaNDieg0R");
        Player bt0 = new Player("bt0");
        Player sam_A = new Player("sam_A");
        Player sickLy = new Player("sickLy");
        Player spamzz = new Player("spamzz");
        Player Daveys = new Player("Daveys");
        Player points = new Player("points");
        Player Tio = new Player("Tio");
        Player LinKz = new Player("LinKz");
        Player Proxure = new Player("Proxure");
        Player feLiZnOJkE = new Player("feLiZnOJkE");
        Player FiReMaNNN = new Player("FiReMaNNN");
        Player smike = new Player("smike");
        Player crush = new Player("crush");
        Player Shara = new Player("Shara");
        Player arch = new Player("arch");
        Player sAw = new Player("sAw");
        Player ZOREE = new Player("ZOREE");
        Player SAGGERTON = new Player("SAGGERTON");
        Player mini = new Player("mini");
        Player Maiko = new Player("Maiko");
        Player SasuKe = new Player("SasuKe");
        Player BARBARR = new Player("BARBARR");
        Player hardstyle = new Player("hardstyle");
        Player tonyblack = new Player("tonyblack");
        Player pounh = new Player("pounh");
        Player RuStY = new Player("RuStY");
        Player ToM223 = new Player("ToM223");
        Player MOLSI = new Player("MOLSI");
        Player lunAtic = new Player("lunAtic");
        Player darko = new Player("darko");
        Player Vegi = new Player("Vegi");
        Player frei = new Player("frei");
        Player blameF = new Player("blameF");
        Player CRUC1AL = new Player("CRUC1AL");
        Player Surreal = new Player("Surreal");
        Player LOGAN = new Player("LOGAN");
        Player Viva = new Player("Viva");
        //</editor-fold>

        //<editor-fold desc="Player Array">
        /*
        players.add(tucks);
        players.add(pecks);
        players.add(aliStair);
        players.add(INS);
        players.add(malta);
        players.add(TOAO);
        players.add(phr);
        players.add(Furlan);
        players.add(GruBy);
        players.add(snatchie);
        players.add(DEV7L);
        players.add(frozen);
        players.add(MonttY);
        players.add(queztone);
        players.add(ZEDKO);
        players.add(MAJ3R);
        players.add(XANTARES);
        players.add(Calyx);
        players.add(paz);
        players.add(ngiN);
        players.add(Magisk);
        players.add(dazzLe);
        players.add(Jonji);
        players.add(moose);
        players.add(Ace);
        players.add(vSa);
        players.add(Grim);
        players.add(mCe);
        players.add(xCeed);
        players.add(Voltage);
        players.add(Snakes);
        players.add(swag);
        players.add(AZK);
        players.add(witmer);
        players.add(pollo);
        players.add(dapr);
        players.add(MAKKA);
        players.add(ShoT_UP);
        players.add(Oderus);
        players.add(neptune);
        players.add(Douglas);
        players.add(Twistzz);
        players.add(zews);
        players.add(nitr0);
        players.add(jdm64);
        players.add(EliGE);
        players.add(seangares);
        players.add(ShahZam);
        players.add(SicK);
        players.add(AmaNEk);
        players.add(devoduvek);
        players.add(USTILO);
        players.add(Nifty);
        players.add(jks);
        players.add(AZR);
        players.add(NAF);
        players.add(Summer);
        players.add(AttackeR);
        players.add(Karsa);
        players.add(kaze);
        players.add(LOVEYY);
        players.add(KrizzeN);
        players.add(qikert);
        players.add(Jame);
        players.add(dimasick);
        players.add(buster);
        players.add(jmqa);
        players.add(Kvik);
        players.add(waterfaLLZ);
        players.add(Boombl4);
        players.add(balblna);
        players.add(SIXER);
        players.add(RpK);
        players.add(ScreaM);
        players.add(Happy);
        players.add(xms);
        players.add(tarik);
        players.add(autimatic);
        players.add(stew);
        players.add(Skadoodle);
        players.add(RUSH);
        players.add(karrigan);
        players.add(olof);
        players.add(GuardiaN);
        players.add(NiKo);
        players.add(rain);
        players.add(seized);
        players.add(WorldEdit);
        players.add(wayLander);
        players.add(markeloff);
        players.add(B1ad3);
        players.add(bodyy);
        players.add(shox);
        players.add(kennyS);
        players.add(NBK);
        players.add(apEX);
        players.add(Edward);
        players.add(Zeus);
        players.add(flamie);
        players.add(s1mple);
        players.add(electronic);
        players.add(Spiidi);
        players.add(denis);
        players.add(zehN);
        players.add(innocent);
        players.add(kRYSTAL);
        players.add(chopper);
        players.add(jR);
        players.add(keshandr);
        players.add(mir);
        players.add(hutji);
        players.add(oskar);
        players.add(chrisJ);
        players.add(suNny);
        players.add(STYKO);
        players.add(ropz);
        players.add(device);
        players.add(Kjaerbye);
        players.add(Xyp9x);
        players.add(dupreeh);
        players.add(gla1ve);
        players.add(gobb);
        players.add(LEGIJA);
        players.add(keev);
        players.add(tabseN);
        players.add(nex);
        players.add(AdreN);
        players.add(Dosia);
        players.add(mou);
        players.add(Hobbit);
        players.add(fitch);
        players.add(valde);
        players.add(k0nfig);
        players.add(cajunb);
        players.add(MSL);
        players.add(aizy);
        players.add(FalleN);
        players.add(fer);
        players.add(coldzera);
        players.add(TACO);
        players.add(felps);
        players.add(TaZ);
        players.add(NEO);
        players.add(pasha);
        players.add(Snax);
        players.add(byali);
        players.add(KRIMZ);
        players.add(Lekr0);
        players.add(Golden);
        players.add(flusha);
        players.add(JW);
        players.add(steel);
        players.add(mertz);
        players.add(boltz);
        players.add(naSteel);
        players.add(koosta);
        players.add(f0rest);
        players.add(get_right);
        players.add(Xizt);
        players.add(draken);
        players.add(REZ);
        players.add(es3tag);
        players.add(JUGi);
        players.add(MODDII);
        players.add(niko);
        players.add(Snappi);
        players.add(RUBINO);
        players.add(MICHU);
        players.add(jkaem);
        players.add(Mo);
        players.add(DD);
        players.add(xccurate);
        players.add(BnTeT);
        players.add(somebody);
        players.add(XigN);
        players.add(solo);
        players.add(HSK);
        players.add(glow);
        players.add(zeff);
        players.add(woxic);
        players.add(DeadFox);
        players.add(ANGE1);
        players.add(bondik);
        players.add(HS);
        players.add(tiziaN);
        players.add(luckeRRR);
        players.add(twist);
        players.add(discodoplan);
        players.add(freddieb);
        players.add(hampus);
        players.add(Brollan);
        players.add(Coffee);
        players.add(lollipop21k);
        players.add(SADZED);
        players.add(boX);
        players.add(fnyekes);
        players.add(NaToSaphiX);
        players.add(DJOXiC);
        players.add(huNter);
        players.add(LETN1);
        players.add(emi);
        players.add(pNshr);
        players.add(SPELLAN);
        players.add(bubble);
        players.add(SHiPZ);
        players.add(v1c7oR);
        players.add(dennis);
        players.add(Hatz);
        players.add(emagine);
        players.add(Sico);
        players.add(liazz);
        players.add(BURNRUOk);
        players.add(ImpressioN);
        players.add(Tommy);
        players.add(splashske);
        players.add(Benkai);
        players.add(moxie);
        players.add(ViperDemon);
        players.add(bnwGiggs);
        players.add(veta);
        players.add(MAIROLLS);
        players.add(Kntz);
        players.add(s550);
        players.add(dmm);
        players.add(ECOKING);
        players.add(Lamplight);
        players.add(Gn);
        players.add(Jewelry);
        players.add(jackhan);
        players.add(Mrsix);
        players.add(Drea3er);
        players.add(xiaosaGe);
        players.add(LONSDALE);
        players.add(Gratisfaction);
        players.add(n1ck);
        players.add(RaZ);
        players.add(Sys);
        players.add(Eeyore);
        players.add(roseau);
        players.add(FrostMisty);
        players.add(hypathor);
        players.add(TENGU9);
        players.add(CHIMEI);
        players.add(chancehangtsz);
        players.add(fagger);
        players.add(poem);
        players.add(takej);
        players.add(Laz);
        players.add(crow);
        players.add(barce);
        players.add(tb);
        players.add(advent);
        players.add(HZ);
        players.add(zhokiNg);
        players.add(Savage);
        players.add(Ex6TenZ);
        players.add(Faris);
        players.add(to1nou);
        players.add(YOUYOU);
        players.add(kioShiMa);
        players.add(hAdji);
        players.add(Kairi);
        players.add(loWel);
        players.add(EasTor);
        players.add(SOKER);
        players.add(mixwell);
        players.add(Max0b);
        players.add(Kan4);
        players.add(LoWkii);
        players.add(Polox);
        players.add(Maka);
        players.add(hooch);
        players.add(effys);
        players.add(cardiac);
        players.add(krZ);
        players.add(vek);
        players.add(Uber);
        players.add(NOtA);
        players.add(natsu);
        players.add(thyx);
        players.add(nOxii);
        players.add(Malikof);
        players.add(freakazoid);
        players.add(SileNt);
        players.add(ryan);
        players.add(Zellsis);
        players.add(cooper);
        players.add(els);
        players.add(OCEAN);
        players.add(dsr);
        players.add(LILMAN);
        players.add(TenZ);
        players.add(JT);
        players.add(Detrony);
        players.add(Elusive);
        players.add(Sonic);
        players.add(Fadey);
        players.add(caike);
        players.add(iDk);
        players.add(trk);
        players.add(Maluk3);
        players.add(mch);
        players.add(Zote);
        players.add(NikoM);
        players.add(nbl);
        players.add(Noktse);
        players.add(a1962);
        players.add(auman);
        players.add(Ayeon);
        players.add(S0tF1k);
        players.add(COLDYY1);
        players.add(somedieyoung);
        players.add(DavCost);
        players.add(Dima);
        players.add(Tomkeejs);
        players.add(EYO);
        players.add(capseN);
        players.add(Tusi);
        players.add(beastik);
        players.add(fleav);
        players.add(Theelive);
        players.add(gabesson);
        players.add(Zero);
        players.add(kolor);
        players.add(ISSAA);
        players.add(ponczek);
        players.add(Goofy);
        players.add(tecek);
        players.add(SOON);
        players.add(stark);
        players.add(TENZKI);
        players.add(AcilioN);
        players.add(nexa);
        players.add(EspiranTo);
        players.add(nukkye);
        players.add(Impulse);
        players.add(NENO);
        players.add(mouz);
        players.add(MINISE);
        players.add(rallen);
        players.add(reatz);
        players.add(erkaSt);
        players.add(Dickstacy);
        players.add(dexter);
        players.add(refrezh);
        players.add(stavn);
        players.add(dragonfly);
        players.add(Bubski);
        players.add(torben);
        players.add(FREDDyFROG);
        players.add(Baaten);
        players.add(Relaxa);
        players.add(PlesseN);
        players.add(kreaz);
        players.add(liTTle);
        players.add(Jerry);
        players.add(facecrack);
        players.add(scoobyxie);
        players.add(svyat);
        players.add(FNS);
        players.add(dobu);
        players.add(kabal);
        players.add(PTC);
        players.add(forget);
        players.add(bottle);
        players.add(ayaya);
        players.add(shuadapai);
        players.add(AE);
        players.add(Mrmao);
        players.add(smooya);
        players.add(w1nt3r);
        players.add(FugLy);
        players.add(Brehze);
        players.add(nahtE);
        players.add(CeRq);
        players.add(daps);
        players.add(BL1TZ);
        players.add(Lacore);
        players.add(stat);
        players.add(soju_j);
        players.add(ap0c);
        players.add(flickz);
        players.add(Texta);
        players.add(sterling);
        players.add(bld);
        players.add(zqkS);
        players.add(xand);
        players.add(dukeN);
        players.add(delboNi);
        players.add(Relyks);
        players.add(DESPE);
        players.add(cromen);
        players.add(friberg);
        players.add(exit);
        players.add(leo_druNky);
        players.add(RCF);
        players.add(jnt);
        players.add(nak);
        players.add(gade);
        players.add(Freeman);
        players.add(yel);
        players.add(PKL);
        players.add(SHOOWTiME);
        players.add(nekiz);
        players.add(dephh);
        players.add(stanislaw);
        players.add(yay);
        players.add(ANDROID);
        players.add(cadiaN);
        players.add(Rickeh);
        players.add(vice);
        players.add(Hiko);
        players.add(syrsoN);
        players.add(HUNDEN);
        players.add(sftN);
        players.add(Console);
        players.add(k1to);
        players.add(allu);
        players.add(Aerial);
        players.add(xseveN);
        players.add(Aleksib);
        players.add(sergej);
        players.add(bitchiR);
        players.add(sperr);
        players.add(ViztA);
        players.add(shokz);
        players.add(Dodz);
        players.add(SmithZz);
        players.add(meisoN);
        players.add(mopoz);
        players.add(donQ);
        players.add(MUTiRiS);
        players.add(dragunov);
        players.add(fox);
        players.add(cheti);
        players.add(obj);
        players.add(arki);
        players.add(rmn);
        players.add(KILLDREAM);
        players.add(ALEX);
        players.add(n0thing);
        players.add(Subroza);
        players.add(Wardell);
        players.add(bit);
        players.add(fnx);
        players.add(kNg);
        players.add(chelo);
        players.add(minixeta);
        players.add(m1tch);
        players.add(Infinite);
        players.add(ptr);
        players.add(ryx);
        players.add(spacca);
        players.add(arT);
        players.add(yuurih);
        players.add(VINI);
        players.add(kscerato);
        players.add(ub1que);
        players.add(spiker);
        players.add(NickelBack);
        players.add(YEKINDAR);
        players.add(propleh);
        players.add(Jyo);
        players.add(redhide);
        players.add(fejtZ);
        players.add(a1uke);
        players.add(rommi);
        players.add(almazer);
        players.add(xsepower);
        players.add(malik);
        players.add(AiyvaN);
        players.add(def);
        players.add(Flarich);
        players.add(kenzor);
        players.add(morelz);
        players.add(HEN1);
        players.add(LUCAS1);
        players.add(z8z);
        players.add(Bobosaur);
        players.add(LaNrefNi);
        players.add(Nertz);
        players.add(shp3x);
        players.add(anarkez);
        players.add(ponkt);
        players.add(yam);
        players.add(zewsky);
        players.add(ofnu);
        players.add(QKA);
        players.add(insanity);
        players.add(JaCkz);
        players.add(Davidp);
        players.add(Lucky);
        players.add(JiNKZ);
        players.add(sycrone);
        players.add(PERCY);
        players.add(SZPERO);
        players.add(mistou);
        players.add(glace);
        players.add(diUP);
        players.add(sancz);
        players.add(aKis);
        players.add(ichibaNNN);
        players.add(blade);
        players.add(virtus);
        players.add(Toy);
        players.add(SEMPHIS);
        players.add(wizard);
        players.add(church);
        players.add(sonic);
        players.add(InfrequeNt);
        players.add(bLacKpoisoN);
        players.add(Golz);
        players.add(dreaM);
        players.add(fANTASTIKA);
        players.add(keeN);
        players.add(Ramz1k);
        players.add(Rita);
        players.add(Zeroi);
        players.add(Mh);
        players.add(acAp);
        players.add(xevR);
        players.add(aimaNNN);
        players.add(pkZID);
        players.add(TunGY);
        players.add(Darkkis);
        players.add(Svbb);
        players.add(krbl);
        players.add(qqGOD);
        players.add(Olivia);
        players.add(Leaf);
        players.add(TOR);
        players.add(stk);
        players.add(Slemmy);
        players.add(kaboose);
        players.add(no_one);
        players.add(knc1);
        players.add(DAVEY);
        players.add(SecretAgent);
        players.add(MarKE);
        players.add(k1Nky);
        players.add(Chuti);
        players.add(spaydeR);
        players.add(pava);
        players.add(AlaNDieg0R);
        players.add(bt0);
        players.add(sam_A);
        players.add(sickLy);
        players.add(spamzz);
        players.add(Daveys);
        players.add(points);
        players.add(Tio);
        players.add(LinKz);
        players.add(Proxure);
        players.add(feLiZnOJkE);
        players.add(FiReMaNNN);
        players.add(smike);
        players.add(crush);
        players.add(Shara);
        players.add(arch);
        players.add(sAw);
        players.add(ZOREE);
        players.add(SAGGERTON);
        players.add(mini);
        players.add(Maiko);
        players.add(SasuKe);
        players.add(BARBARR);
        players.add(hardstyle);
        players.add(tonyblack);
        players.add(pounh);
        players.add(RuStY);
        players.add(ToM223);
        players.add(MOLSI);
        players.add(lunAtic);
        players.add(darko);
        players.add(Vegi);
        players.add(frei);
        players.add(blameF);
        players.add(LOGAN);
        players.add(CRUC1AL);
        players.add(Surreal);
        players.add(Viva);
        */

        //</editor-fold>

        //<editor-fold desc="Teams">
        Team Chiefs = new Team("Chiefs");
        Team AGO = new Team("AGO");
        Team eXtatus = new Team("eXtatus");
        Team Space_Soldiers = new Team("Space Soldiers");
        Team Rise_Nation = new Team("Rise Nation");
        Team SoaR = new Team("SoaR");
        Team GX = new Team("GX");
        Team Ghost_Academy = new Team("Ghost Academy");
        Team Liquid = new Team("Liquid");
        Team Misfits = new Team("Misfits");
        Team Renegades = new Team("Renegades");
        Team Flash = new Team("Flash Gaming");
        Team AVANGAR = new Team("AVANGAR");
        Team QBFire = new Team("Quantum Bellator Fire");
        Team EnVyUs = new Team("EnVyUs");
        Team cloud9 = new Team("Cloud 9");
        Team FaZe = new Team("FaZe Clan");
        Team f3 = new Team("FlipSiz3");
        Team g2 = new Team("G2");
        Team NaVi = new Team("Natus Vincere");
        Team Sprout = new Team("Sprout");
        Team vega = new Team("Vega Squadron");
        Team mouse = new Team("mousesports");
        Team Astralis = new Team("Astralis");
        Team BIG = new Team("BIG");
        Team Gambit = new Team("Gambit");
        Team North = new Team("North");
        Team SK = new Team("SK Gaming");
        Team VP = new Team("Virtus Pro");
        Team fnatic = new Team("fnatic");
        Team Torqued = new Team("Torqued");
        Team nip = new Team("Ninjas in Pyjamas");
        Team Heroic = new Team("Heroic");
        Team Tyloo = new Team("TyLoo");
        Team MVPPK = new Team("MVP PK");
        Team HellRaisers = new Team("HellRaisers");
        Team GODSENT = new Team("GODSENT");
        Team GoodJob = new Team("GoodJob");
        Team Valiance = new Team("Valiance");
        Team Windigo = new Team("Windigo");
        Team ORDER = new Team("ORDER");
        Team BOOTds = new Team("BOOT-d[S]");
        Team AlphaRed = new Team("Alpha Red");
        Team MAX = new Team("MAX");
        Team New4 = new Team("New4");
        Team Parallax = new Team("Parallax");
        Team Recca = new Team("Recca");
        Team EMC = new Team("EMC");
        Team SCARZ = new Team("SCARZ Absolute");
        Team ViCi = new Team("ViCi");
        Team Ukraine = new Team("Ukraine");
        Team Belgium = new Team("Belgium");
        Team Wololos = new Team("Wololos");
        Team Limitless = new Team("Limitless");
        Team Russia = new Team("Russia");
        Team Onliners = new Team("The Onliners");
        Team VivaAlgeria = new Team("Viva Algeria");
        Team SwolePatrol = new Team("Swole Patrol");
        Team subtLe = new Team("subtLe");
        Team Bravado = new Team("Bravado");
        Team TeamOne = new Team("TeamOne");
        Team Isurus = new Team("Isurus");
        Team Spirit = new Team("Spirit");
        Team DarkTigers = new Team("Dark Tigers");
        Team GameAgents = new Team("GameAgents");
        Team xkom = new Team("x-kom");
        Team Imperial = new Team("Imperial");
        Team Kinguin = new Team("Kinguin");
        Team Grayhound = new Team("Grayhound");
        Team Fragsters = new Team("Fragsters");
        Team RedReserve = new Team("Red Reserve");
        Team forZe = new Team("forZe");
        Team FivePower = new Team("5POWER");
        Team Eclipse = new Team("Eclipse");
        Team NRG = new Team("NRG");
        Team Legacy = new Team("Legacy");
        Team YeaH = new Team("YeaH!");
        Team eUnited = new Team("eUnited");
        Team Sharks = new Team("Sharks");
        Team OpTic = new Team("OpTic");
        Team Luminosity = new Team("Luminosity");
        Team complexity = new Team("compLexity");
        Team Rogue = new Team("Rogue");
        Team ALTERNATE = new Team("ALTERNATE aTTaX");
        Team ENCE = new Team("ENCE");
        Team WASD = new Team("WASD");
        Team Movistar = new Team("Movistar Riders");
        Team TempoStorm = new Team("Tempo Storm");
        Team Giants = new Team("Giants");
        Team Ghost = new Team("Ghost");
        Team NTC = new Team("Nao Tem Como");
        Team Dignitas = new Team("Dignitas");
        Team FURIA = new Team("FURIA");
        Team Monolith = new Team("Monolith");
        Team PLINK = new Team("PLINK");
        Team pro100 = new Team("pro100");
        Team Uniquestars = new Team("Uniquestars");
        Team TaintedMinds = new Team("Tainted Minds");
        Team ThreeDMax = new Team("3DMAX");
        Team TSM = new Team("TSM");
        Team Rush = new Team("Rush");
        Team LDLC = new Team("LDLC");
        Team MuffinLightning = new Team("Muffin Lightning");
        Team K23 = new Team("K23");
        Team FIVE = new Team("FIVE");
        Team CyberZen = new Team("CyberZen");
        Team PACT = new Team("PACT");
        Team Epsilon = new Team("Epsilon");

        teams.add(Chiefs);
        teams.add(AGO);
        teams.add(eXtatus);
        teams.add(Space_Soldiers);
        teams.add(Rise_Nation);
        teams.add(SoaR);
        teams.add(GX);
        teams.add(Ghost_Academy);
        teams.add(Liquid);
        teams.add(Misfits);
        teams.add(Renegades);
        teams.add(Flash);
        teams.add(AVANGAR);
        teams.add(QBFire);
        teams.add(EnVyUs);
        teams.add(cloud9);
        teams.add(FaZe);
        teams.add(f3);
        teams.add(g2);
        teams.add(NaVi);
        teams.add(Sprout);
        teams.add(vega);
        teams.add(mouse);
        teams.add(Astralis);
        teams.add(BIG);
        teams.add(Gambit);
        teams.add(North);
        teams.add(SK);
        teams.add(VP);
        teams.add(fnatic);
        teams.add(Torqued);
        teams.add(nip);
        teams.add(Heroic);
        teams.add(Tyloo);
        teams.add(MVPPK);
        teams.add(HellRaisers);
        teams.add(GODSENT);
        teams.add(GoodJob);
        teams.add(Valiance);
        teams.add(Windigo);
        teams.add(ORDER);
        teams.add(BOOTds);
        teams.add(AlphaRed);
        teams.add(MAX);
        teams.add(New4);
        teams.add(Parallax);
        teams.add(Recca);
        teams.add(EMC);
        teams.add(SCARZ);
        teams.add(ViCi);
        teams.add(Ukraine);
        teams.add(Belgium);
        teams.add(Russia);
        teams.add(Wololos);
        teams.add(Limitless);
        teams.add(Onliners);
        teams.add(VivaAlgeria);
        teams.add(SwolePatrol);
        teams.add(subtLe);
        teams.add(Bravado);
        teams.add(TeamOne);
        teams.add(Isurus);
        teams.add(Spirit);
        teams.add(DarkTigers);
        teams.add(GameAgents);
        teams.add(xkom);
        teams.add(Imperial);
        teams.add(Kinguin);
        teams.add(Grayhound);
        teams.add(Fragsters);
        teams.add(RedReserve);
        teams.add(forZe);
        teams.add(FivePower);
        teams.add(Eclipse);
        teams.add(NRG);
        teams.add(Legacy);
        teams.add(YeaH);
        teams.add(eUnited);
        teams.add(Sharks);
        teams.add(OpTic);
        teams.add(Luminosity);
        teams.add(complexity);
        teams.add(Rogue);
        teams.add(ALTERNATE);
        teams.add(ENCE);
        teams.add(WASD);
        teams.add(Movistar);
        teams.add(TempoStorm);
        teams.add(Giants);
        teams.add(Ghost);
        teams.add(NTC);
        teams.add(Dignitas);
        teams.add(FURIA);
        teams.add(Monolith);
        teams.add(PLINK);
        teams.add(pro100);
        teams.add(Uniquestars);
        teams.add(TaintedMinds);
        teams.add(ThreeDMax);
        teams.add(LDLC);
        teams.add(Rush);
        teams.add(TSM);
        teams.add(MuffinLightning);
        teams.add(PACT);
        teams.add(Epsilon);

        Team MIBR = SK;
        Team Winstrike =  QBFire;
        //</editor-fold>

        //Before you go any further, I know that this main method is disgusting and makes you want to puke
        //I hate it too, its absolutely awful
        //But, I'm not a CS major and I don't know the best way to do this. I need to be able to reference teams and
        //  players easily without having to remember where they are in an array. It's probably best to use a
        //  dictionary, but I need to be able to sort teams based on rating to easily view the top teams.
        //If I couldn't do this, then I would need to manually look through a printout of every team (I think) and
        //  manually find the top elo. That sounds even worse, so we're stuck with this monster until you find a
        //  better solution. I'm too lazy to find one myself. I'll try to use some comments to help

        //START OF 2017
        /*
        //<editor-fold desc="ESEA MDL Season 23 Global Challenge">
        //Roster Changes
        Kinguin.addPlayer(MICHU);
        Kinguin.addPlayer(mouz);
        Kinguin.addPlayer(Furlan);
        Kinguin.addPlayer(SZPERO);
        Kinguin.addPlayer(rallen);

        LDLC.addPlayer(Ex6TenZ);
        LDLC.addPlayer(to1nou);
        LDLC.addPlayer(ALEX);
        LDLC.addPlayer(mistou);
        LDLC.addPlayer(xms);

        Rogue.addPlayer(bubble);
        Rogue.addPlayer(TENZKI);
        Rogue.addPlayer(v1c7oR);
        Rogue.addPlayer(cadiaN);
        Rogue.addPlayer(glace);

        MuffinLightning.addPlayer(diUP);
        MuffinLightning.addPlayer(SileNt);
        MuffinLightning.addPlayer(sancz);
        MuffinLightning.addPlayer(aKis);
        MuffinLightning.addPlayer(ichibaNNN);

        Rush.addPlayer(LILMAN);
        Rush.addPlayer(blade);
        Rush.addPlayer(virtus);
        Rush.addPlayer(Toy);
        Rush.addPlayer(pollo);

        TSM.addPlayer(SicK);
        TSM.addPlayer(Twistzz);
        TSM.addPlayer(SEMPHIS);
        TSM.addPlayer(FNS);
        TSM.addPlayer(Relyks);

        TaintedMinds.addPlayer(wizard);
        TaintedMinds.addPlayer(church);
        TaintedMinds.addPlayer(sonic);
        TaintedMinds.addPlayer(InfrequeNt);
        TaintedMinds.addPlayer(liazz);

        Bravado.addPlayer(bLacKpoisoN);
        Bravado.addPlayer(Detrony);
        Bravado.addPlayer(Elusive);
        Bravado.addPlayer(Golz);
        Bravado.addPlayer(Sonic);

        //Games
        m.playMatch(Bravado, TSM);
        m.playMatch(LDLC, Rogue);
        m.playMatch(TaintedMinds, Rush);
        m.playMatch(Kinguin, MuffinLightning);
        m.playMatch(LDLC, Bravado);
        m.playMatch(Kinguin, TaintedMinds);
        m.playMatch(Rogue, TSM);
        m.playMatch(Rogue, TSM);
        m.playMatch(MuffinLightning, Rush);
        m.playMatch(MuffinLightning, Rush);
        m.playMatch(Rogue, Bravado);
        m.playMatch(Rogue, Bravado);
        m.playMatch(TaintedMinds, MuffinLightning);
        m.playMatch(MuffinLightning, TaintedMinds);
        m.playMatch(TaintedMinds, MuffinLightning);
        m.playMatch(LDLC, TaintedMinds);
        m.playMatch(LDLC, TaintedMinds);
        m.playMatch(Rogue, Kinguin);
        m.playMatch(Rogue, Kinguin);
        m.playMatch(Rogue, LDLC);
        m.playMatch(Rogue, LDLC);
        //</editor-fold>

        //<editor-fold desc="WESG 2016 World Finals">
        //Roster Changes


        //Games
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        m.playMatch();
        //</editor-fold>

        //<editor-fold desc="">
        //Roster Changes


        //Games

        //</editor-fold>

        //<editor-fold desc="">
        //Roster Changes


        //Games

        //</editor-fold>

        //Clear out rosters because I'm too lazy to fix 2017 to 2018 changes
        for (Team t : teams) {
            t.removeAll();
        }
        */

        //START OF 2018

        //<editor-fold desc="This is week one, ESEA MDL Global Challenge, January 5-7th 2018">
        Chiefs.addPlayer(tucks);
        Chiefs.addPlayer(pecks);
        Chiefs.addPlayer(aliStair);
        Chiefs.addPlayer(INS);
        Chiefs.addPlayer(malta);

        AGO.addPlayer(TOAO);
        AGO.addPlayer(phr);
        AGO.addPlayer(Furlan);
        AGO.addPlayer(GruBy);
        AGO.addPlayer(snatchie);

        eXtatus.addPlayer(DEV7L);
        eXtatus.addPlayer(frozen);
        eXtatus.addPlayer(MonttY);
        eXtatus.addPlayer(queztone);
        eXtatus.addPlayer(ZEDKO);

        Space_Soldiers.addPlayer(MAJ3R);
        Space_Soldiers.addPlayer(XANTARES);
        Space_Soldiers.addPlayer(Calyx);
        Space_Soldiers.addPlayer(paz);
        Space_Soldiers.addPlayer(ngiN);

        Rise_Nation.addPlayer(dazzLe);
        Rise_Nation.addPlayer(Jonji);
        Rise_Nation.addPlayer(moose);
        Rise_Nation.addPlayer(Ace);
        Rise_Nation.addPlayer(vSa);

        SoaR.addPlayer(Grim);
        SoaR.addPlayer(mCe);
        SoaR.addPlayer(xCeed);
        SoaR.addPlayer(Voltage);
        SoaR.addPlayer(Snakes);

        GX.addPlayer(swag);
        GX.addPlayer(AZK);
        GX.addPlayer(witmer);
        GX.addPlayer(pollo);
        GX.addPlayer(dapr);

        Ghost_Academy.addPlayer(MAKKA);
        Ghost_Academy.addPlayer(ShoT_UP);
        Ghost_Academy.addPlayer(Oderus);
        Ghost_Academy.addPlayer(neptune);
        Ghost_Academy.addPlayer(Douglas);

        //Now that the teams are set up, we can run the matches that happened
        m.playMatch(AGO,Chiefs);
        m.playMatch(Space_Soldiers,Rise_Nation);
        m.playMatch(SoaR,Ghost_Academy);
        m.playMatch(eXtatus,GX);
        m.playMatch(AGO,Space_Soldiers);
        m.playMatch(eXtatus,SoaR);
        m.playMatch(Chiefs,Rise_Nation);
        m.playMatch(Ghost_Academy,GX);
        m.playMatch(Space_Soldiers,Chiefs);
        m.playMatch(Ghost_Academy,SoaR);
        //Now into bo3s
        m.playMatch(eXtatus,Space_Soldiers);
        m.playMatch(Space_Soldiers,eXtatus);
        m.playMatch(Space_Soldiers,eXtatus);
        m.playMatch(AGO,Ghost_Academy);
        m.playMatch(AGO,Ghost_Academy);
        m.playMatch(AGO,Space_Soldiers);
        m.playMatch(AGO,Space_Soldiers);
        //</editor-fold>

        //I skipped WESG Asia-pacific Qualifiers because there were 20 teams and none of them except like 2-3 matter, and
        //  even so aren't that important, I didn't want to do all that work

        //<editor-fold desc="Next is the Boston Major Qualifier, Jan 12th-15th">
        Liquid.addPlayer(Twistzz);
        Liquid.addPlayer(zews);
        Liquid.addPlayer(nitr0);
        Liquid.addPlayer(jdm64);
        Liquid.addPlayer(EliGE);

        Misfits.addPlayer(seangares);
        Misfits.addPlayer(ShahZam);
        Misfits.addPlayer(SicK);
        Misfits.addPlayer(AmaNEk);
        Misfits.addPlayer(devoduvek);

        Renegades.addPlayer(USTILO);
        Renegades.addPlayer(Nifty);
        Renegades.addPlayer(jks);
        Renegades.addPlayer(AZR);
        Renegades.addPlayer(NAF);

        Flash.addPlayer(Summer);
        Flash.addPlayer(AttackeR);
        Flash.addPlayer(Karsa);
        Flash.addPlayer(kaze);
        Flash.addPlayer(LOVEYY);

        AVANGAR.addPlayer(KrizzeN);
        AVANGAR.addPlayer(qikert);
        AVANGAR.addPlayer(Jame);
        AVANGAR.addPlayer(dimasick);
        AVANGAR.addPlayer(buster);

        QBFire.addPlayer(jmqa);
        QBFire.addPlayer(Kvik);
        QBFire.addPlayer(waterfaLLZ);
        QBFire.addPlayer(Boombl4);
        QBFire.addPlayer(balblna);

        EnVyUs.addPlayer(SIXER);
        EnVyUs.addPlayer(ScreaM);
        EnVyUs.addPlayer(Happy);
        EnVyUs.addPlayer(xms);
        EnVyUs.addPlayer(RpK);

        cloud9.addPlayer(tarik);
        cloud9.addPlayer(autimatic);
        cloud9.addPlayer(stew);
        cloud9.addPlayer(Skadoodle);
        cloud9.addPlayer(RUSH);

        FaZe.addPlayer(karrigan);
        FaZe.addPlayer(olof);
        FaZe.addPlayer(GuardiaN);
        FaZe.addPlayer(NiKo);
        FaZe.addPlayer(rain);

        f3.addPlayer(seized);
        f3.addPlayer(WorldEdit);
        f3.addPlayer(wayLander);
        f3.addPlayer(markeloff);
        f3.addPlayer(B1ad3);

        g2.addPlayer(bodyy);
        g2.addPlayer(shox);
        g2.addPlayer(kennyS);
        g2.addPlayer(NBK);
        g2.addPlayer(apEX);

        NaVi.addPlayer(Edward);
        NaVi.addPlayer(Zeus);
        NaVi.addPlayer(flamie);
        NaVi.addPlayer(s1mple);
        NaVi.addPlayer(electronic);

        Sprout.addPlayer(Spiidi);
        Sprout.addPlayer(denis);
        Sprout.addPlayer(zehN);
        Sprout.addPlayer(innocent);
        Sprout.addPlayer(kRYSTAL);

        vega.addPlayer(chopper);
        vega.addPlayer(jR);
        vega.addPlayer(keshandr);
        vega.addPlayer(mir);
        vega.addPlayer(hutji);

        mouse.addPlayer(oskar);
        mouse.addPlayer(chrisJ);
        mouse.addPlayer(suNny);
        mouse.addPlayer(STYKO);
        mouse.addPlayer(ropz);

        //Now we can get to matches
        m.playMatch(vega, Renegades);
        m.playMatch(mouse, AVANGAR);
        m.playMatch(FaZe, Liquid);
        m.playMatch(Misfits, f3);
        m.playMatch(Sprout, Space_Soldiers);
        m.playMatch(NaVi, QBFire);
        m.playMatch(g2, Flash);
        m.playMatch(cloud9, EnVyUs);
        m.playMatch(Liquid, f3);
        m.playMatch(mouse, NaVi);
        m.playMatch(Space_Soldiers, AVANGAR);
        m.playMatch(Renegades, EnVyUs);
        m.playMatch(QBFire, Flash);
        m.playMatch(cloud9, Sprout);
        m.playMatch(vega, FaZe);
        m.playMatch(g2, Misfits);
        m.playMatch(FaZe, QBFire);
        m.playMatch(EnVyUs, Flash);
        m.playMatch(Space_Soldiers, Misfits);
        m.playMatch(NaVi, Sprout);
        m.playMatch(g2, vega);
        m.playMatch(Liquid, Renegades);
        m.playMatch(AVANGAR, f3);
        m.playMatch(cloud9, mouse);
        m.playMatch(AVANGAR, Misfits);
        m.playMatch(vega, Liquid);
        m.playMatch(FaZe, NaVi);
        m.playMatch(Space_Soldiers, mouse);
        m.playMatch(Renegades, Sprout);
        m.playMatch(QBFire, EnVyUs);
        m.playMatch(mouse, Renegades);
        m.playMatch(QBFire, AVANGAR);
        m.playMatch(NaVi, Liquid);
        m.playMatch(AVANGAR, Renegades);
        m.playMatch(Liquid, AVANGAR);
        //</editor-fold>

        //<editor-fold desc="Boston Major">
        Astralis.addPlayer(device);
        Astralis.addPlayer(Kjaerbye);
        Astralis.addPlayer(Xyp9x);
        Astralis.addPlayer(dupreeh);
        Astralis.addPlayer(gla1ve);

        BIG.addPlayer(gobb);
        BIG.addPlayer(LEGIJA);
        BIG.addPlayer(tabseN);
        BIG.addPlayer(keev);
        BIG.addPlayer(nex);

        Gambit.addPlayer(AdreN);
        Gambit.addPlayer(Dosia);
        Gambit.addPlayer(mou);
        Gambit.addPlayer(Hobbit);
        Gambit.addPlayer(fitch);

        North.addPlayer(valde);
        North.addPlayer(k0nfig);
        North.addPlayer(cajunb);
        North.addPlayer(MSL);
        North.addPlayer(aizy);

        SK.addPlayer(FalleN);
        SK.addPlayer(fer);
        SK.addPlayer(coldzera);
        SK.addPlayer(TACO);
        SK.addPlayer(felps);

        VP.addPlayer(TaZ);
        VP.addPlayer(NEO);
        VP.addPlayer(pasha);
        VP.addPlayer(Snax);
        VP.addPlayer(byali);

        fnatic.addPlayer(KRIMZ);
        fnatic.addPlayer(Lekr0);
        fnatic.addPlayer(Golden);
        fnatic.addPlayer(flusha);
        fnatic.addPlayer(JW);

        //Now onto matches
        m.playMatch(vega, North);
        m.playMatch(QBFire, VP);
        m.playMatch(Liquid, BIG);
        m.playMatch(FaZe, fnatic);
        m.playMatch(mouse, Astralis);
        m.playMatch(g2, cloud9);
        m.playMatch(Gambit, NaVi);
        m.playMatch(SK, Space_Soldiers);
        m.playMatch(QBFire, Gambit);
        m.playMatch(Space_Soldiers, cloud9);
        m.playMatch(FaZe, vega);
        m.playMatch(g2, Liquid);
        m.playMatch(SK, mouse);
        m.playMatch(fnatic, VP);
        m.playMatch(NaVi, BIG);
        m.playMatch(Astralis, North);
        m.playMatch(mouse, vega);
        m.playMatch(NaVi, Liquid);
        m.playMatch(g2, QBFire);
        m.playMatch(fnatic, Astralis);
        m.playMatch(BIG, North);
        m.playMatch(FaZe, SK);
        m.playMatch(cloud9, VP);
        m.playMatch(Gambit, Space_Soldiers);
        m.playMatch(Space_Soldiers, BIG);
        m.playMatch(QBFire, mouse);
        m.playMatch(cloud9, Astralis);
        m.playMatch(vega, Liquid);
        m.playMatch(SK, Gambit);
        m.playMatch(NaVi, fnatic);
        m.playMatch(fnatic, Gambit);
        m.playMatch(cloud9, vega);
        m.playMatch(mouse, Space_Soldiers);

        //Now Into bo3
        m.playMatch(FaZe, mouse);
        m.playMatch(FaZe, mouse);
        m.playMatch(NaVi, QBFire);
        m.playMatch(NaVi, QBFire);
        m.playMatch(cloud9, g2);
        m.playMatch(cloud9, g2);
        m.playMatch(fnatic, SK);
        m.playMatch(SK, fnatic);
        m.playMatch(SK, fnatic);
        m.playMatch(FaZe, NaVi);
        m.playMatch(FaZe, NaVi);
        m.playMatch(cloud9, SK);
        m.playMatch(SK, cloud9);
        m.playMatch(cloud9, SK);
        m.playMatch(FaZe, cloud9);
        m.playMatch(cloud9, FaZe);
        m.playMatch(cloud9, FaZe);
        //</editor-fold>

        //<editor-fold desc="CS Summit 2 Feb 8th-11th">
        //Update roster Changes
        Liquid.removePlayer(zews);
        Liquid.removePlayer(jdm64);
        Liquid.addPlayer(NAF);
        Liquid.addPlayer(steel);
        Renegades.removePlayer(NAF);

        Astralis.removePlayer(Kjaerbye);
        North.removePlayer(cajunb);
        North.removePlayer(k0nfig);
        North.addPlayer(Kjaerbye);
        North.addPlayer(mertz);

        SK.removePlayer(felps);
        SK.addPlayer(boltz);

        GX.removePlayer(swag);
        GX.removePlayer(pollo);
        GX.removePlayer(AZK);

        Torqued.addPlayer(swag);
        Torqued.addPlayer(pollo);
        Torqued.addPlayer(AZK);
        Torqued.addPlayer(naSteel);
        Torqued.addPlayer(koosta);

        nip.addPlayer(f0rest);
        nip.addPlayer(get_right);
        nip.addPlayer(Xizt);
        nip.addPlayer(draken);
        nip.addPlayer(REZ);

        Heroic.addPlayer(es3tag);
        Heroic.addPlayer(JUGi);
        Heroic.addPlayer(MODDII);
        Heroic.addPlayer(niko);
        Heroic.addPlayer(Snappi);

        //Now onto matches
        m.playMatch(SK, Torqued);
        m.playMatch(SK, Torqued);
        m.playMatch(North, vega);
        m.playMatch(North, vega);
        m.playMatch(nip, Liquid);
        m.playMatch(Liquid, nip);
        m.playMatch(Liquid, nip);
        m.playMatch(cloud9, Heroic);
        m.playMatch(cloud9, Heroic);
        m.playMatch(SK, North);
        m.playMatch(SK, North);
        m.playMatch(cloud9, Liquid);
        m.playMatch(cloud9, Liquid);
        m.playMatch(Torqued, vega);
        m.playMatch(Torqued, vega);
        m.playMatch(Heroic, nip);
        m.playMatch(nip, Heroic);
        m.playMatch(Heroic, nip);
        m.playMatch(Liquid, Torqued);
        m.playMatch(Liquid, Torqued);
        m.playMatch(Heroic, North);
        m.playMatch(Heroic, North);
        m.playMatch(cloud9, SK);
        m.playMatch(cloud9, SK);
        m.playMatch(Liquid, Heroic);
        m.playMatch(Liquid, Heroic);
        m.playMatch(Liquid, SK);
        m.playMatch(Liquid, SK);
        m.playMatch(Liquid, cloud9);
        m.playMatch(Liquid, cloud9);
        m.playMatch(cloud9, Liquid);
        m.playMatch(Liquid, cloud9);
        //</editor-fold>

        //<editor-fold desc="StarSeries season 4, Feb 17th - 25th">
        //Roster Changes
        Heroic.removePlayer(es3tag);
        Heroic.addPlayer(RUBINO);

        Astralis.addPlayer(Magisk);

        VP.removePlayer(TaZ);
        VP.addPlayer(MICHU);

        Renegades.addPlayer(jkaem);

        Tyloo.addPlayer(Mo);
        Tyloo.addPlayer(xccurate);
        Tyloo.addPlayer(DD);
        Tyloo.addPlayer(BnTeT);
        Tyloo.addPlayer(somebody);

        MVPPK.addPlayer(XigN);
        MVPPK.addPlayer(solo);
        MVPPK.addPlayer(HSK);
        MVPPK.addPlayer(glow);
        MVPPK.addPlayer(zeff);

        HellRaisers.addPlayer(woxic);
        HellRaisers.addPlayer(DeadFox);
        HellRaisers.addPlayer(ANGE1);
        HellRaisers.addPlayer(bondik);
        HellRaisers.addPlayer(HS);

        //On to Matches
        m.playMatch(SK, MVPPK);
        m.playMatch(SK, MVPPK);
        m.playMatch(cloud9, Heroic);
        m.playMatch(cloud9, Heroic);
        m.playMatch(FaZe, Tyloo);
        m.playMatch(FaZe, Tyloo);
        m.playMatch(fnatic, Gambit);
        m.playMatch(Gambit, fnatic);
        m.playMatch(Gambit, fnatic);
        m.playMatch(g2, Renegades);
        m.playMatch(g2, Renegades);
        m.playMatch(NaVi, HellRaisers);
        m.playMatch(NaVi, HellRaisers);
        m.playMatch(VP, mouse);
        m.playMatch(mouse, VP);
        m.playMatch(mouse, VP);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Liquid, Astralis);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Tyloo, fnatic);
        m.playMatch(Tyloo, fnatic);
        m.playMatch(Heroic, HellRaisers);
        m.playMatch(Heroic, HellRaisers);
        m.playMatch(Liquid, Renegades);
        m.playMatch(Renegades, Liquid);
        m.playMatch(Liquid, Renegades);
        m.playMatch(VP, MVPPK);
        m.playMatch(MVPPK, VP);
        m.playMatch(VP, MVPPK);
        m.playMatch(Gambit, NaVi);
        m.playMatch(NaVi, Gambit);
        m.playMatch(NaVi, Gambit);
        m.playMatch(mouse, SK);
        m.playMatch(SK, mouse);
        m.playMatch(mouse, SK);
        m.playMatch(FaZe, cloud9);
        m.playMatch(FaZe, cloud9);
        m.playMatch(g2, Astralis);
        m.playMatch(Astralis, g2);
        m.playMatch(g2, Astralis);
        m.playMatch(Liquid, VP);
        m.playMatch(Liquid, VP);
        m.playMatch(Renegades, fnatic);
        m.playMatch(Renegades, fnatic);
        m.playMatch(SK, cloud9);
        m.playMatch(SK, cloud9);
        m.playMatch(Heroic, Tyloo);
        m.playMatch(Heroic, Tyloo);
        m.playMatch(Astralis, Gambit);
        m.playMatch(Astralis, Gambit);
        m.playMatch(mouse, g2);
        m.playMatch(g2, mouse);
        m.playMatch(g2, mouse);
        m.playMatch(HellRaisers, MVPPK);
        m.playMatch(HellRaisers, MVPPK);
        m.playMatch(FaZe, NaVi);
        m.playMatch(NaVi, FaZe);
        m.playMatch(FaZe, NaVi);
        m.playMatch(cloud9, VP);
        m.playMatch(cloud9, VP);
        m.playMatch(Renegades, Tyloo);
        m.playMatch(Renegades, Tyloo);
        m.playMatch(HellRaisers, Gambit);
        m.playMatch(Gambit, HellRaisers);
        m.playMatch(HellRaisers, Gambit);
        m.playMatch(mouse, Liquid);
        m.playMatch(Liquid, mouse);
        m.playMatch(Liquid, mouse);
        m.playMatch(Astralis, Heroic);
        m.playMatch(Astralis, Heroic);
        m.playMatch(SK, NaVi);
        m.playMatch(SK, NaVi);
        m.playMatch(Renegades, HellRaisers);
        m.playMatch(Renegades, HellRaisers);
        m.playMatch(NaVi, Heroic);
        m.playMatch(Heroic, NaVi);
        m.playMatch(NaVi, Heroic);
        m.playMatch(mouse, cloud9);
        m.playMatch(mouse, cloud9);
        m.playMatch(SK, Liquid);
        m.playMatch(Liquid, SK);
        m.playMatch(Liquid, SK);
        m.playMatch(FaZe, Renegades);
        m.playMatch(FaZe, Renegades);
        m.playMatch(mouse, g2);
        m.playMatch(mouse, g2);
        m.playMatch(Astralis, NaVi);
        m.playMatch(NaVi, Astralis);
        m.playMatch(NaVi, Astralis);
        m.playMatch(mouse, Liquid);
        m.playMatch(Liquid, mouse);
        m.playMatch(mouse, Liquid);
        m.playMatch(FaZe, NaVi);
        m.playMatch(NaVi, FaZe);
        m.playMatch(NaVi, FaZe);
        m.playMatch(Liquid, FaZe);
        m.playMatch(FaZe, Liquid);
        m.playMatch(Liquid, FaZe);
        m.playMatch(NaVi, mouse);
        m.playMatch(mouse, NaVi);
        m.playMatch(mouse, NaVi);
        //</editor-fold>

        //<editor-fold desc="Play2Live CryptoMasters Feb 24th-25th">
        //Roster Changes
        BIG.removePlayer(LEGIJA);
        BIG.removePlayer(keev);

        BIG.addPlayer(tiziaN);
        BIG.addPlayer(luckeRRR);

        GODSENT.addPlayer(twist);
        GODSENT.addPlayer(discodoplan);
        GODSENT.addPlayer(freddieb);
        GODSENT.addPlayer(hampus);
        GODSENT.addPlayer(Brollan);

        GoodJob.addPlayer(Coffee);
        GoodJob.addPlayer(lollipop21k);
        GoodJob.addPlayer(SADZED);
        GoodJob.addPlayer(boX);
        GoodJob.addPlayer(fnyekes);

        Sprout.removePlayer(zehN);
        Sprout.addPlayer(NaToSaphiX);

        Misfits.removePlayer(devoduvek);
        Valiance.addPlayer(devoduvek);
        Valiance.addPlayer(DJOXiC);
        Valiance.addPlayer(huNter);
        Valiance.addPlayer(LETN1);
        Valiance.addPlayer(emi);

        Windigo.addPlayer(pNshr);
        Windigo.addPlayer(bubble);
        Windigo.addPlayer(SPELLAN);
        Windigo.addPlayer(SHiPZ);
        Windigo.addPlayer(v1c7oR);

        //On to matches
        m.playMatch(Windigo, Space_Soldiers);
        m.playMatch(Space_Soldiers, Windigo);
        m.playMatch(Space_Soldiers, Windigo);
        m.playMatch(AGO, GoodJob);
        m.playMatch(AGO, GoodJob);
        m.playMatch(Sprout, GODSENT);
        m.playMatch(GODSENT, Sprout);
        m.playMatch(GODSENT, Sprout);
        m.playMatch(BIG, Valiance);
        m.playMatch(BIG, Valiance);
        m.playMatch(Space_Soldiers, GODSENT);
        m.playMatch(Space_Soldiers, GODSENT);
        m.playMatch(AGO, BIG);
        m.playMatch(AGO, BIG);
        m.playMatch(AGO, Space_Soldiers);
        m.playMatch(Space_Soldiers, AGO);
        m.playMatch(AGO, Space_Soldiers);
        //</editor-fold>

        //<editor-fold desc="IEM Katowice Feb 27th-Mar 4th">
        //Roster Changes
        nip.removePlayer(Xizt);
        nip.addPlayer(dennis);

        Chiefs.removePlayer(aliStair);

        ORDER.addPlayer(aliStair);
        ORDER.addPlayer(Hatz);
        ORDER.addPlayer(emagine);
        ORDER.addPlayer(Sico);
        ORDER.addPlayer(liazz);

        //On to matches
        m.playMatch(SK, AVANGAR);
        m.playMatch(Astralis, Renegades);
        m.playMatch(cloud9, Tyloo);
        m.playMatch(Liquid, Gambit);
        m.playMatch(FaZe, ORDER);
        m.playMatch(North, nip);
        m.playMatch(fnatic, Heroic);
        m.playMatch(g2, VP);
        m.playMatch(Renegades, AVANGAR);
        m.playMatch(Renegades, AVANGAR);
        m.playMatch(Astralis, SK);
        m.playMatch(Astralis, SK);
        m.playMatch(Gambit, Tyloo);
        m.playMatch(Tyloo, Gambit);
        m.playMatch(Gambit, Tyloo);
        m.playMatch(Liquid, cloud9);
        m.playMatch(Liquid, cloud9);
        m.playMatch(nip, ORDER);
        m.playMatch(nip, ORDER);
        m.playMatch(Heroic, VP);
        m.playMatch(Heroic, VP);
        m.playMatch(FaZe, North);
        m.playMatch(FaZe, North);
        m.playMatch(cloud9, Renegades);
        m.playMatch(Renegades, cloud9);
        m.playMatch(cloud9, Renegades);
        m.playMatch(g2, fnatic);
        m.playMatch(fnatic, g2);
        m.playMatch(fnatic, g2);
        m.playMatch(SK, Gambit);
        m.playMatch(Gambit, SK);
        m.playMatch(SK, Gambit);
        m.playMatch(North, Heroic);
        m.playMatch(North, Heroic);
        m.playMatch(nip, g2);
        m.playMatch(g2, nip);
        m.playMatch(nip, g2);
        m.playMatch(Liquid, Astralis);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Astralis, Liquid);
        m.playMatch(SK, cloud9);
        m.playMatch(cloud9, SK);
        m.playMatch(cloud9, SK);
        m.playMatch(fnatic, FaZe);
        m.playMatch(fnatic, FaZe);
        m.playMatch(North, nip);
        m.playMatch(nip, North);
        m.playMatch(nip, North);
        m.playMatch(FaZe, cloud9);
        m.playMatch(cloud9, FaZe);
        m.playMatch(FaZe, cloud9);
        m.playMatch(Liquid, nip);
        m.playMatch(nip, Liquid);
        m.playMatch(Liquid, nip);
        m.playMatch(FaZe, Astralis);
        m.playMatch(FaZe, Astralis);
        m.playMatch(fnatic, Liquid);
        m.playMatch(fnatic, Liquid);
        m.playMatch(FaZe, fnatic);
        m.playMatch(fnatic, FaZe);
        m.playMatch(fnatic, FaZe);
        m.playMatch(FaZe, fnatic);
        m.playMatch(fnatic, FaZe);
        //</editor-fold>

        //WESG Games unbalance elo a lot. For this reason, I'm removing any teams that played in WESG but haven't played
        //  since from the rankings, so a team like Wololos which farmed elo won't be top 10
        //<editor-fold desc="WESG 2017 Finals Mar 13-18th">
        //Roster Changes
        ORDER.removePlayer(Sico);
        ORDER.removePlayer(aliStair);
        Chiefs.removePlayer(malta);

        ORDER.addPlayer(BURNRUOk);
        ORDER.addPlayer(malta);

        BOOTds.addPlayer(ImpressioN);
        BOOTds.addPlayer(Tommy);
        BOOTds.addPlayer(splashske);
        BOOTds.addPlayer(Benkai);
        BOOTds.addPlayer(moxie);

        AlphaRed.addPlayer(ViperDemon);
        AlphaRed.addPlayer(bnwGiggs);
        AlphaRed.addPlayer(veta);
        AlphaRed.addPlayer(MAIROLLS);
        AlphaRed.addPlayer(Kntz);

        MAX.addPlayer(s550);
        MAX.addPlayer(dmm);
        MAX.addPlayer(ECOKING);
        MAX.addPlayer(Lamplight);
        MAX.addPlayer(Gn);

        New4.addPlayer(Jewelry);
        New4.addPlayer(Mrsix);
        New4.addPlayer(Drea3er);
        New4.addPlayer(jackhan);
        New4.addPlayer(xiaosaGe);

        Parallax.addPlayer(LONSDALE);
        Parallax.addPlayer(Gratisfaction);
        Parallax.addPlayer(n1ck);
        Parallax.addPlayer(RaZ);
        Parallax.addPlayer(Sico);

        Recca.addPlayer(Sys);
        Recca.addPlayer(xccurate);
        Recca.addPlayer(Eeyore);
        Recca.addPlayer(roseau);
        Recca.addPlayer(FrostMisty);

        EMC.addPlayer(hypathor);
        EMC.addPlayer(TENGU9);
        EMC.addPlayer(CHIMEI);
        EMC.addPlayer(chancehangtsz);
        EMC.addPlayer(fagger);

        SCARZ.addPlayer(poem);
        SCARZ.addPlayer(takej);
        SCARZ.addPlayer(Laz);
        SCARZ.addPlayer(crow);
        SCARZ.addPlayer(barce);

        ViCi.addPlayer(tb);
        ViCi.addPlayer(advent);
        ViCi.addPlayer(HZ);
        ViCi.addPlayer(zhokiNg);
        ViCi.addPlayer(Savage);

        Ukraine.addPlayer(markeloff);
        Ukraine.addPlayer(Edward);
        Ukraine.addPlayer(Zeus);
        Ukraine.addPlayer(bondik);
        Ukraine.addPlayer(s1mple);

        Belgium.addPlayer(Ex6TenZ);
        Belgium.addPlayer(ScreaM);
        Belgium.addPlayer(Faris);
        Belgium.addPlayer(to1nou);
        Belgium.addPlayer(YOUYOU);

        EnVyUs.removePlayer(ScreaM);
        EnVyUs.removePlayer(xms);
        EnVyUs.addPlayer(kioShiMa);
        EnVyUs.addPlayer(hAdji);

        Wololos.addPlayer(Kairi);
        Wololos.addPlayer(EasTor);
        Wololos.addPlayer(SOKER);
        Wololos.addPlayer(mixwell);
        Wololos.addPlayer(loWel);

        Limitless.addPlayer(Max0b);
        Limitless.addPlayer(Kan4);
        Limitless.addPlayer(LoWkii);
        Limitless.addPlayer(Polox);
        Limitless.addPlayer(Maka);

        Russia.addPlayer(Dosia);
        Russia.addPlayer(seized);
        Russia.addPlayer(WorldEdit);
        Russia.addPlayer(electronic);
        Russia.addPlayer(hooch);

        Onliners.addPlayer(effys);
        Onliners.addPlayer(cardiac);
        Onliners.addPlayer(krZ);
        Onliners.addPlayer(vek);
        Onliners.addPlayer(Uber);

        VivaAlgeria.addPlayer(NOtA);
        VivaAlgeria.addPlayer(natsu);
        VivaAlgeria.addPlayer(thyx);
        VivaAlgeria.addPlayer(nOxii);
        VivaAlgeria.addPlayer(Malikof);

        SwolePatrol.addPlayer(freakazoid);
        SwolePatrol.addPlayer(SileNt);
        SwolePatrol.addPlayer(ryan);
        SwolePatrol.addPlayer(Zellsis);
        SwolePatrol.addPlayer(cooper);

        subtLe.addPlayer(els);
        subtLe.addPlayer(OCEAN);
        subtLe.addPlayer(dsr);
        subtLe.addPlayer(LILMAN);
        subtLe.addPlayer(TenZ);

        Bravado.addPlayer(JT);
        Bravado.addPlayer(Detrony);
        Bravado.addPlayer(Elusive);
        Bravado.addPlayer(Sonic);
        Bravado.addPlayer(Fadey);

        TeamOne.addPlayer(caike);
        TeamOne.addPlayer(iDk);
        TeamOne.addPlayer(trk);
        TeamOne.addPlayer(Maluk3);
        TeamOne.addPlayer(mch);

        Isurus.addPlayer(Zote);
        Isurus.addPlayer(NikoM);
        Isurus.addPlayer(nbl);
        Isurus.addPlayer(Noktse);
        Isurus.addPlayer(a1962);

        //Now on to Matches
        m.playMatch(GODSENT, BOOTds);
        m.playMatch(AGO, SwolePatrol);
        m.playMatch(MVPPK, AlphaRed);
        m.playMatch(TeamOne, subtLe);
        m.playMatch(Belgium, Parallax);
        m.playMatch(Wololos, ViCi);
        m.playMatch(AGO, BOOTds);
        m.playMatch(GODSENT, SwolePatrol);
        m.playMatch(MVPPK, TeamOne);
        m.playMatch(AlphaRed, subtLe);
        m.playMatch(EnVyUs, Bravado);
        m.playMatch(Wololos, Parallax);
        m.playMatch(Belgium, ViCi);
        m.playMatch(MVPPK, subtLe);
        m.playMatch(TeamOne, AlphaRed);
        m.playMatch(BOOTds, SwolePatrol);
        m.playMatch(GODSENT, AGO);
        m.playMatch(Belgium, Wololos);
        m.playMatch(Parallax, ViCi);
        m.playMatch(BIG, New4);
        m.playMatch(SK, New4);
        m.playMatch(Russia, New4);
        m.playMatch(Russia, SK);
        m.playMatch(cloud9, SCARZ);
        m.playMatch(fnatic, Onliners);
        m.playMatch(Space_Soldiers, Isurus);
        m.playMatch(Limitless, Recca);
        m.playMatch(Recca, Isurus);
        m.playMatch(cloud9, Onliners);
        m.playMatch(BIG, SK);
        m.playMatch(Space_Soldiers, Limitless);
        m.playMatch(fnatic, SCARZ);
        m.playMatch(ORDER, MAX);
        m.playMatch(BIG, Russia);
        m.playMatch(Onliners, SCARZ);
        m.playMatch(Space_Soldiers, Recca);
        m.playMatch(fnatic, cloud9);
        m.playMatch(Isurus, Limitless);
        m.playMatch(MVPPK, Isurus);
        m.playMatch(MVPPK, Isurus);
        m.playMatch(Russia, EnVyUs);
        m.playMatch(Russia, EnVyUs);
        m.playMatch(Space_Soldiers, Bravado);
        m.playMatch(Space_Soldiers, Bravado);
        m.playMatch(TeamOne, ORDER);
        m.playMatch(ORDER, TeamOne);
        m.playMatch(EnVyUs, Recca);
        m.playMatch(Recca, EnVyUs);
        m.playMatch(Russia, MVPPK);
        m.playMatch(MVPPK, Russia);
        m.playMatch(ORDER, Bravado);
        m.playMatch(ORDER, Bravado);
        m.playMatch(Space_Soldiers, TeamOne);
        m.playMatch(TeamOne, Space_Soldiers);
        m.playMatch(Russia, Recca);
        m.playMatch(Russia, Recca);
        m.playMatch(MVPPK, EnVyUs);
        m.playMatch(EnVyUs, MVPPK);
        m.playMatch(Space_Soldiers, ORDER);
        m.playMatch(Space_Soldiers, ORDER);
        m.playMatch(TeamOne, Bravado);
        m.playMatch(TeamOne, Bravado);
        m.playMatch(fnatic, Wololos);
        m.playMatch(fnatic, Wololos);
        m.playMatch(cloud9, GODSENT);
        m.playMatch(cloud9, GODSENT);
        m.playMatch(MAX, Belgium);
        m.playMatch(Belgium, MAX);
        m.playMatch(AGO, BIG);
        m.playMatch(AGO, BIG);
        m.playMatch(fnatic, AGO);
        m.playMatch(AGO, fnatic);
        m.playMatch(GODSENT, MAX);
        m.playMatch(GODSENT, MAX);
        m.playMatch(BIG, Wololos);
        m.playMatch(BIG, Wololos);
        m.playMatch(cloud9, Belgium);
        m.playMatch(cloud9, Belgium);
        m.playMatch(BIG, fnatic);
        m.playMatch(fnatic, BIG);
        m.playMatch(Wololos, AGO);
        m.playMatch(Wololos, AGO);
        m.playMatch(GODSENT, Belgium);
        m.playMatch(GODSENT, Belgium);
        m.playMatch(cloud9, MAX);
        m.playMatch(cloud9, MAX);
        m.playMatch(fnatic, MVPPK);
        m.playMatch(fnatic, MVPPK);
        m.playMatch(TeamOne, cloud9);
        m.playMatch(cloud9, TeamOne);
        m.playMatch(TeamOne, cloud9);
        m.playMatch(Space_Soldiers, GODSENT);
        m.playMatch(Space_Soldiers, GODSENT);
        m.playMatch(AGO, Russia);
        m.playMatch(Russia, AGO);
        m.playMatch(Russia, AGO);
        m.playMatch(fnatic, TeamOne);
        m.playMatch(fnatic, TeamOne);
        m.playMatch(Space_Soldiers, Russia);
        m.playMatch(Space_Soldiers, Russia);
        m.playMatch(Russia, TeamOne);
        m.playMatch(Russia, TeamOne);
        m.playMatch(fnatic, Space_Soldiers);
        m.playMatch(Space_Soldiers, fnatic);
        m.playMatch(fnatic, Space_Soldiers);
        //</editor-fold>

        //<editor-fold desc="Starladder Imba Invatational Mar 22-25th">
        //Roster Changes
        Flash.removePlayer(Karsa);
        Flash.removePlayer(kaze);
        Flash.addPlayer(auman);
        Flash.addPlayer(Ayeon);

        Spirit.addPlayer(S0tF1k);
        Spirit.addPlayer(COLDYY1);
        Spirit.addPlayer(somedieyoung);
        Spirit.addPlayer(DavCost);
        Spirit.addPlayer(Dima);

        //Games
        m.playMatch(vega, SCARZ);
        m.playMatch(MVPPK, Tyloo);
        m.playMatch(AGO, BOOTds);
        m.playMatch(Spirit, Flash);
        m.playMatch(MVPPK, vega);
        m.playMatch(AGO, Spirit);
        m.playMatch(Tyloo, SCARZ);
        m.playMatch(Tyloo, SCARZ);
        m.playMatch(Flash, BOOTds);
        m.playMatch(BOOTds, Flash);
        m.playMatch(BOOTds, Flash);
        m.playMatch(Tyloo, vega);
        m.playMatch(Tyloo, vega);
        m.playMatch(Spirit, BOOTds);
        m.playMatch(Spirit, BOOTds);
        m.playMatch(Tyloo, AGO);
        m.playMatch(Tyloo, AGO);
        m.playMatch(Spirit, MVPPK);
        m.playMatch(Spirit, MVPPK);
        m.playMatch(AGO, MVPPK);
        m.playMatch(AGO, MVPPK);
        m.playMatch(Tyloo, Spirit);
        m.playMatch(Tyloo, Spirit);
        //</editor-fold>

        //<editor-fold desc="V4 Future Sports Festival Mar 23-25th">
        //Roster Changes
        DarkTigers.addPlayer(Tomkeejs);
        DarkTigers.addPlayer(EYO);
        DarkTigers.addPlayer(capseN);
        DarkTigers.addPlayer(Tusi);
        DarkTigers.addPlayer(beastik);

        GameAgents.addPlayer(fleav);
        GameAgents.addPlayer(Theelive);
        GameAgents.addPlayer(gabesson);
        GameAgents.addPlayer(Zero);
        GameAgents.addPlayer(kolor);

        HellRaisers.removePlayer(HS);
        HellRaisers.addPlayer(ISSAA);

        xkom.addPlayer(ponczek);
        xkom.addPlayer(Goofy);
        xkom.addPlayer(tecek);
        xkom.addPlayer(SOON);
        xkom.addPlayer(stark);

        //Games
        m.playMatch(mouse, xkom);
        m.playMatch(HellRaisers, DarkTigers);
        m.playMatch(mouse, xkom);
        //m.playMatch(DarkTigers, HellRaisers); removed because I didn't know tournaments actually did ties. oops.
        m.playMatch(HellRaisers, GameAgents);
        m.playMatch(eXtatus, xkom);
        m.playMatch(HellRaisers, GameAgents);
        m.playMatch(xkom, eXtatus);
        m.playMatch(FaZe, DarkTigers);
        m.playMatch(eXtatus, VP);
        m.playMatch(FaZe, DarkTigers);
        m.playMatch(VP, eXtatus);
        m.playMatch(GameAgents, DarkTigers);
        m.playMatch(mouse, VP);
        m.playMatch(GameAgents, DarkTigers);
        m.playMatch(VP, mouse);
        m.playMatch(mouse, eXtatus);
        m.playMatch(FaZe, GameAgents);
        m.playMatch(mouse, eXtatus);
        m.playMatch(FaZe, GameAgents);
        m.playMatch(VP, xkom);
        m.playMatch(FaZe, HellRaisers);
        m.playMatch(VP, xkom);
        m.playMatch(HellRaisers, FaZe);
        m.playMatch(VP, FaZe);
        m.playMatch(VP, FaZe);
        m.playMatch(mouse, HellRaisers);
        m.playMatch(mouse, HellRaisers);
        m.playMatch(mouse, VP);
        m.playMatch(VP, mouse);
        m.playMatch(mouse, VP);
        //</editor-fold>

        //<editor-fold desc="Copenhagen Games 2017 Mar 30-31st">
        //Roster Changes
        Imperial.addPlayer(TENZKI);
        Imperial.addPlayer(AcilioN);
        Imperial.addPlayer(nexa);
        Imperial.addPlayer(EspiranTo);
        Imperial.addPlayer(nukkye);

        Valiance.removePlayer(devoduvek);
        Valiance.removePlayer(DJOXiC);
        Valiance.addPlayer(Impulse);
        Valiance.addPlayer(NENO);

        Heroic.removePlayer(JUGi);
        Heroic.addPlayer(es3tag);

        Kinguin.addPlayer(TaZ);
        Kinguin.addPlayer(mouz);
        Kinguin.addPlayer(MINISE);
        Kinguin.addPlayer(rallen);
        Kinguin.addPlayer(reatz);

        //Games
        m.playMatch(Windigo, QBFire);
        m.playMatch(Windigo, QBFire);
        m.playMatch(North, Valiance);
        m.playMatch(Imperial, Kinguin);
        m.playMatch(Imperial, Kinguin);
        m.playMatch(Heroic, Sprout);
        m.playMatch(Sprout, Heroic);
        m.playMatch(Sprout, Heroic);
        m.playMatch(Valiance, QBFire);
        m.playMatch(Valiance, QBFire);
        m.playMatch(Kinguin, Sprout);
        m.playMatch(Kinguin, Sprout);
        m.playMatch(Windigo, North);
        m.playMatch(North, Windigo);
        m.playMatch(North, Windigo);
        m.playMatch(Heroic, Imperial);
        m.playMatch(Heroic, Imperial);
        m.playMatch(Heroic, Kinguin);
        m.playMatch(Heroic, Kinguin);
        m.playMatch(Windigo, Valiance);
        m.playMatch(Windigo, Valiance);
        m.playMatch(QBFire, North);
        m.playMatch(North, QBFire);
        m.playMatch(North, QBFire);
        m.playMatch(Imperial, Sprout);
        m.playMatch(Sprout, Imperial);
        m.playMatch(Imperial, Sprout);
        m.playMatch(Heroic, Windigo);
        m.playMatch(Heroic, Windigo);
        m.playMatch(Imperial, North);
        m.playMatch(Imperial, North);
        m.playMatch(Heroic, Imperial);
        m.playMatch(Imperial, Heroic);
        m.playMatch(Imperial, Heroic);
        //</editor-fold>

        //<editor-fold desc="CSGO Asia Summit 2018 Apr 2nd">
        Parallax.removePlayer(Gratisfaction);
        ORDER.removePlayer(BURNRUOk);

        Grayhound.addPlayer(Gratisfaction);
        Grayhound.addPlayer(BURNRUOk);
        Grayhound.addPlayer(erkaSt);
        Grayhound.addPlayer(Dickstacy);
        Grayhound.addPlayer(dexter);

        //games
        m.playMatch(MVPPK, BOOTds);
        m.playMatch(MVPPK, BOOTds);
        m.playMatch(Grayhound, Tyloo);
        m.playMatch(Tyloo, Grayhound);
        m.playMatch(Grayhound, Tyloo);
        m.playMatch(MVPPK, Grayhound);
        m.playMatch(MVPPK, Grayhound);
        //</editor-fold>

        //<editor-fold desc="Bets.net Masters Apr 5th-8th">
        //Roster Changes
        Fragsters.addPlayer(refrezh);
        Fragsters.addPlayer(stavn);
        Fragsters.addPlayer(dragonfly);
        Fragsters.addPlayer(Bubski);
        Fragsters.addPlayer(torben);

        RedReserve.addPlayer(FREDDyFROG);
        RedReserve.addPlayer(Baaten);
        RedReserve.addPlayer(Relaxa);
        RedReserve.addPlayer(PlesseN);
        RedReserve.addPlayer(kreaz);

        forZe.addPlayer(liTTle);
        forZe.addPlayer(Jerry);
        forZe.addPlayer(facecrack);
        forZe.addPlayer(scoobyxie);
        forZe.addPlayer(svyat);

        //Games
        m.playMatch(North, forZe);
        m.playMatch(forZe, North);
        m.playMatch(North, forZe);
        m.playMatch(HellRaisers, RedReserve);
        m.playMatch(HellRaisers, RedReserve);
        m.playMatch(Gambit, GODSENT);
        m.playMatch(GODSENT, Gambit);
        m.playMatch(GODSENT, Gambit);
        m.playMatch(VP, Fragsters);
        m.playMatch(Fragsters, VP);
        m.playMatch(Fragsters, VP);
        m.playMatch(Gambit, forZe);
        m.playMatch(Gambit, forZe);
        m.playMatch(VP, RedReserve);
        m.playMatch(VP, RedReserve);
        m.playMatch(North, GODSENT);
        m.playMatch(North, GODSENT);
        m.playMatch(HellRaisers, Fragsters);
        m.playMatch(HellRaisers, Fragsters);
        m.playMatch(Fragsters, Gambit);
        m.playMatch(Fragsters, Gambit);
        m.playMatch(GODSENT, VP);
        m.playMatch(VP, GODSENT);
        m.playMatch(VP, GODSENT);
        m.playMatch(Fragsters, VP);
        m.playMatch(VP, Fragsters);
        m.playMatch(Fragsters, VP);
        m.playMatch(HellRaisers, North);
        m.playMatch(HellRaisers, North);
        m.playMatch(North, Fragsters);
        m.playMatch(North, Fragsters);
        m.playMatch(HellRaisers, North);
        m.playMatch(North, HellRaisers);
        m.playMatch(HellRaisers, North);
        //</editor-fold>

        //<editor-fold desc="DreamHack Masters Marseille">
        //Roster Changes
        cloud9.removePlayer(stew);
        cloud9.addPlayer(FNS);

        EnVyUs.removePlayer(SIXER);
        EnVyUs.addPlayer(ScreaM);

        FaZe.removePlayer(olof);
        FaZe.addPlayer(Xizt);

        g2.removePlayer(shox);
        g2.addPlayer(mixwell);

        Liquid.removePlayer(steel);
        Liquid.addPlayer(TACO);

        SK.removePlayer(TACO);
        SK.addPlayer(stew);

        //Games
        m.playMatch(FaZe, EnVyUs);
        m.playMatch(mouse, Valiance);
        m.playMatch(nip, SK);
        m.playMatch(fnatic, Tyloo);
        m.playMatch(cloud9, g2);
        m.playMatch(NaVi, Renegades);
        m.playMatch(Liquid, Gambit);
        m.playMatch(Astralis, Space_Soldiers);
        m.playMatch(EnVyUs, g2);
        m.playMatch(SK, Valiance);
        m.playMatch(Renegades, Tyloo);
        m.playMatch(Gambit, Space_Soldiers);
        m.playMatch(cloud9, FaZe);
        m.playMatch(cloud9, FaZe);
        m.playMatch(mouse, nip);
        m.playMatch(nip, mouse);
        m.playMatch(nip, mouse);
        m.playMatch(NaVi, fnatic);
        m.playMatch(fnatic, NaVi);
        m.playMatch(NaVi, fnatic);
        m.playMatch(Liquid, Astralis);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Astralis, Liquid);
        m.playMatch(FaZe, EnVyUs);
        m.playMatch(FaZe, EnVyUs);
        m.playMatch(mouse, SK);
        m.playMatch(mouse, SK);
        m.playMatch(fnatic, Renegades);
        m.playMatch(fnatic, Renegades);
        m.playMatch(Liquid, Gambit);
        m.playMatch(Gambit, Liquid);
        m.playMatch(Gambit, Liquid);
        m.playMatch(NaVi, mouse);
        m.playMatch(NaVi, mouse);
        m.playMatch(Gambit, cloud9);
        m.playMatch(Gambit, cloud9);
        m.playMatch(Astralis, FaZe);
        m.playMatch(Astralis, FaZe);
        m.playMatch(fnatic, nip);
        m.playMatch(nip, fnatic);
        m.playMatch(fnatic, nip);
        m.playMatch(NaVi, Gambit);
        m.playMatch(NaVi, Gambit);
        m.playMatch(Astralis, fnatic);
        m.playMatch(Astralis, fnatic);
        m.playMatch(Astralis, NaVi);
        m.playMatch(Astralis, NaVi);
        //</editor-fold>

        //<editor-fold desc="QI Invitational">
        //Roster Changes
        New4.removePlayer(xiaosaGe);

        FivePower.addPlayer(dobu);
        FivePower.addPlayer(kabal);
        FivePower.addPlayer(PTC);
        FivePower.addPlayer(forget);
        FivePower.addPlayer(xiaosaGe);

        Eclipse.addPlayer(bottle);
        Eclipse.addPlayer(ayaya);
        Eclipse.addPlayer(shuadapai);
        Eclipse.addPlayer(AE);
        Eclipse.addPlayer(Mrmao);

        BIG.removePlayer(gobb);
        BIG.removePlayer(luckeRRR);
        BIG.addPlayer(smooya);
        BIG.addPlayer(LEGIJA);

        //Games
        m.playMatch(AGO, Imperial);
        m.playMatch(GODSENT, FivePower);
        m.playMatch(AGO, GODSENT);
        m.playMatch(Imperial, FivePower);
        m.playMatch(Imperial, FivePower);
        m.playMatch(Imperial, GODSENT);
        m.playMatch(GODSENT, Imperial);
        m.playMatch(GODSENT, Imperial);
        m.playMatch(Eclipse, GODSENT);
        m.playMatch(Valiance, Tyloo);
        m.playMatch(Valiance, Eclipse);
        m.playMatch(Tyloo, BIG);
        m.playMatch(Tyloo, BIG);
        m.playMatch(Tyloo, Eclipse);
        m.playMatch(Tyloo, Eclipse);
        m.playMatch(AGO, Tyloo);
        m.playMatch(Tyloo, AGO);
        m.playMatch(Tyloo, AGO);
        m.playMatch(Valiance, GODSENT);
        m.playMatch(GODSENT, Valiance);
        m.playMatch(GODSENT, Valiance);
        m.playMatch(GODSENT, Tyloo);
        m.playMatch(GODSENT, Tyloo);
        //</editor-fold>

        //<editor-fold desc="IEM Sydney 2018, May 1st-6th">
        //Roster Changes
        BOOTds.removePlayer(moxie);
        BOOTds.addPlayer(w1nt3r);

        Grayhound.removePlayer(BURNRUOk);
        ORDER.removePlayer(malta);
        Grayhound.addPlayer(malta);

        NRG.addPlayer(FugLy);
        NRG.addPlayer(Brehze);
        NRG.addPlayer(nahtE);
        NRG.addPlayer(CeRq);
        NRG.addPlayer(daps);

        Parallax.removePlayer(LONSDALE);
        Legacy.addPlayer(BL1TZ);
        Legacy.addPlayer(Lacore);
        Legacy.addPlayer(stat);
        Legacy.addPlayer(soju_j);
        Legacy.addPlayer(LONSDALE);

        Chiefs.removePlayer(pecks);
        Chiefs.removePlayer(INS);
        Chiefs.addPlayer(ap0c);
        Chiefs.addPlayer(flickz);
        Chiefs.addPlayer(Texta);
        Chiefs.addPlayer(sterling);

        ORDER.addPlayer(Sico);
        ORDER.addPlayer(aliStair);

        //Games
        m.playMatch(Renegades, Legacy);
        m.playMatch(FaZe, ORDER);
        m.playMatch(cloud9, Grayhound);
        m.playMatch(Tyloo, SK);
        m.playMatch(mouse, BOOTds);
        m.playMatch(Astralis, NRG);
        m.playMatch(fnatic, Chiefs);
        m.playMatch(g2, MVPPK);
        m.playMatch(ORDER, Legacy);
        m.playMatch(ORDER, Legacy);
        m.playMatch(Renegades, FaZe);
        m.playMatch(FaZe, Renegades);
        m.playMatch(Renegades, FaZe);
        m.playMatch(Grayhound, SK);
        m.playMatch(SK, Grayhound);
        m.playMatch(Grayhound, SK);
        m.playMatch(Tyloo, cloud9);
        m.playMatch(Tyloo, cloud9);
        m.playMatch(NRG, BOOTds);
        m.playMatch(NRG, BOOTds);
        m.playMatch(MVPPK, Chiefs);
        m.playMatch(MVPPK, Chiefs);
        m.playMatch(Astralis, mouse);
        m.playMatch(Astralis, mouse);
        m.playMatch(ORDER, cloud9);
        m.playMatch(cloud9, ORDER);
        m.playMatch(cloud9, ORDER);
        m.playMatch(g2, fnatic);
        m.playMatch(fnatic, g2);
        m.playMatch(fnatic, g2);
        m.playMatch(Grayhound, FaZe);
        m.playMatch(FaZe, Grayhound);
        m.playMatch(FaZe, Grayhound);
        m.playMatch(mouse, MVPPK);
        m.playMatch(mouse, MVPPK);
        m.playMatch(g2, NRG);
        m.playMatch(NRG, g2);
        m.playMatch(g2, NRG);
        m.playMatch(Tyloo, Renegades);
        m.playMatch(Tyloo, Renegades);
        m.playMatch(FaZe, cloud9);
        m.playMatch(FaZe, cloud9);
        m.playMatch(Astralis, fnatic);
        m.playMatch(Astralis, fnatic);
        m.playMatch(mouse, g2);
        m.playMatch(mouse, g2);
        m.playMatch(FaZe, fnatic);
        m.playMatch(FaZe, fnatic);
        m.playMatch(mouse, Renegades);
        m.playMatch(Renegades, mouse);
        m.playMatch(mouse, Renegades);
        m.playMatch(FaZe, Tyloo);
        m.playMatch(Tyloo, FaZe);
        m.playMatch(FaZe, Tyloo);
        m.playMatch(Astralis, mouse);
        m.playMatch(mouse, Astralis);
        m.playMatch(Astralis, mouse);
        m.playMatch(FaZe, Astralis);
        m.playMatch(FaZe, Astralis);
        m.playMatch(FaZe, Astralis);
        //</editor-fold>

        //<editor-fold desc="ESEA MDL Global Challenge Season 27">
        //Roster Changes
        YeaH.addPlayer(bld);
        YeaH.addPlayer(zqkS);
        YeaH.addPlayer(xand);
        YeaH.addPlayer(dukeN);
        YeaH.addPlayer(delboNi);

        BIG.removePlayer(smooya);
        BIG.addPlayer(gobb);

        Rise_Nation.removePlayer(dazzLe);
        Rise_Nation.removePlayer(Ace);
        Rise_Nation.removePlayer(moose);
        GX.removePlayer(dapr);

        eUnited.addPlayer(Ace);
        eUnited.addPlayer(dazzLe);
        eUnited.addPlayer(dapr);
        eUnited.addPlayer(moose);
        eUnited.addPlayer(Relyks);

        //Games
        m.playMatch(BIG, ORDER);
        m.playMatch(Spirit, SwolePatrol);
        m.playMatch(eUnited, YeaH);
        m.playMatch(Torqued, Windigo);
        m.playMatch(BIG, Spirit);
        m.playMatch(eUnited, Torqued);
        m.playMatch(ORDER, SwolePatrol);
        m.playMatch(ORDER, SwolePatrol);
        m.playMatch(Windigo, YeaH);
        m.playMatch(Windigo, YeaH);
        m.playMatch(Spirit, ORDER);
        m.playMatch(Spirit, ORDER);
        m.playMatch(Torqued, Windigo);
        m.playMatch(Windigo, Torqued);
        m.playMatch(Windigo, Torqued);
        m.playMatch(BIG, Windigo);
        m.playMatch(Windigo, BIG);
        m.playMatch(BIG, Windigo);
        m.playMatch(Spirit, eUnited);
        m.playMatch(Spirit, eUnited);
        m.playMatch(BIG, Spirit);
        m.playMatch(BIG, Spirit);
        //</editor-fold>

        //<editor-fold desc="ESL Pro League Season 7 Finals">
        //Roster Changes
        Space_Soldiers.removePlayer(Calyx);
        Space_Soldiers.addPlayer(DESPE);

        Heroic.removePlayer(RUBINO);
        Heroic.removePlayer(Snappi);
        Heroic.addPlayer(friberg);
        Heroic.addPlayer(cromen);

        Sharks.addPlayer(exit);
        Sharks.addPlayer(leo_druNky);
        Sharks.addPlayer(RCF);
        Sharks.addPlayer(jnt);
        Sharks.addPlayer(nak);

        OpTic.addPlayer(k0nfig);
        OpTic.addPlayer(Snappi);
        OpTic.addPlayer(cajunb);
        OpTic.addPlayer(JUGi);
        OpTic.addPlayer(gade);

        //Games
        m.playMatch(FaZe, cloud9);
        m.playMatch(mouse, Sharks);
        m.playMatch(Heroic, NRG);
        m.playMatch(NaVi, MVPPK);
        m.playMatch(Liquid, Grayhound);
        m.playMatch(Space_Soldiers, Renegades);
        m.playMatch(Astralis, OpTic);
        m.playMatch(SK, nip);
        m.playMatch(FaZe, mouse);
        m.playMatch(Sharks, cloud9);
        m.playMatch(cloud9, Sharks);
        m.playMatch(cloud9, Sharks);
        m.playMatch(MVPPK, NRG);
        m.playMatch(NRG, MVPPK);
        m.playMatch(NRG, MVPPK);
        m.playMatch(Heroic, NaVi);
        m.playMatch(NaVi, Heroic);
        m.playMatch(NaVi, Heroic);
        m.playMatch(Renegades, Grayhound);
        m.playMatch(Renegades, Grayhound);
        m.playMatch(OpTic, nip);
        m.playMatch(OpTic, nip);
        m.playMatch(Heroic, cloud9);
        m.playMatch(Heroic, cloud9);
        m.playMatch(Liquid, Space_Soldiers);
        m.playMatch(Liquid, Space_Soldiers);
        m.playMatch(mouse, NRG);
        m.playMatch(mouse, NRG);
        m.playMatch(Astralis, SK);
        m.playMatch(Astralis, SK);
        m.playMatch(OpTic, Space_Soldiers);
        m.playMatch(OpTic, Space_Soldiers);
        m.playMatch(SK, Renegades);
        m.playMatch(SK, Renegades);
        m.playMatch(mouse, Heroic);
        m.playMatch(mouse, Heroic);
        m.playMatch(NaVi, FaZe);
        m.playMatch(NaVi, FaZe);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Astralis, Liquid);
        m.playMatch(OpTic, SK);
        m.playMatch(SK, OpTic);
        m.playMatch(SK, OpTic);
        m.playMatch(Liquid, mouse);
        m.playMatch(Liquid, mouse);
        m.playMatch(FaZe, SK);
        m.playMatch(FaZe, SK);
        m.playMatch(Liquid, NaVi);
        m.playMatch(Liquid, NaVi);
        m.playMatch(Astralis, FaZe);
        m.playMatch(Astralis, FaZe);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Liquid, Astralis);
        m.playMatch(Astralis, Liquid);
        //</editor-fold>

        //<editor-fold desc="DreamHack Open Tours 2018">
        //Roster Changes

        //Games
        m.playMatch(Gambit, Torqued);
        m.playMatch(North, Imperial);
        m.playMatch(GODSENT, AGO);
        m.playMatch(EnVyUs, HellRaisers);
        m.playMatch(GODSENT, Gambit);
        m.playMatch(North, EnVyUs);
        m.playMatch(AGO, Torqued);
        m.playMatch(AGO, Torqued);
        m.playMatch(HellRaisers, Imperial);
        m.playMatch(HellRaisers, Imperial);
        m.playMatch(AGO, Gambit);
        m.playMatch(Gambit, AGO);
        m.playMatch(Gambit, AGO);
        m.playMatch(HellRaisers, EnVyUs);
        m.playMatch(HellRaisers, EnVyUs);
        m.playMatch(Gambit, North);
        m.playMatch(North, Gambit);
        m.playMatch(North, Gambit);
        m.playMatch(HellRaisers, GODSENT);
        m.playMatch(HellRaisers, GODSENT);
        m.playMatch(North, HellRaisers);
        m.playMatch(North, HellRaisers);
        //</editor-fold>

        //<editor-fold desc="Adrenaline Cyber League 2018">
        //Roster Changes

        //Games
        m.playMatch(AVANGAR, VP);
        m.playMatch(VP, AVANGAR);
        m.playMatch(AVANGAR, VP);
        m.playMatch(Gambit, SK);
        m.playMatch(SK, Gambit);
        m.playMatch(SK, Gambit);
        m.playMatch(AVANGAR, SK);
        m.playMatch(SK, AVANGAR);
        m.playMatch(SK, AVANGAR);
        m.playMatch(SK, AVANGAR);
        //</editor-fold>

        //<editor-fold desc="StarSeries i-League Season 5">
        //Roster Changes
        Tyloo.removePlayer(Mo);
        Eclipse.removePlayer(AE);
        Tyloo.addPlayer(AE);

        Flash.renameTeam("VG.Flash");

        Flash.removePlayer(auman);
        Flash.removePlayer(Ayeon);
        ViCi.removePlayer(zhokiNg);
        Flash.addPlayer(zhokiNg);
        Flash.addPlayer(Freeman);

        Gambit.removePlayer(fitch);
        vega.removePlayer(mir);
        Gambit.addPlayer(mir);

        //Games
        m.playMatch(Liquid, NRG);
        m.playMatch(Liquid, NRG);
        m.playMatch(Flash, SK);
        m.playMatch(SK, Flash);
        m.playMatch(SK, Flash);
        m.playMatch(Tyloo, NaVi);
        m.playMatch(Tyloo, NaVi);
        m.playMatch(AGO, VP);
        m.playMatch(AGO, VP);
        m.playMatch(AVANGAR, Gambit);
        m.playMatch(AVANGAR, Gambit);
        m.playMatch(mouse, North);
        m.playMatch(North, mouse);
        m.playMatch(mouse, North);
        m.playMatch(GODSENT, Renegades);
        m.playMatch(GODSENT, Renegades);
        m.playMatch(nip, HellRaisers);
        m.playMatch(nip, HellRaisers);
        m.playMatch(North, NRG);
        m.playMatch(NRG, North);
        m.playMatch(North, NRG);
        m.playMatch(VP, Gambit);
        m.playMatch(VP, Gambit);
        m.playMatch(NaVi, Flash);
        m.playMatch(NaVi, Flash);
        m.playMatch(Renegades, HellRaisers);
        m.playMatch(HellRaisers, Renegades);
        m.playMatch(HellRaisers, Renegades);
        m.playMatch(mouse, Tyloo);
        m.playMatch(mouse, Tyloo);
        m.playMatch(SK, AVANGAR);
        m.playMatch(SK, AVANGAR);
        m.playMatch(Liquid, GODSENT);
        m.playMatch(GODSENT, Liquid);
        m.playMatch(Liquid, GODSENT);
        m.playMatch(AGO, nip);
        m.playMatch(AGO, nip);
        m.playMatch(NRG, Flash);
        m.playMatch(NRG, Flash);
        m.playMatch(Renegades, Gambit);
        m.playMatch(Gambit, Renegades);
        m.playMatch(Renegades, Gambit);
        m.playMatch(GODSENT, AVANGAR);
        m.playMatch(AVANGAR, GODSENT);
        m.playMatch(AVANGAR, GODSENT);
        m.playMatch(North, HellRaisers);
        m.playMatch(North, HellRaisers);
        m.playMatch(nip, Tyloo);
        m.playMatch(nip, Tyloo);
        m.playMatch(NaVi, VP);
        m.playMatch(NaVi, VP);
        m.playMatch(AGO, mouse);
        m.playMatch(mouse, AGO);
        m.playMatch(AGO, mouse);
        m.playMatch(SK, Liquid);
        m.playMatch(Liquid, SK);
        m.playMatch(SK, Liquid);
        m.playMatch(NRG, HellRaisers);
        m.playMatch(NRG, HellRaisers);
        m.playMatch(Tyloo, GODSENT);
        m.playMatch(GODSENT, Tyloo);
        m.playMatch(GODSENT, Tyloo);
        m.playMatch(nip, North);
        m.playMatch(nip, North);
        m.playMatch(Renegades, VP);
        m.playMatch(VP, Renegades);
        m.playMatch(Renegades, VP);
        m.playMatch(mouse, NaVi);
        m.playMatch(NaVi, mouse);
        m.playMatch(mouse, NaVi);
        m.playMatch(AVANGAR, Liquid);
        m.playMatch(Liquid, AVANGAR);
        m.playMatch(Liquid, AVANGAR);
        m.playMatch(NaVi, AVANGAR);
        m.playMatch(NaVi, AVANGAR);
        m.playMatch(NRG, Renegades);
        m.playMatch(NRG, Renegades);
        m.playMatch(North, GODSENT);
        m.playMatch(North, GODSENT);
        m.playMatch(Liquid, NRG);
        m.playMatch(NRG, Liquid);
        m.playMatch(NRG, Liquid);
        m.playMatch(North, AGO);
        m.playMatch(AGO, North);
        m.playMatch(North, AGO);
        m.playMatch(nip, mouse);
        m.playMatch(mouse, nip);
        m.playMatch(mouse, nip);
        m.playMatch(SK, NaVi);
        m.playMatch(NaVi, SK);
        m.playMatch(NaVi, SK);
        m.playMatch(NRG, North);
        m.playMatch(North, NRG);
        m.playMatch(NRG, North);
        m.playMatch(mouse, NaVi);
        m.playMatch(NaVi, mouse);
        m.playMatch(NaVi, mouse);
        m.playMatch(NaVi, NRG);
        m.playMatch(NaVi, NRG);
        //</editor-fold>

        //<editor-fold desc="DreamHack Open Austin Jun 1-3rd">
        //Roster Changes
        Space_Soldiers.removePlayer(DESPE);
        Space_Soldiers.addPlayer(Calyx);

        Luminosity.addPlayer(yel);
        Luminosity.addPlayer(PKL);
        Luminosity.addPlayer(SHOOWTiME);
        Luminosity.addPlayer(nekiz);
        Luminosity.addPlayer(steel);

        Misfits.removePlayer(ShahZam);
        Misfits.removePlayer(SicK);

        complexity.addPlayer(dephh);
        complexity.addPlayer(stanislaw);
        complexity.addPlayer(yay);
        complexity.addPlayer(ANDROID);
        complexity.addPlayer(ShahZam);

        Rogue.addPlayer(cadiaN);
        Rogue.addPlayer(Rickeh);
        Rogue.addPlayer(vice);
        Rogue.addPlayer(Hiko);
        Rogue.addPlayer(SicK);

        //Games
        m.playMatch(eUnited, Fragsters);
        m.playMatch(Rogue, OpTic);
        m.playMatch(Heroic, Luminosity);
        m.playMatch(Heroic, eUnited);
        m.playMatch(Space_Soldiers, complexity);
        m.playMatch(Rogue, Space_Soldiers);
        m.playMatch(Luminosity, Fragsters);
        m.playMatch(Fragsters, Luminosity);
        m.playMatch(Fragsters, Luminosity);
        m.playMatch(OpTic, complexity);
        m.playMatch(OpTic, complexity);
        m.playMatch(Fragsters, eUnited);
        m.playMatch(eUnited, Fragsters);
        m.playMatch(Fragsters, eUnited);
        m.playMatch(OpTic, Space_Soldiers);
        m.playMatch(Space_Soldiers, OpTic);
        m.playMatch(Space_Soldiers, OpTic);
        m.playMatch(Rogue, Fragsters);
        m.playMatch(Fragsters, Rogue);
        m.playMatch(Rogue, Fragsters);
        m.playMatch(Space_Soldiers, Heroic);
        m.playMatch(Space_Soldiers, Heroic);
        m.playMatch(Space_Soldiers, Rogue);
        m.playMatch(Rogue, Space_Soldiers);
        m.playMatch(Space_Soldiers, Rogue);
        //</editor-fold>

        //<editor-fold desc="GG.bet Majestic ESL Cologne Qualifier">
        //Roster Changes
        ALTERNATE.addPlayer(syrsoN);
        ALTERNATE.addPlayer(HUNDEN);
        ALTERNATE.addPlayer(sftN);
        ALTERNATE.addPlayer(Console);
        ALTERNATE.addPlayer(k1to);

        ENCE.addPlayer(allu);
        ENCE.addPlayer(Aerial);
        ENCE.addPlayer(xseveN);
        ENCE.addPlayer(Aleksib);
        ENCE.addPlayer(sergej);

        //Games
        m.playMatch(ALTERNATE, AVANGAR);
        m.playMatch(Spirit, ENCE);
        m.playMatch(ENCE, AVANGAR);
        m.playMatch(AVANGAR, ENCE);
        m.playMatch(ENCE, AVANGAR);
        m.playMatch(Spirit, ALTERNATE);
        m.playMatch(Spirit, ALTERNATE);
        m.playMatch(ENCE, ALTERNATE);
        m.playMatch(ENCE, ALTERNATE);
        m.playMatch(ENCE, Spirit);
        m.playMatch(ENCE, Spirit);
        //</editor-fold>

        //Online so I removed, did help elo when added. We'll see
        //<editor-fold desc="ESL One Cologne Europe Closed Qualifier">
        //Roster Changes
        WASD.addPlayer(bitchiR);
        WASD.addPlayer(sperr);
        WASD.addPlayer(ViztA);
        WASD.addPlayer(shokz);
        WASD.addPlayer(Dodz);

        //Games
        /*
        m.playMatch(Gambit, Valiance);
        m.playMatch(Gambit, Valiance);
        m.playMatch(North, WASD);
        m.playMatch(North, WASD);
        m.playMatch(Heroic, VP);
        m.playMatch(VP, Heroic);
        m.playMatch(VP, Heroic);
        m.playMatch(Space_Soldiers, HellRaisers);
        m.playMatch(HellRaisers, Space_Soldiers);
        m.playMatch(HellRaisers, Space_Soldiers);
        m.playMatch(HellRaisers, Gambit);
        m.playMatch(HellRaisers, Gambit);
        m.playMatch(North, VP);
        m.playMatch(VP, North);
        m.playMatch(North, VP);
        m.playMatch(WASD, Heroic);
        m.playMatch(Heroic, WASD);
        m.playMatch(Heroic, WASD);
        m.playMatch(Valiance, Space_Soldiers);
        m.playMatch(Space_Soldiers, Valiance);
        m.playMatch(Space_Soldiers, Valiance);
        m.playMatch(Gambit, Heroic);
        m.playMatch(Gambit, Heroic);
        m.playMatch(Space_Soldiers, VP);
        m.playMatch(Space_Soldiers, VP);
        m.playMatch(North, HellRaisers);
        m.playMatch(North, HellRaisers);
        m.playMatch(Gambit, Space_Soldiers);
        m.playMatch(Space_Soldiers, Gambit);
        m.playMatch(Gambit, Space_Soldiers);
        m.playMatch(Gambit, HellRaisers);
        */
        //</editor-fold>

        //<editor-fold desc="ECS Season 5 Final">
        //Roster Changes
        fnatic.removePlayer(Lekr0);
        FaZe.removePlayer(Xizt);
        fnatic.addPlayer(Xizt);

        Heroic.removePlayer(cromen);
        FaZe.addPlayer(cromen);

        g2.removePlayer(mixwell);
        g2.removePlayer(NBK);
        g2.removePlayer(apEX);

        g2.addPlayer(SmithZz);
        g2.addPlayer(Ex6TenZ);
        g2.addPlayer(shox);

        //Games
        m.playMatch(Astralis, cloud9);
        m.playMatch(Liquid, fnatic);
        m.playMatch(Astralis, Liquid);
        m.playMatch(NRG, g2);
        m.playMatch(FaZe, Luminosity);
        m.playMatch(NRG, FaZe);
        m.playMatch(cloud9, fnatic);
        m.playMatch(fnatic, cloud9);
        m.playMatch(fnatic, cloud9);
        m.playMatch(g2, Luminosity);
        m.playMatch(g2, Luminosity);
        m.playMatch(Liquid, fnatic);
        m.playMatch(Liquid, fnatic);
        m.playMatch(FaZe, g2);
        m.playMatch(FaZe, g2);
        m.playMatch(Liquid, NRG);
        m.playMatch(Liquid, NRG);
        m.playMatch(Astralis, FaZe);
        m.playMatch(Astralis, FaZe);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Astralis, Liquid);
        //</editor-fold>

        //<editor-fold desc="Moche XL Esports">
        //Roster Changes
        Movistar.addPlayer(meisoN);
        Movistar.addPlayer(mopoz);
        Movistar.addPlayer(donQ);
        Movistar.addPlayer(MUTiRiS);
        Movistar.addPlayer(dragunov);

        Winstrike.renameTeam("Winstrike");

        Sprout.removePlayer(innocent);
        Wololos.removePlayer(loWel);

        TempoStorm.addPlayer(fox);
        TempoStorm.addPlayer(loWel);
        TempoStorm.addPlayer(cheti);
        TempoStorm.addPlayer(innocent);
        TempoStorm.addPlayer(HS);

        Giants.addPlayer(obj);
        Giants.addPlayer(arki);
        Giants.addPlayer(rmn);
        Giants.addPlayer(KILLDREAM);
        Giants.addPlayer(ALEX);

        //Games
        m.playMatch(Winstrike, Movistar);
        m.playMatch(Winstrike, Movistar);
        m.playMatch(Giants, TempoStorm);
        m.playMatch(TempoStorm, Giants);
        m.playMatch(Giants, TempoStorm);
        m.playMatch(Giants, HellRaisers);
        m.playMatch(HellRaisers, Giants);
        m.playMatch(HellRaisers, Giants);
        m.playMatch(SK, Winstrike);
        m.playMatch(SK, Winstrike);
        m.playMatch(SK, HellRaisers);
        m.playMatch(SK, HellRaisers);
        //</editor-fold>

        //<editor-fold desc="ESL One Belo Horizonte 2018">
        //Roster Changes
        BIG.removePlayer(LEGIJA);
        BIG.addPlayer(smooya);

        mouse.removePlayer(oskar);
        mouse.addPlayer(n0thing);

        Torqued.removePlayer(naSteel);
        Torqued.removePlayer(pollo);
        Torqued.removePlayer(koosta);

        Ghost.addPlayer(naSteel);
        Ghost.addPlayer(pollo);
        Ghost.addPlayer(koosta);
        Ghost.addPlayer(Subroza);
        Ghost.addPlayer(Wardell);

        NTC.addPlayer(bit);
        NTC.addPlayer(fnx);
        NTC.addPlayer(kNg);
        NTC.addPlayer(chelo);
        NTC.addPlayer(felps);

        //Games
        m.playMatch(FaZe, Ghost);
        m.playMatch(FaZe, Ghost);
        m.playMatch(Space_Soldiers, SK);
        m.playMatch(Space_Soldiers, SK);
        m.playMatch(Liquid, BIG);
        m.playMatch(Liquid, BIG);
        m.playMatch(mouse, NTC);
        m.playMatch(mouse, NTC);
        m.playMatch(SK, Ghost);
        m.playMatch(SK, Ghost);
        m.playMatch(NTC, BIG);
        m.playMatch(BIG, NTC);
        m.playMatch(BIG, NTC);
        m.playMatch(FaZe, Space_Soldiers);
        m.playMatch(FaZe, Space_Soldiers);
        m.playMatch(mouse, Liquid);
        m.playMatch(mouse, Liquid);
        m.playMatch(SK, Space_Soldiers);
        m.playMatch(SK, Space_Soldiers);
        m.playMatch(Liquid, BIG);
        m.playMatch(Liquid, BIG);
        m.playMatch(FaZe, Liquid);
        m.playMatch(Liquid, FaZe);
        m.playMatch(FaZe, Liquid);
        m.playMatch(mouse, SK);
        m.playMatch(mouse, SK);
        m.playMatch(FaZe, mouse);
        m.playMatch(mouse, FaZe);
        m.playMatch(mouse, FaZe);
        m.playMatch(FaZe, mouse);
        m.playMatch(FaZe, mouse);
        //</editor-fold>

        //I skipped Good Game League 2018

        //<editor-fold desc="CS:GO Asia Championships 2018">
        //Roster Changes
        MVPPK.removePlayer(HSK);
        MVPPK.addPlayer(minixeta);

        nip.removePlayer(draken);
        nip.addPlayer(Lekr0);

        EnVyUs.removePlayer(Happy);
        EnVyUs.removePlayer(RpK);

        EnVyUs.addPlayer(SIXER);
        EnVyUs.addPlayer(xms);

        Heroic.addPlayer(RUBINO);

        //Games
        m.playMatch(NaVi, EnVyUs);
        m.playMatch(NaVi, EnVyUs);
        m.playMatch(nip, Flash);
        m.playMatch(nip, Flash);
        m.playMatch(nip, NaVi);
        m.playMatch(NaVi, nip);
        m.playMatch(NaVi, nip);
        m.playMatch(EnVyUs, Flash);
        m.playMatch(EnVyUs, Flash);
        m.playMatch(Heroic, MVPPK);
        m.playMatch(MVPPK, Heroic);
        m.playMatch(Heroic, MVPPK);
        m.playMatch(VP, Tyloo);
        m.playMatch(Tyloo, VP);
        m.playMatch(VP, Tyloo);
        m.playMatch(VP, Heroic);
        m.playMatch(VP, Heroic);
        m.playMatch(Tyloo, MVPPK);
        m.playMatch(Tyloo, MVPPK);
        m.playMatch(Tyloo, nip);
        m.playMatch(nip, Tyloo);
        m.playMatch(Tyloo, nip);
        m.playMatch(EnVyUs, Heroic);
        m.playMatch(Heroic, EnVyUs);
        m.playMatch(EnVyUs, Heroic);
        m.playMatch(VP, Tyloo);
        m.playMatch(VP, Tyloo);
        m.playMatch(NaVi, EnVyUs);
        m.playMatch(NaVi, EnVyUs);
        m.playMatch(VP, NaVi);
        m.playMatch(NaVi, VP);
        m.playMatch(NaVi, VP);
        //</editor-fold>

        //<editor-fold desc="DreamHack Open Summer 2018">
        //Roster Changes
        Imperial.removePlayer(AcilioN);
        Sprout.removePlayer(kRYSTAL);
        Imperial.addPlayer(kRYSTAL);

        //Games
        m.playMatch(Imperial, North);
        m.playMatch(complexity, Renegades);
        m.playMatch(AGO, RedReserve);
        m.playMatch(OpTic, Gambit);
        m.playMatch(Imperial, AGO);
        m.playMatch(OpTic, complexity);
        m.playMatch(North, RedReserve);
        m.playMatch(RedReserve, North);
        m.playMatch(North, RedReserve);
        m.playMatch(Gambit, Renegades);
        m.playMatch(Gambit, Renegades);
        m.playMatch(North, AGO);
        m.playMatch(AGO, North);
        m.playMatch(North, AGO);
        m.playMatch(Gambit, complexity);
        m.playMatch(Gambit, complexity);
        m.playMatch(OpTic, North);
        m.playMatch(North, OpTic);
        m.playMatch(OpTic, North);
        m.playMatch(Imperial, Gambit);
        m.playMatch(Imperial, Gambit);
        m.playMatch(Imperial, OpTic);
        m.playMatch(Imperial, OpTic);
        //</editor-fold>

        //Skipped PM Challenge finals

        //<editor-fold desc="ESL One Cologne 2018">
        //Roster Changes
        cloud9.removePlayer(FNS);
        cloud9.addPlayer(STYKO);

        VP.removePlayer(Snax);
        mouse.removePlayer(STYKO);
        mouse.removePlayer(n0thing);
        mouse.addPlayer(oskar);
        mouse.addPlayer(Snax);

        fnatic.removePlayer(Golden);
        fnatic.addPlayer(draken);

        MIBR.renameTeam("MiBR");

        //Games
        m.playMatch(Astralis, ENCE);
        m.playMatch(cloud9, nip);
        m.playMatch(mouse, Gambit);
        m.playMatch(g2, NaVi);
        m.playMatch(FaZe, BOOTds);
        m.playMatch(MIBR, Renegades);
        m.playMatch(BIG, Liquid);
        m.playMatch(fnatic, North);
        m.playMatch(ENCE, nip);
        m.playMatch(ENCE, nip);
        m.playMatch(Astralis, cloud9);
        m.playMatch(Astralis, cloud9);
        m.playMatch(NaVi, Gambit);
        m.playMatch(NaVi, Gambit);
        m.playMatch(g2, mouse);
        m.playMatch(mouse, g2);
        m.playMatch(g2, mouse);
        m.playMatch(Renegades, BOOTds);
        m.playMatch(Renegades, BOOTds);
        m.playMatch(North, Liquid);
        m.playMatch(North, Liquid);
        m.playMatch(ENCE, mouse);
        m.playMatch(ENCE, mouse);
        m.playMatch(FaZe, MIBR);
        m.playMatch(FaZe, MIBR);
        m.playMatch(fnatic, BIG);
        m.playMatch(fnatic, BIG);
        m.playMatch(NaVi, cloud9);
        m.playMatch(NaVi, cloud9);
        m.playMatch(North, MIBR);
        m.playMatch(MIBR, North);
        m.playMatch(MIBR, North);
        m.playMatch(Renegades, BIG);
        m.playMatch(BIG, Renegades);
        m.playMatch(BIG, Renegades);
        m.playMatch(Astralis, g2);
        m.playMatch(Astralis, g2);
        m.playMatch(ENCE, NaVi);
        m.playMatch(NaVi, ENCE);
        m.playMatch(NaVi, ENCE);
        m.playMatch(FaZe, fnatic);
        m.playMatch(fnatic, FaZe);
        m.playMatch(FaZe, fnatic);
        m.playMatch(BIG, MIBR);
        m.playMatch(MIBR, BIG);
        m.playMatch(BIG, MIBR);
        m.playMatch(NaVi, fnatic);
        m.playMatch(NaVi, fnatic);
        m.playMatch(BIG, g2);
        m.playMatch(BIG, g2);
        m.playMatch(NaVi, Astralis);
        m.playMatch(Astralis, NaVi);
        m.playMatch(NaVi, Astralis);
        m.playMatch(FaZe, BIG);
        m.playMatch(BIG, FaZe);
        m.playMatch(BIG, FaZe);
        m.playMatch(NaVi, BIG);
        m.playMatch(BIG, NaVi);
        m.playMatch(NaVi, BIG);
        m.playMatch(NaVi, BIG);
        //</editor-fold>

        //<editor-fold desc="FaceIt Major Americas Minor">
        //Roster Changes
        SoaR.removePlayer(Grim);

        Dignitas.addPlayer(Grim);
        Dignitas.addPlayer(m1tch);
        Dignitas.addPlayer(Infinite);
        Dignitas.addPlayer(ptr);
        Dignitas.addPlayer(ryx);

        subtLe.removePlayer(LILMAN);
        SwolePatrol.removePlayer(ryan);
        SwolePatrol.addPlayer(LILMAN);

        FURIA.addPlayer(spacca);
        FURIA.addPlayer(arT);
        FURIA.addPlayer(yuurih);
        FURIA.addPlayer(VINI);
        FURIA.addPlayer(kscerato);

        //Games
        m.playMatch(NRG, SwolePatrol);
        m.playMatch(eUnited, NTC);
        m.playMatch(NRG, eUnited);
        m.playMatch(NTC, SwolePatrol);
        m.playMatch(NTC, SwolePatrol);
        m.playMatch(eUnited, NTC);
        m.playMatch(eUnited, NTC);
        m.playMatch(complexity, FURIA);
        m.playMatch(Rogue, Dignitas);
        m.playMatch(Rogue, complexity);
        m.playMatch(Dignitas, FURIA);
        m.playMatch(Dignitas, FURIA);
        m.playMatch(complexity, Dignitas);
        m.playMatch(complexity, Dignitas);
        m.playMatch(Rogue, eUnited);
        m.playMatch(eUnited, Rogue);
        m.playMatch(Rogue, eUnited);
        m.playMatch(NRG, complexity);
        m.playMatch(complexity, NRG);
        m.playMatch(complexity, NRG);
        m.playMatch(Rogue, complexity);
        m.playMatch(Rogue, complexity);
        m.playMatch(NRG, eUnited);
        m.playMatch(eUnited, NRG);
        m.playMatch(eUnited, NRG);
        m.playMatch(complexity, eUnited);
        m.playMatch(complexity, eUnited);
        m.playMatch(complexity, Rogue);
        m.playMatch(complexity, Rogue);
        //</editor-fold>

        //<editor-fold desc="FaceIt London CIS Minor">
        //Roster Changes
        Monolith.addPlayer(ub1que);
        Monolith.addPlayer(spiker);
        Monolith.addPlayer(NickelBack);
        Monolith.addPlayer(YEKINDAR);
        Monolith.addPlayer(propleh);

        PLINK.addPlayer(Jyo);
        PLINK.addPlayer(redhide);
        PLINK.addPlayer(fejtZ);
        PLINK.addPlayer(a1uke);
        PLINK.addPlayer(rommi);

        forZe.removePlayer(liTTle);
        forZe.removePlayer(scoobyxie);
        forZe.removePlayer(svyat);

        forZe.addPlayer(almazer);
        forZe.addPlayer(xsepower);
        forZe.addPlayer(malik);

        pro100.addPlayer(AiyvaN);
        pro100.addPlayer(def);
        pro100.addPlayer(Flarich);
        pro100.addPlayer(kenzor);
        pro100.addPlayer(svyat);

        //Games
        m.playMatch(PLINK, pro100);
        m.playMatch(HellRaisers, PLINK);
        m.playMatch(pro100, PLINK);
        m.playMatch(PLINK, pro100);
        m.playMatch(pro100, PLINK);
        m.playMatch(forZe, AVANGAR);
        m.playMatch(Spirit, Monolith);
        m.playMatch(Spirit, forZe);
        m.playMatch(AVANGAR, Monolith);
        m.playMatch(AVANGAR, Monolith);
        m.playMatch(forZe, AVANGAR);
        m.playMatch(AVANGAR, forZe);
        m.playMatch(AVANGAR, forZe);
        m.playMatch(pro100, Spirit);
        m.playMatch(pro100, Spirit);
        m.playMatch(HellRaisers, AVANGAR);
        m.playMatch(HellRaisers, AVANGAR);
        m.playMatch(HellRaisers, pro100);
        m.playMatch(HellRaisers, pro100);
        m.playMatch(Spirit, AVANGAR);
        m.playMatch(AVANGAR, Spirit);
        m.playMatch(Spirit, AVANGAR);
        m.playMatch(Spirit, pro100);
        m.playMatch(Spirit, pro100);
        m.playMatch(HellRaisers, Spirit);
        m.playMatch(Spirit, HellRaisers);
        m.playMatch(HellRaisers, Spirit);
        //</editor-fold>

        //<editor-fold desc="DreamHack Open Valencia 2018">
        //Roster Changes
        Heroic.removePlayer(RUBINO);
        Heroic.addPlayer(AcilioN);

        North.removePlayer(mertz);
        North.addPlayer(mixwell);

        VP.addPlayer(morelz);

        Luminosity.removePlayer(PKL);
        Luminosity.removePlayer(SHOOWTiME);
        Luminosity.addPlayer(HEN1);
        Luminosity.addPlayer(LUCAS1);

        //Games
        m.playMatch(North, Giants);
        m.playMatch(Luminosity, g2);
        m.playMatch(Heroic, AGO);
        m.playMatch(Fragsters, VP);
        m.playMatch(Heroic, North);
        m.playMatch(Fragsters, Luminosity);
        m.playMatch(AGO, Giants);
        m.playMatch(AGO, Giants);
        m.playMatch(g2, VP);
        m.playMatch(g2, VP);
        m.playMatch(North, AGO);
        m.playMatch(AGO, North);
        m.playMatch(North, AGO);
        m.playMatch(Luminosity, g2);
        m.playMatch(g2, Luminosity);
        m.playMatch(Luminosity, g2);
        m.playMatch(North, Fragsters);
        m.playMatch(North, Fragsters);
        m.playMatch(Luminosity, Heroic);
        m.playMatch(Heroic, Luminosity);
        m.playMatch(Luminosity, Heroic);
        m.playMatch(North, Luminosity);
        m.playMatch(North, Luminosity);
        //</editor-fold>

        //<editor-fold desc="FaceIt London Asia Minor">
        //Roster Changes
        Flash.removePlayer(AttackeR);
        Flash.addPlayer(z8z);

        Tyloo.removePlayer(AE);
        Tyloo.addPlayer(Mo);

        BOOTds.removePlayer(w1nt3r);
        BOOTds.addPlayer(Bobosaur);

        Uniquestars.addPlayer(LaNrefNi);
        Uniquestars.addPlayer(Nertz);
        Uniquestars.addPlayer(shp3x);
        Uniquestars.addPlayer(anarkez);
        Uniquestars.addPlayer(ponkt);

        TaintedMinds.addPlayer(yam);
        TaintedMinds.addPlayer(zewsky);
        TaintedMinds.addPlayer(ofnu);
        TaintedMinds.addPlayer(INS);
        TaintedMinds.addPlayer(BURNRUOk);

        FivePower.removePlayer(dobu);
        FivePower.removePlayer(kabal);
        FivePower.removePlayer(PTC);
        FivePower.removePlayer(forget);

        FivePower.addPlayer(kaze);
        FivePower.addPlayer(moxie);
        FivePower.addPlayer(QKA);
        FivePower.addPlayer(insanity);

        //Games
        m.playMatch(SCARZ, Flash);
        m.playMatch(Renegades, BOOTds);
        m.playMatch(SCARZ, Renegades);
        m.playMatch(Flash, BOOTds);
        m.playMatch(BOOTds, Flash);
        m.playMatch(BOOTds, Flash);
        m.playMatch(Renegades, BOOTds);
        m.playMatch(Renegades, BOOTds);
        m.playMatch(Tyloo, FivePower);
        m.playMatch(TaintedMinds, Uniquestars);
        m.playMatch(Tyloo, TaintedMinds);
        m.playMatch(Uniquestars, FivePower);
        m.playMatch(Uniquestars, FivePower);
        m.playMatch(TaintedMinds, Uniquestars);
        m.playMatch(TaintedMinds, Uniquestars);
        m.playMatch(Tyloo, Renegades);
        m.playMatch(Renegades, Tyloo);
        m.playMatch(Tyloo, Renegades);
        m.playMatch(TaintedMinds, SCARZ);
        m.playMatch(TaintedMinds, SCARZ);
        m.playMatch(Renegades, SCARZ);
        m.playMatch(SCARZ, Renegades);
        m.playMatch(Renegades, SCARZ);
        m.playMatch(Tyloo, TaintedMinds);
        m.playMatch(Tyloo, TaintedMinds);
        m.playMatch(Renegades, TaintedMinds);
        m.playMatch(Renegades, TaintedMinds);
        m.playMatch(Renegades, Tyloo);
        m.playMatch(Renegades, Tyloo);
        //</editor-fold>

        //<editor-fold desc="FaceIt London Europe Minor">
        //Roster Changes
        ThreeDMax.addPlayer(JaCkz);
        ThreeDMax.addPlayer(Davidp);
        ThreeDMax.addPlayer(Maka);
        ThreeDMax.addPlayer(JiNKZ);
        ThreeDMax.addPlayer(Lucky);

        EnVyUs.renameTeam("LeftOut");

        Sprout.addPlayer(sycrone);
        Sprout.addPlayer(PERCY);

        //Games
        m.playMatch(OpTic, ThreeDMax);
        m.playMatch(ENCE, EnVyUs);
        m.playMatch(OpTic, ENCE);
        m.playMatch(ThreeDMax, EnVyUs);
        m.playMatch(EnVyUs, ThreeDMax);
        m.playMatch(ThreeDMax, EnVyUs);
        m.playMatch(ENCE, ThreeDMax);
        m.playMatch(ENCE, ThreeDMax);
        m.playMatch(Sprout, Kinguin);
        m.playMatch(nip, RedReserve);
        m.playMatch(Sprout, nip);
        m.playMatch(RedReserve, Kinguin);
        m.playMatch(RedReserve, Kinguin);
        m.playMatch(nip, RedReserve);
        m.playMatch(nip, RedReserve);
        m.playMatch(ENCE, Sprout);
        m.playMatch(ENCE, Sprout);
        m.playMatch(OpTic, nip);
        m.playMatch(nip, OpTic);
        m.playMatch(OpTic, nip);
        m.playMatch(nip, Sprout);
        m.playMatch(Sprout, nip);
        m.playMatch(nip, Sprout);
        m.playMatch(ENCE, OpTic);
        m.playMatch(OpTic, ENCE);
        m.playMatch(OpTic, ENCE);
        m.playMatch(nip, ENCE);
        m.playMatch(nip, ENCE);
        m.playMatch(nip, OpTic);
        m.playMatch(nip, OpTic);
        //</editor-fold>

        //<editor-fold desc="ELEAGUE CS:GO Premier 2018">
        //Roster Changes
        cloud9.removePlayer(tarik);
        cloud9.addPlayer(Golden);

        FaZe.removePlayer(cromen);
        FaZe.addPlayer(olof);

        MIBR.removePlayer(boltz);
        MIBR.addPlayer(tarik);

        //Games
        m.playMatch(Astralis, cloud9);
        m.playMatch(Astralis, cloud9);
        m.playMatch(Liquid, MIBR);
        m.playMatch(Liquid, MIBR);
        m.playMatch(NaVi, fnatic);
        m.playMatch(fnatic, NaVi);
        m.playMatch(NaVi, fnatic);
        m.playMatch(FaZe, mouse);
        m.playMatch(mouse, FaZe);
        m.playMatch(mouse, FaZe);
        m.playMatch(MIBR, cloud9);
        m.playMatch(MIBR, cloud9);
        m.playMatch(fnatic, FaZe);
        m.playMatch(fnatic, FaZe);
        m.playMatch(Liquid, MIBR);
        m.playMatch(Liquid, MIBR);
        m.playMatch(fnatic, mouse);
        m.playMatch(mouse, fnatic);
        m.playMatch(mouse, fnatic);
        m.playMatch(Astralis, mouse);
        m.playMatch(Astralis, mouse);
        m.playMatch(Liquid, NaVi);
        m.playMatch(Liquid, NaVi);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Astralis, Liquid);
        //</editor-fold>

        //<editor-fold desc="IEM Shanghai 2018">
        //Roster Changes
        FivePower.removePlayer(kaze);
        FivePower.removePlayer(moxie);
        FivePower.removePlayer(insanity);
        FivePower.addPlayer(kabal);
        FivePower.addPlayer(shuadapai);
        FivePower.addPlayer(dobu);

        HellRaisers.removePlayer(woxic);
        HellRaisers.addPlayer(fejtZ);

        //Games
        m.playMatch(NRG, FivePower);
        m.playMatch(HellRaisers, VP);
        m.playMatch(BOOTds, Gambit);
        m.playMatch(Tyloo, Grayhound);
        m.playMatch(HellRaisers, NRG);
        m.playMatch(NRG, HellRaisers);
        m.playMatch(NRG, HellRaisers);
        m.playMatch(Tyloo, BOOTds);
        m.playMatch(Tyloo, BOOTds);
        m.playMatch(VP, FivePower);
        m.playMatch(VP, FivePower);
        m.playMatch(Gambit, Grayhound);
        m.playMatch(Gambit, Grayhound);
        m.playMatch(VP, HellRaisers);
        m.playMatch(VP, HellRaisers);
        m.playMatch(Gambit, BOOTds);
        m.playMatch(Gambit, BOOTds);
        m.playMatch(Tyloo, VP);
        m.playMatch(VP, Tyloo);
        m.playMatch(Tyloo, VP);
        m.playMatch(NRG, Gambit);
        m.playMatch(NRG, Gambit);
        m.playMatch(NRG, Tyloo);
        m.playMatch(NRG, Tyloo);
        //</editor-fold>

        //<editor-fold desc="ZOTAC Cup Masters 2018">
        //Roster Changes
        Ghost.removePlayer(pollo);
        Ghost.addPlayer(kRYSTAL);

        Flash.removePlayer(z8z);
        Flash.addPlayer(Summer);

        VP.removePlayer(morelz);
        VP.addPlayer(snatchie);

        //Games
        m.playMatch(Tyloo, Kinguin);
        m.playMatch(Kinguin, Tyloo);
        m.playMatch(Kinguin, Tyloo);
        m.playMatch(Ghost, OpTic);
        m.playMatch(OpTic, Ghost);
        m.playMatch(Ghost, OpTic);
        m.playMatch(MVPPK, VP);
        m.playMatch(VP, MVPPK);
        m.playMatch(MVPPK, VP);
        m.playMatch(MIBR, Flash);
        m.playMatch(MIBR, Flash);
        m.playMatch(Kinguin, Ghost);
        m.playMatch(Ghost, Kinguin);
        m.playMatch(Kinguin, Ghost);
        m.playMatch(MIBR, MVPPK);
        m.playMatch(MIBR, MVPPK);
        m.playMatch(MIBR, Kinguin);
        m.playMatch(MIBR, Kinguin);
        m.playMatch(MIBR, Kinguin);
        //</editor-fold>

        //<editor-fold desc="Dreamhack Stockholm 2018">
        //Roster Changes
        Grayhound.removePlayer(erkaSt);
        Grayhound.addPlayer(fejtZ);

        HellRaisers.removePlayer(fejtZ);
        HellRaisers.addPlayer(nukkye);

        Heroic.removePlayer(niko);
        Heroic.addPlayer(mertz);

        North.removePlayer(mixwell);
        North.addPlayer(niko);

        //Games
        m.playMatch(Astralis, Grayhound);
        m.playMatch(Ghost, NaVi);
        m.playMatch(North, Tyloo);
        m.playMatch(nip, NRG);
        m.playMatch(FaZe, Heroic);
        m.playMatch(mouse, Gambit);
        m.playMatch(OpTic, fnatic);
        m.playMatch(MIBR, HellRaisers);
        m.playMatch(Tyloo, Grayhound);
        m.playMatch(Tyloo, Grayhound);
        m.playMatch(NRG, NaVi);
        m.playMatch(NaVi, NRG);
        m.playMatch(NaVi, NRG);
        m.playMatch(Heroic, fnatic);
        m.playMatch(fnatic, Heroic);
        m.playMatch(Heroic, fnatic);
        m.playMatch(Astralis, North);
        m.playMatch(North, Astralis);
        m.playMatch(North, Astralis);
        m.playMatch(HellRaisers, Gambit);
        m.playMatch(Gambit, HellRaisers);
        m.playMatch(HellRaisers, Gambit);
        m.playMatch(Ghost, nip);
        m.playMatch(nip, Ghost);
        m.playMatch(nip, Ghost);
        m.playMatch(FaZe, OpTic);
        m.playMatch(FaZe, OpTic);
        m.playMatch(MIBR, mouse);
        m.playMatch(MIBR, mouse);
        m.playMatch(Tyloo, Astralis);
        m.playMatch(Astralis, Tyloo);
        m.playMatch(Astralis, Tyloo);
        m.playMatch(Ghost, NaVi);
        m.playMatch(NaVi, Ghost);
        m.playMatch(NaVi, Ghost);
        m.playMatch(Heroic, OpTic);
        m.playMatch(Heroic, OpTic);
        m.playMatch(mouse, HellRaisers);
        m.playMatch(mouse, HellRaisers);
        m.playMatch(nip, Heroic);
        m.playMatch(nip, Heroic);
        m.playMatch(Astralis, MIBR);
        m.playMatch(Astralis, MIBR);
        m.playMatch(FaZe, mouse);
        m.playMatch(mouse, FaZe);
        m.playMatch(mouse, FaZe);
        m.playMatch(North, NaVi);
        m.playMatch(North, NaVi);
        m.playMatch(Astralis, nip);
        m.playMatch(Astralis, nip);
        m.playMatch(mouse, North);
        m.playMatch(North, mouse);
        m.playMatch(North, mouse);
        m.playMatch(North, Astralis);
        m.playMatch(Astralis, North);
        m.playMatch(North, Astralis);
        //</editor-fold>

        //<editor-fold desc="FaceIt Major Main Qualifier">
        //Roster Changes
        HellRaisers.removePlayer(nukkye);
        HellRaisers.addPlayer(woxic);

        Space_Soldiers.removePlayer(ngiN);
        Space_Soldiers.addPlayer(hardstyle);

        vega.removePlayer(keshandr);
        vega.addPlayer(crush);
        vega.addPlayer(tonyblack);

        //Games
        m.playMatch(Rogue, Space_Soldiers);
        m.playMatch(nip, VP);
        m.playMatch(Tyloo, Gambit);
        m.playMatch(BIG, Renegades);
        m.playMatch(vega, Spirit);
        m.playMatch(HellRaisers, North);
        m.playMatch(Liquid, OpTic);
        m.playMatch(Astralis, complexity);
        m.playMatch(nip, Tyloo);
        m.playMatch(vega, BIG);
        m.playMatch(Liquid, HellRaisers);
        m.playMatch(Astralis, Rogue);
        m.playMatch(Gambit, Renegades);
        m.playMatch(Spirit, North);
        m.playMatch(OpTic, VP);
        m.playMatch(complexity, Space_Soldiers);
        m.playMatch(Liquid, vega);
        m.playMatch(nip, Astralis);
        m.playMatch(complexity, BIG);
        m.playMatch(Spirit, Rogue);
        m.playMatch(HellRaisers, Gambit);
        m.playMatch(OpTic, Tyloo);
        m.playMatch(Renegades, Space_Soldiers);
        m.playMatch(North, VP);
        m.playMatch(Astralis, Spirit);
        m.playMatch(Tyloo, Renegades);
        m.playMatch(HellRaisers, OpTic);
        m.playMatch(BIG, Gambit);
        m.playMatch(complexity, vega);
        m.playMatch(North, Rogue);
        m.playMatch(Tyloo, Spirit);
        m.playMatch(Tyloo, Spirit);
        m.playMatch(BIG, OpTic);
        m.playMatch(BIG, OpTic);
        m.playMatch(vega, North);
        m.playMatch(vega, North);
        //</editor-fold>

        //<editor-fold desc="DreamHack Open Montreal">
        //Roster Changes
        AGO.removePlayer(snatchie);
        AGO.addPlayer(SZPERO);

        Imperial.removePlayer(TENZKI);
        Imperial.removePlayer(kRYSTAL);
        Imperial.addPlayer(hAdji);
        Imperial.addPlayer(pounh);

        RedReserve = GODSENT;
        teams.remove(GODSENT);

        RedReserve.removePlayer(hampus);
        RedReserve.addPlayer(RuStY);


        //Games
        m.playMatch(ENCE, eUnited);
        m.playMatch(AGO, Imperial);
        m.playMatch(RedReserve, Kinguin);
        m.playMatch(Luminosity, Heroic);
        m.playMatch(ENCE, RedReserve);
        m.playMatch(AGO, Luminosity);
        m.playMatch(eUnited, Kinguin);
        m.playMatch(Kinguin, eUnited);
        m.playMatch(Kinguin, eUnited);
        m.playMatch(Imperial, Heroic);
        m.playMatch(Imperial, Heroic);
        m.playMatch(Kinguin, RedReserve);
        m.playMatch(Kinguin, RedReserve);
        m.playMatch(Imperial, Luminosity);
        m.playMatch(Imperial, Luminosity);
        m.playMatch(Kinguin, AGO);
        m.playMatch(Kinguin, AGO);
        m.playMatch(Imperial, ENCE);
        m.playMatch(ENCE, Imperial);
        m.playMatch(ENCE, Imperial);
        m.playMatch(Kinguin, ENCE);
        m.playMatch(Kinguin, ENCE);
        //</editor-fold>

        //<editor-fold desc="FaceIt Major">
        //Roster Changes

        //no changes

        //Games
        m.playMatch(g2, HellRaisers);
        m.playMatch(Liquid, Winstrike);
        m.playMatch(BIG, FaZe);
        m.playMatch(complexity, fnatic);
        m.playMatch(Tyloo, MIBR);
        m.playMatch(nip, mouse);
        m.playMatch(Astralis, NaVi);
        m.playMatch(vega, cloud9);
        m.playMatch(BIG, Tyloo);
        m.playMatch(fnatic, Winstrike);
        m.playMatch(Astralis, vega);
        m.playMatch(HellRaisers, cloud9);
        m.playMatch(complexity, g2);
        m.playMatch(Liquid, nip);
        m.playMatch(NaVi, FaZe);
        m.playMatch(MIBR, mouse);
        m.playMatch(fnatic, vega);
        m.playMatch(HellRaisers, Tyloo);
        m.playMatch(cloud9, Windigo);
        m.playMatch(complexity, BIG);
        m.playMatch(NaVi, nip);
        m.playMatch(MIBR, g2);
        m.playMatch(Liquid, Astralis);
        m.playMatch(FaZe, mouse);
        m.playMatch(BIG, HellRaisers);
        m.playMatch(nip, vega);
        m.playMatch(FaZe, Tyloo);
        m.playMatch(NaVi, fnatic);
        m.playMatch(g2, cloud9);
        m.playMatch(Astralis, MIBR);
        m.playMatch(fnatic, HellRaisers);
        m.playMatch(HellRaisers, fnatic);
        m.playMatch(HellRaisers, fnatic);
        m.playMatch(FaZe, g2);
        m.playMatch(FaZe, g2);
        m.playMatch(MIBR, nip);
        m.playMatch(nip, MIBR);
        m.playMatch(MIBR, nip);
        m.playMatch(NaVi, BIG);
        m.playMatch(NaVi, BIG);
        m.playMatch(MIBR, complexity);
        m.playMatch(MIBR, complexity);
        m.playMatch(Liquid, HellRaisers);
        m.playMatch(HellRaisers, Liquid);
        m.playMatch(Liquid, HellRaisers);
        m.playMatch(Astralis, FaZe);
        m.playMatch(Astralis, FaZe);
        m.playMatch(NaVi, MIBR);
        m.playMatch(NaVi, MIBR);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Astralis, Liquid);
        m.playMatch(Astralis, NaVi);
        m.playMatch(Astralis, NaVi);
        //</editor-fold>

        //<editor-fold desc="ESL One NY 2018">
        //Roster Changes
        fnatic.removePlayer(flusha);
        fnatic.addPlayer(ScreaM);

        //Games
        m.playMatch(Gambit, NaVi);
        m.playMatch(NaVi, Gambit);
        m.playMatch(Gambit, NaVi);
        m.playMatch(fnatic, mouse);
        m.playMatch(mouse, fnatic);
        m.playMatch(mouse, fnatic);
        m.playMatch(g2, FaZe);
        m.playMatch(FaZe, g2);
        m.playMatch(g2, FaZe);
        m.playMatch(NRG, Liquid);
        m.playMatch(Liquid, NRG);
        m.playMatch(Liquid, NRG);
        m.playMatch(NaVi, fnatic);
        m.playMatch(NaVi, fnatic);
        m.playMatch(NRG, FaZe);
        m.playMatch(NRG, FaZe);
        m.playMatch(Gambit, mouse);
        m.playMatch(mouse, Gambit);
        m.playMatch(mouse, Gambit);
        m.playMatch(Liquid, g2);
        m.playMatch(Liquid, g2);
        m.playMatch(Gambit, NaVi);
        m.playMatch(Gambit, NaVi);
        m.playMatch(NRG, g2);
        m.playMatch(NRG, g2);
        m.playMatch(mouse, NRG);
        m.playMatch(mouse, NRG);
        m.playMatch(Liquid, Gambit);
        m.playMatch(Liquid, Gambit);
        m.playMatch(mouse, Liquid);
        m.playMatch(Liquid, mouse);
        m.playMatch(Liquid, mouse);
        m.playMatch(mouse, Liquid);
        m.playMatch(mouse, Liquid);
        //</editor-fold>

        //<editor-fold desc="Blast Pro Series Istanbul">
        //Roster Changes
        cloud9.removePlayer(STYKO);
        cloud9.addPlayer(flusha);

        VP.removePlayer(byali);
        VP.addPlayer(morelz);

        //Games
        m.playMatch(Astralis, VP);
        m.playMatch(MIBR, cloud9);
        m.playMatch(Space_Soldiers, nip);
        m.playMatch(Astralis, Space_Soldiers);
        m.playMatch(VP, cloud9);
        //MIBR NIP tie
        m.playMatch(Astralis, cloud9);
        m.playMatch(MIBR, Space_Soldiers);
        m.playMatch(nip, VP);
        m.playMatch(cloud9, Space_Soldiers);
        m.playMatch(Astralis, nip);
        m.playMatch(MIBR, VP);
        m.playMatch(Astralis, MIBR);
        m.playMatch(Space_Soldiers, VP);
        m.playMatch(nip, cloud9);
        m.playMatch(Astralis, MIBR);
        m.playMatch(MIBR, Astralis);
        m.playMatch(Astralis, MIBR);
        //</editor-fold>

        //<editor-fold desc="Games Clash Masters 2018">
        //Roster Changes
        Player Radification = new Player("Radification");
        Player faveN = new Player("faveN");
        Player STOMP = new Player("STOMP");
        Player Patitek = new Player("Patitek");
        Player mynio = new Player("mynio");
        players.add(Radification);
        players.add(faveN);
        players.add(STOMP);
        players.add(Patitek);
        players.add(mynio);

        xkom.removePlayer(ponczek);
        xkom.removePlayer(SOON);
        xkom.removePlayer(tecek);
        xkom.addPlayer(STOMP);
        xkom.addPlayer(Patitek);
        xkom.addPlayer(mynio);

        RedReserve.removePlayer(twist);
        RedReserve.removePlayer(RuStY);
        RedReserve.addPlayer(hampus);
        RedReserve.addPlayer(Radification);

        Sprout.removePlayer(sycrone);
        Sprout.addPlayer(faveN);

        PACT.addPlayer(ToM223);
        PACT.addPlayer(MOLSI);
        PACT.addPlayer(lunAtic);
        PACT.addPlayer(darko);
        PACT.addPlayer(Vegi);

        //Games
        m.playMatch(Heroic, Kinguin);
        m.playMatch(RedReserve, xkom);
        m.playMatch(PACT, Sprout);
        m.playMatch(Fragsters, AGO);
        m.playMatch(Heroic, PACT);
        m.playMatch(Fragsters, RedReserve);
        m.playMatch(Kinguin, Sprout);
        m.playMatch(Sprout, Kinguin);
        m.playMatch(Kinguin, Sprout);
        m.playMatch(AGO, xkom);
        m.playMatch(AGO, xkom);
        m.playMatch(PACT, Kinguin);
        m.playMatch(Kinguin, PACT);
        m.playMatch(Kinguin, PACT);
        m.playMatch(AGO, RedReserve);
        m.playMatch(RedReserve, Kinguin);
        m.playMatch(AGO, RedReserve);
        m.playMatch(Heroic, AGO);
        m.playMatch(Heroic, AGO);
        m.playMatch(Kinguin, Fragsters);
        m.playMatch(Kinguin, Fragsters);
        m.playMatch(Heroic, Kinguin);
        m.playMatch(Kinguin, Heroic);
        m.playMatch(Heroic, Kinguin);
        //</editor-fold>

        //<editor-fold desc="MSI MGA Finals">
        //Roster Changes
        AVANGAR.removePlayer(dimasick);
        AVANGAR.addPlayer(fitch);

        Movistar.removePlayer(meisoN);
        Movistar.removePlayer(donQ);
        Movistar.removePlayer(MUTiRiS);
        Movistar.removePlayer(dragunov);
        Movistar.addPlayer(ALEX);
        Movistar.addPlayer(loWel);
        Movistar.addPlayer(SOKER);
        Movistar.addPlayer(mixwell);

        //Games
        m.playMatch(complexity, Movistar);
        m.playMatch(eUnited, AVANGAR);
        m.playMatch(complexity, eUnited);
        m.playMatch(AVANGAR, Movistar);
        m.playMatch(AVANGAR, eUnited);
        m.playMatch(AVANGAR, complexity);
        //</editor-fold>

        //<editor-fold desc="ESL Pro European Championship">
        //Roster Changes
        LDLC.addPlayer(to1nou);
        LDLC.addPlayer(ALEX);
        LDLC.addPlayer(AmaNEk);
        LDLC.addPlayer(devoduvek);
        LDLC.addPlayer(LOGAN);

        ALTERNATE.removePlayer(Console);
        ALTERNATE.addPlayer(TENZKI);

        Epsilon.addPlayer(frei);
        Epsilon.addPlayer(blameF);
        Epsilon.addPlayer(kioShiMa);
        Epsilon.addPlayer(CRUC1AL);
        Epsilon.addPlayer(Surreal);

        //Games
        m.playMatch(Epsilon, LDLC);
        m.playMatch(AGO, ALTERNATE);
        m.playMatch(LDLC, ALTERNATE);
        m.playMatch(LDLC, ALTERNATE);
        m.playMatch(AGO, Epsilon);
        m.playMatch(AGO, Epsilon);
        m.playMatch(LDLC, Epsilon);
        m.playMatch(Epsilon, LDLC);
        m.playMatch(LDLC, Epsilon);
        m.playMatch(LDLC, AGO);
        m.playMatch(LDLC, AGO);
        m.playMatch(AGO, LDLC);
        m.playMatch(AGO, LDLC);
        m.playMatch(LDLC, AGO);
        //</editor-fold>

        //<editor-fold desc="StarSeries Season 6">
        //Roster Changes
        CyberZen.addPlayer(bottle);
        CyberZen.addPlayer(Viva);
        CyberZen.addPlayer(Savage);
        CyberZen.addPlayer(tb);
        CyberZen.addPlayer(HZ);

        OpTic.removePlayer(gade);
        OpTic.addPlayer(niko);

        North.removePlayer(MSL);
        North.removePlayer(niko);
        North.addPlayer(cadiaN);
        North.addPlayer(gade);

        Renegades.removePlayer(Nifty);
        Renegades.removePlayer(USTILO);
        Renegades.addPlayer(Gratisfaction);
        Renegades.addPlayer(liazz);

        //Games
        m.playMatch(CyberZen, Renegades);
        m.playMatch(ENCE, Tyloo);
        m.playMatch(Imperial, HellRaisers);
        m.playMatch(North, OpTic);
        m.playMatch(Fragsters, BIG);
        m.playMatch(NRG, vega);
        m.playMatch(Gambit, complexity);
        m.playMatch(mouse, Sprout);
        m.playMatch(OpTic, BIG);
        m.playMatch(Renegades, complexity);
        m.playMatch(vega, Sprout);
        m.playMatch(Tyloo, HellRaisers);
        m.playMatch(ENCE, Imperial);
        m.playMatch(mouse, CyberZen);
        m.playMatch(Fragsters, Gambit);
        m.playMatch(NRG, North);
        m.playMatch(BIG, complexity);
        m.playMatch(HellRaisers, Sprout);
        m.playMatch(NRG, Fragsters);
        m.playMatch(ENCE, mouse);
        m.playMatch(Renegades, Tyloo);
        m.playMatch(Imperial, CyberZen);
        m.playMatch(OpTic, vega);
        m.playMatch(North, Gambit);
        m.playMatch(Renegades, Imperial);
        m.playMatch(Fragsters, North);
        m.playMatch(OpTic, mouse);
        m.playMatch(HellRaisers, CyberZen);
        m.playMatch(BIG, Tyloo);
        m.playMatch(vega, Gambit);
        m.playMatch(BIG, mouse);
        m.playMatch(North, Imperial);
        m.playMatch(vega, HellRaisers);
        m.playMatch(OpTic, Renegades);
        m.playMatch(OpTic, Renegades);
        m.playMatch(BIG, ENCE);
        m.playMatch(ENCE, BIG);
        m.playMatch(ENCE, BIG);
        m.playMatch(vega, Fragsters);
        m.playMatch(vega, Fragsters);
        m.playMatch(NRG, North);
        m.playMatch(NRG, North);
        m.playMatch(ENCE, OpTic);
        m.playMatch(ENCE, OpTic);
        m.playMatch(NRG, vega);
        m.playMatch(vega, NRG);
        m.playMatch(vega, NRG);
        m.playMatch(vega, ENCE);
        m.playMatch(ENCE, vega);
        m.playMatch(ENCE, vega);
        m.playMatch(vega, ENCE);
        m.playMatch(ENCE, vega);
        //</editor-fold>

        //<editor-fold desc="">
        //Roster Changes


        //Games

        //</editor-fold>

        //<editor-fold desc="">
        //Roster Changes


        //Games

        //</editor-fold>

        //<editor-fold desc="">
        //Roster Changes


        //Games

        //</editor-fold>

        //Final Adjustments
        teams.remove(TeamOne);
        teams.remove(Russia);
        teams.remove(Ukraine);

        getRatings(teams);
    }

    public static void getRatings(ArrayList<Team> teams) {
        int size = 30;
        Team[] topTeams = new Team[size];
        Set<Integer> alreadyUsed = new HashSet<>();

        for(int i = 0; i < size; i++) {
            int bestTeamIndex = 0;
            double bestTeamRating = 0;
            for(int j = 0; j < teams.size(); j++) {
                if (!alreadyUsed.contains(j)) {
                    if (teams.get(j).getRating() > bestTeamRating) {
                        bestTeamRating = teams.get(j).getRating();
                        bestTeamIndex = j;
                    }
                }
            }
            topTeams[i] = teams.get(bestTeamIndex);
            alreadyUsed.add(bestTeamIndex);
        }

        for (int i = 0; i < topTeams.length; i++) {
            System.out.println((i + 1) + ". " + topTeams[i]);
            //System.out.println();
        }
    }
}

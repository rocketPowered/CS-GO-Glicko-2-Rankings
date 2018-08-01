import javafx.print.PageLayout;
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

        //Before you go any further, I know that this main method is disgusting and makes you want to puke
        //I hate it too, its absolutely awful
        //But, I'm not a CS major and I don't know the best way to do this. I need to be able to reference teams and
        //  players easily without having to remember where they are in an array. It's probably best to use a
        //  dictionary, but I need to be able to sort teams based on rating to easily view the top teams.
        //If I couldn't do this, then I would need to manually look through a printout of every team (I think) and
        //  manually find the top elo. That sounds even worse, so we're stuck with this monster until you find a
        //  better solution. I'm too lazy to find one myself. I'll try to use some comments to help


        //<editor-fold desc="This is week one, ESEA MDL Global Challenge, January 5-7th 2018">
        Player tucks = new Player("tucks");
        Player pecks = new Player("pecks");
        Player aliStair = new Player("aliStair");
        Player INS = new Player("INS");
        Player malta = new Player("malta");

        players.add(tucks);
        players.add(pecks);
        players.add(aliStair);
        players.add(INS);
        players.add(malta);

        Team Chiefs = new Team("Chiefs");

        Chiefs.addPlayer(tucks);
        Chiefs.addPlayer(pecks);
        Chiefs.addPlayer(aliStair);
        Chiefs.addPlayer(INS);
        Chiefs.addPlayer(malta);

        Player TOAO = new Player("TOAO");
        Player phr = new Player("phr");
        Player Furlan = new Player("Furlan");
        Player GruBy = new Player("GruBy");
        Player snatchie = new Player("snatchie");

        players.add(TOAO);
        players.add(phr);
        players.add(Furlan);
        players.add(GruBy);
        players.add(snatchie);

        Team AGO = new Team("AGO");
        AGO.addPlayer(TOAO);
        AGO.addPlayer(phr);
        AGO.addPlayer(Furlan);
        AGO.addPlayer(GruBy);
        AGO.addPlayer(snatchie);

        Player DEV7L = new Player("DEV7L");
        Player frozen = new Player("frozen");
        Player MonttY = new Player("MonttY");
        Player queztone = new Player("queztone");
        Player ZEDKO = new Player("ZEDKO");

        players.add(DEV7L);
        players.add(frozen);
        players.add(MonttY);
        players.add(queztone);
        players.add(ZEDKO);

        Team eXtatus = new Team("eXtatus");
        eXtatus.addPlayer(DEV7L);
        eXtatus.addPlayer(frozen);
        eXtatus.addPlayer(MonttY);
        eXtatus.addPlayer(queztone);
        eXtatus.addPlayer(ZEDKO);

        Player MAJ3R = new Player("MAJ3R");
        Player XANTARES = new Player("XANTARES");
        Player Calyx = new Player("Calyx");
        Player paz = new Player("paz");
        Player ngiN = new Player("ngiN");

        players.add(MAJ3R);
        players.add(XANTARES);
        players.add(Calyx);
        players.add(paz);
        players.add(ngiN);

        Team Space_Soldiers = new Team("Space Soldiers");
        Space_Soldiers.addPlayer(MAJ3R);
        Space_Soldiers.addPlayer(XANTARES);
        Space_Soldiers.addPlayer(Calyx);
        Space_Soldiers.addPlayer(paz);
        Space_Soldiers.addPlayer(ngiN);

        Player dazzLe = new Player("dazzLe");
        Player Jonji = new Player("Jonji");
        Player moose = new Player("moose");
        Player Ace = new Player("Ace");
        Player vSa = new Player("vSa");

        players.add(dazzLe);
        players.add(Jonji);
        players.add(moose);
        players.add(Ace);
        players.add(vSa);

        Team Rise_Nation = new Team("Rise Nation");
        Rise_Nation.addPlayer(dazzLe);
        Rise_Nation.addPlayer(Jonji);
        Rise_Nation.addPlayer(moose);
        Rise_Nation.addPlayer(Ace);
        Rise_Nation.addPlayer(vSa);

        Player Grim = new Player("Grim");
        Player mCe = new Player("mCe");
        Player xCeed = new Player("xCeed");
        Player Voltage = new Player("Voltage");
        Player Snakes = new Player("Snakes");

        players.add(Grim);
        players.add(mCe);
        players.add(xCeed);
        players.add(Voltage);
        players.add(Snakes);

        Team SoaR = new Team("SoaR");
        SoaR.addPlayer(Grim);
        SoaR.addPlayer(mCe);
        SoaR.addPlayer(xCeed);
        SoaR.addPlayer(Voltage);
        SoaR.addPlayer(Snakes);

        Player swag = new Player("swag");
        Player AZK = new Player("AZK");
        Player witmer = new Player("witmer");
        Player pollo = new Player("pollo");
        Player dapr = new Player("dapr");

        players.add(swag);
        players.add(AZK);
        players.add(witmer);
        players.add(pollo);
        players.add(dapr);

        Team GX = new Team("GX");
        GX.addPlayer(swag);
        GX.addPlayer(AZK);
        GX.addPlayer(witmer);
        GX.addPlayer(pollo);
        GX.addPlayer(dapr);

        Player MAKKA = new Player("MAKKA");
        Player ShoT_UP = new Player("ShoT_UP");
        Player Oderus = new Player("Oderus");
        Player neptune = new Player("neptune");
        Player Douglas = new Player("Douglas");

        players.add(MAKKA);
        players.add(ShoT_UP);
        players.add(Oderus);
        players.add(neptune);
        players.add(Douglas);

        Team Ghost_Academy = new Team("Ghost Academy");
        Ghost_Academy.addPlayer(MAKKA);
        Ghost_Academy.addPlayer(ShoT_UP);
        Ghost_Academy.addPlayer(Oderus);
        Ghost_Academy.addPlayer(neptune);
        Ghost_Academy.addPlayer(Douglas);

        teams.add(Chiefs);
        teams.add(AGO);
        teams.add(eXtatus);
        teams.add(Space_Soldiers);
        teams.add(Rise_Nation);
        teams.add(SoaR);
        teams.add(GX);
        teams.add(Ghost_Academy);


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
        Player Twistzz = new Player("Twistzz");
        Player zews = new Player("zews");
        Player nitr0 = new Player("nitr0");
        Player jdm64 = new Player("jdm64");
        Player EliGE = new Player("EliGE");

        players.add(Twistzz);
        players.add(zews);
        players.add(nitr0);
        players.add(jdm64);
        players.add(EliGE);

        Team Liquid = new Team("Liquid");
        Liquid.addPlayer(Twistzz);
        Liquid.addPlayer(zews);
        Liquid.addPlayer(nitr0);
        Liquid.addPlayer(jdm64);
        Liquid.addPlayer(EliGE);

        Player seangares = new Player("seang@res");
        Player ShahZam = new Player("ShahZam");
        Player SicK = new Player("SicK");
        Player AmaNEk = new Player("AmaNEk");
        Player devoduvek = new Player("devoduvek");

        players.add(seangares);
        players.add(ShahZam);
        players.add(SicK);
        players.add(AmaNEk);
        players.add(devoduvek);

        Team Misfits = new Team("Misfits");
        Misfits.addPlayer(seangares);
        Misfits.addPlayer(ShahZam);
        Misfits.addPlayer(SicK);
        Misfits.addPlayer(AmaNEk);
        Misfits.addPlayer(devoduvek);

        Player USTILO = new Player("USTILO");
        Player Nifty = new Player("Nifty");
        Player jks = new Player("jks");
        Player AZR = new Player("AZR");
        Player NAF = new Player("NAF-FLY");

        players.add(USTILO);
        players.add(Nifty);
        players.add(jks);
        players.add(AZR);
        players.add(NAF);

        Team Renegades = new Team("Renegades");
        Renegades.addPlayer(USTILO);
        Renegades.addPlayer(Nifty);
        Renegades.addPlayer(jks);
        Renegades.addPlayer(AZR);
        Renegades.addPlayer(NAF);

        Player Summer = new Player("Summer");
        Player AttackeR = new Player("AttackeR");
        Player Karsa = new Player("Karsa");
        Player kaze = new Player("kaze");
        Player LOVEYY = new Player("LOVEYY");

        players.add(Summer);
        players.add(AttackeR);
        players.add(Karsa);
        players.add(kaze);
        players.add(LOVEYY);

        Team Flash = new Team("Flash Gaming");
        Flash.addPlayer(Summer);
        Flash.addPlayer(AttackeR);
        Flash.addPlayer(Karsa);
        Flash.addPlayer(kaze);
        Flash.addPlayer(LOVEYY);

        Player KrizzeN = new Player("KrizzeN");
        Player qikert = new Player("qikert");
        Player Jame = new Player("Jame");
        Player dimasick = new Player("dimasick");
        Player buster = new Player("buster");

        players.add(KrizzeN);
        players.add(qikert);
        players.add(Jame);
        players.add(dimasick);
        players.add(buster);

        Team AVANGAR = new Team("AVANGAR");
        AVANGAR.addPlayer(KrizzeN);
        AVANGAR.addPlayer(qikert);
        AVANGAR.addPlayer(Jame);
        AVANGAR.addPlayer(dimasick);
        AVANGAR.addPlayer(buster);

        Player jmqa = new Player("jmqa");
        Player Kvik = new Player("Kvik");
        Player waterfaLLZ = new Player("waterfaLLZ");
        Player Boombl4 = new Player("Boombl4");
        Player balblna = new Player("balblna");

        players.add(jmqa);
        players.add(Kvik);
        players.add(waterfaLLZ);
        players.add(Boombl4);
        players.add(balblna);

        Team QBFire = new Team("Quantum Bellator Fire");
        QBFire.addPlayer(jmqa);
        QBFire.addPlayer(Kvik);
        QBFire.addPlayer(waterfaLLZ);
        QBFire.addPlayer(Boombl4);
        QBFire.addPlayer(balblna);

        Player SIXER = new Player("SIXER");
        Player RpK = new Player("RpK");
        Player ScreaM = new Player("ScreaM");
        Player Happy = new Player("Happy");
        Player xms = new Player("xms");

        players.add(SIXER);
        players.add(RpK);
        players.add(ScreaM);
        players.add(Happy);
        players.add(xms);

        Team EnVyUs = new Team("EnVyUs");
        EnVyUs.addPlayer(SIXER);
        EnVyUs.addPlayer(ScreaM);
        EnVyUs.addPlayer(Happy);
        EnVyUs.addPlayer(xms);
        EnVyUs.addPlayer(RpK);

        Player tarik = new Player("tarik");
        Player autimatic = new Player("autimatic");
        Player stew = new Player("Stewie2k");
        Player Skadoodle = new Player("Skadoodle");
        Player RUSH = new Player("RUSH");

        players.add(tarik);
        players.add(autimatic);
        players.add(stew);
        players.add(Skadoodle);
        players.add(RUSH);

        Team cloud9 = new Team("Cloud 9");
        cloud9.addPlayer(tarik);
        cloud9.addPlayer(autimatic);
        cloud9.addPlayer(stew);
        cloud9.addPlayer(Skadoodle);
        cloud9.addPlayer(RUSH);

        Player karrigan = new Player("karrigan");
        Player olof = new Player("olofmeister");
        Player GuardiaN = new Player("GuardiaN");
        Player NiKo = new Player("NiKo");
        Player rain = new Player("rain");

        players.add(karrigan);
        players.add(olof);
        players.add(GuardiaN);
        players.add(NiKo);
        players.add(rain);

        Team FaZe = new Team("FaZe Clan");
        FaZe.addPlayer(karrigan);
        FaZe.addPlayer(olof);
        FaZe.addPlayer(GuardiaN);
        FaZe.addPlayer(NiKo);
        FaZe.addPlayer(rain);

        Player seized = new Player("siezed");
        Player WorldEdit = new Player("WorldEdit");
        Player wayLander = new Player("wayLander");
        Player markeloff = new Player("markeloff");
        Player B1ad3 = new Player("B1ad3");

        players.add(seized);
        players.add(WorldEdit);
        players.add(wayLander);
        players.add(markeloff);
        players.add(B1ad3);

        Team f3 = new Team("FlipSiz3");
        f3.addPlayer(seized);
        f3.addPlayer(WorldEdit);
        f3.addPlayer(wayLander);
        f3.addPlayer(markeloff);
        f3.addPlayer(B1ad3);

        Player bodyy = new Player("bodyy");
        Player shox = new Player("shox");
        Player kennyS = new Player("kennyS");
        Player NBK = new Player("NBK-");
        Player apEX = new Player("apEX");

        players.add(bodyy);
        players.add(shox);
        players.add(kennyS);
        players.add(NBK);
        players.add(apEX);

        Team g2 = new Team("G2");
        g2.addPlayer(bodyy);
        g2.addPlayer(shox);
        g2.addPlayer(kennyS);
        g2.addPlayer(NBK);
        g2.addPlayer(apEX);

        Player Edward = new Player("Edward");
        Player Zeus = new Player("Zeus");
        Player flamie = new Player("flamie");
        Player s1mple = new Player("s1mple");
        Player electronic = new Player("electronic");

        players.add(Edward);
        players.add(Zeus);
        players.add(flamie);
        players.add(s1mple);
        players.add(electronic);

        Team NaVi = new Team("Natus Vincere");
        NaVi.addPlayer(Edward);
        NaVi.addPlayer(Zeus);
        NaVi.addPlayer(flamie);
        NaVi.addPlayer(s1mple);
        NaVi.addPlayer(electronic);

        Player Spiidi = new Player("Spiidi");
        Player denis = new Player("denis");
        Player zehN = new Player("zehN");
        Player innocent = new Player("innocent");
        Player kRYSTAL = new Player("kRYSTAL");

        players.add(Spiidi);
        players.add(denis);
        players.add(zehN);
        players.add(innocent);
        players.add(kRYSTAL);

        Team Sprout = new Team("Sprout");
        Sprout.addPlayer(Spiidi);
        Sprout.addPlayer(denis);
        Sprout.addPlayer(zehN);
        Sprout.addPlayer(innocent);
        Sprout.addPlayer(kRYSTAL);

        Player chopper = new Player("chopper");
        Player jR = new Player("jR");
        Player keshandr = new Player("keshandr");
        Player mir = new Player("mir");
        Player hutji = new Player("hutji");

        players.add(chopper);
        players.add(jR);
        players.add(keshandr);
        players.add(mir);
        players.add(hutji);

        Team vega = new Team("Vega Squadron");
        vega.addPlayer(chopper);
        vega.addPlayer(jR);
        vega.addPlayer(keshandr);
        vega.addPlayer(mir);
        vega.addPlayer(hutji);

        Player oskar = new Player("oskar");
        Player chrisJ = new Player("chrisJ");
        Player suNny = new Player("suNny");
        Player STYKO = new Player("STYKO");
        Player ropz = new Player("ropz");

        players.add(oskar);
        players.add(chrisJ);
        players.add(suNny);
        players.add(STYKO);
        players.add(ropz);

        Team mouse = new Team("mousesports");
        mouse.addPlayer(oskar);
        mouse.addPlayer(chrisJ);
        mouse.addPlayer(suNny);
        mouse.addPlayer(STYKO);
        mouse.addPlayer(ropz);


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
        Player device = new Player("device");
        Player Kjaerbye = new Player("Kjaerbye");
        Player Xyp9x = new Player("Xyp9x");
        Player dupreeh = new Player("dupreeh");
        Player gla1ve = new Player("gla1ve");

        players.add(device);
        players.add(Kjaerbye);
        players.add(Xyp9x);
        players.add(dupreeh);
        players.add(gla1ve);

        Team Astralis = new Team("Astralis");
        Astralis.addPlayer(device);
        Astralis.addPlayer(Kjaerbye);
        Astralis.addPlayer(Xyp9x);
        Astralis.addPlayer(dupreeh);
        Astralis.addPlayer(gla1ve);

        Player gobb = new Player("gob b");
        Player LEGIJA = new Player("LEGIJA");
        Player tabseN = new Player("tabseN");
        Player keev = new Player("keev");
        Player nex = new Player("nex");

        players.add(gobb);
        players.add(LEGIJA);
        players.add(keev);
        players.add(tabseN);
        players.add(nex);

        Team BIG = new Team("BIG");
        BIG.addPlayer(gobb);
        BIG.addPlayer(LEGIJA);
        BIG.addPlayer(tabseN);
        BIG.addPlayer(keev);
        BIG.addPlayer(nex);

        Player AdreN = new Player("AdreN");
        Player Dosia = new Player("Dosia");
        Player mou = new Player("mou");
        Player Hobbit = new Player("Hobbit");
        Player fitch = new Player("fitch");

        players.add(AdreN);
        players.add(Dosia);
        players.add(mou);
        players.add(Hobbit);
        players.add(fitch);

        Team Gambit = new Team("Gambit");
        Gambit.addPlayer(AdreN);
        Gambit.addPlayer(Dosia);
        Gambit.addPlayer(mou);
        Gambit.addPlayer(Hobbit);
        Gambit.addPlayer(fitch);

        Player valde = new Player("valde");
        Player k0nfig = new Player("k0nfig");
        Player cajunb = new Player("cajunb");
        Player MSL = new Player("MSL");
        Player aizy = new Player("aizy");

        players.add(valde);
        players.add(k0nfig);
        players.add(cajunb);
        players.add(MSL);
        players.add(aizy);

        Team North = new Team("North");
        North.addPlayer(valde);
        North.addPlayer(k0nfig);
        North.addPlayer(cajunb);
        North.addPlayer(MSL);
        North.addPlayer(aizy);

        Player FalleN = new Player("FalleN");
        Player fer = new Player("fer");
        Player coldzera = new Player("coldzera");
        Player TACO = new Player("TACO");
        Player felps = new Player("felps");

        players.add(FalleN);
        players.add(fer);
        players.add(coldzera);
        players.add(TACO);
        players.add(felps);

        Team SK = new Team("SK Gaming");
        SK.addPlayer(FalleN);
        SK.addPlayer(fer);
        SK.addPlayer(coldzera);
        SK.addPlayer(TACO);
        SK.addPlayer(felps);

        Player TaZ = new Player("TaZ");
        Player NEO = new Player("NEO");
        Player pasha = new Player("pashaBiceps");
        Player Snax = new Player("Snax");
        Player byali = new Player("byali");

        players.add(TaZ);
        players.add(NEO);
        players.add(pasha);
        players.add(Snax);
        players.add(byali);

        Team VP = new Team("Virtus Pro");
        VP.addPlayer(TaZ);
        VP.addPlayer(NEO);
        VP.addPlayer(pasha);
        VP.addPlayer(Snax);
        VP.addPlayer(byali);

        Player KRIMZ = new Player("KRIMZ");
        Player Lekr0 = new Player("Lekr0");
        Player Golden = new Player("Golden");
        Player flusha = new Player("flusha");
        Player JW = new Player("JW");

        players.add(KRIMZ);
        players.add(Lekr0);
        players.add(Golden);
        players.add(flusha);
        players.add(JW);

        Team fnatic = new Team("fnatic");
        fnatic.addPlayer(KRIMZ);
        fnatic.addPlayer(Lekr0);
        fnatic.addPlayer(Golden);
        fnatic.addPlayer(flusha);
        fnatic.addPlayer(JW);


        teams.add(Astralis);
        teams.add(BIG);
        teams.add(Gambit);
        teams.add(North);
        teams.add(SK);
        teams.add(VP);
        teams.add(fnatic);

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
        Player steel = new Player("steel");
        players.add(steel);
        Liquid.removePlayer(zews);
        Liquid.removePlayer(jdm64);
        Liquid.addPlayer(NAF);
        Liquid.addPlayer(steel);
        Renegades.removePlayer(NAF);

        Astralis.removePlayer(Kjaerbye);
        North.removePlayer(cajunb);
        North.removePlayer(k0nfig);
        North.addPlayer(Kjaerbye);
        Player mertz = new Player("mertz");
        players.add(mertz);
        North.addPlayer(mertz);

        SK.removePlayer(felps);
        Player boltz = new Player("boltz");
        players.add(boltz);
        SK.addPlayer(boltz);

        GX.removePlayer(swag);
        GX.removePlayer(pollo);
        GX.removePlayer(AZK);
        Player naSteel = new Player("steel");
        Player koosta = new Player("koosta");
        players.add(naSteel);
        players.add(koosta);

        Team Torqued = new Team("Torqued");
        Torqued.addPlayer(swag);
        Torqued.addPlayer(pollo);
        Torqued.addPlayer(AZK);
        Torqued.addPlayer(naSteel);
        Torqued.addPlayer(koosta);

        Player f0rest = new Player("f0rest");
        Player get_right = new Player("GeT_RiGhT");
        Player Xizt = new Player("Xizt");
        Player draken = new Player("draken");
        Player REZ = new Player("REZ");

        players.add(f0rest);
        players.add(get_right);
        players.add(Xizt);
        players.add(draken);
        players.add(REZ);

        Team nip = new Team("Ninjas in Pyjamas");
        nip.addPlayer(f0rest);
        nip.addPlayer(get_right);
        nip.addPlayer(Xizt);
        nip.addPlayer(draken);
        nip.addPlayer(REZ);

        Player es3tag = new Player("es3tag");
        Player JUGi = new Player("JUGi");
        Player MODDII = new Player("MODDII");
        Player niko = new Player("niko");
        Player Snappi = new Player("Snappi");

        players.add(es3tag);
        players.add(JUGi);
        players.add(MODDII);
        players.add(niko);
        players.add(Snappi);

        Team Heroic = new Team("Heroic");
        Heroic.addPlayer(es3tag);
        Heroic.addPlayer(JUGi);
        Heroic.addPlayer(MODDII);
        Heroic.addPlayer(niko);
        Heroic.addPlayer(Snappi);

        teams.add(Torqued);
        teams.add(nip);
        teams.add(Heroic);

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
        Player RUBINO = new Player("RUBINO");
        players.add(RUBINO);
        Heroic.addPlayer(RUBINO);

        Player Magisk = new Player("Magisk");
        Astralis.addPlayer(Magisk);

        VP.removePlayer(TaZ);
        Player MICHU = new Player("MICHU");
        players.add(MICHU);
        VP.addPlayer(MICHU);

        Player jkaem = new Player("jkaem");
        players.add(jkaem);
        Renegades.addPlayer(jkaem);

        Player Mo = new Player("Mo");
        Player xccurate = new Player("xccurrate");
        Player DD = new Player("DD");
        Player BnTeT = new Player("BnTeT");
        Player somebody = new Player("Somebody");

        players.add(Mo);
        players.add(DD);
        players.add(xccurate);
        players.add(BnTeT);
        players.add(somebody);

        Team Tyloo = new Team("TyLoo");
        Tyloo.addPlayer(Mo);
        Tyloo.addPlayer(xccurate);
        Tyloo.addPlayer(DD);
        Tyloo.addPlayer(BnTeT);
        Tyloo.addPlayer(somebody);

        Player XigN = new Player("XigN");
        Player solo = new Player("solo");
        Player HSK = new Player("HSK");
        Player glow = new Player("glow");
        Player zeff = new Player("zeff");

        players.add(XigN);
        players.add(solo);
        players.add(HSK);
        players.add(glow);
        players.add(zeff);

        Team MVPPK = new Team("MVP PK");
        MVPPK.addPlayer(XigN);
        MVPPK.addPlayer(solo);
        MVPPK.addPlayer(HSK);
        MVPPK.addPlayer(glow);
        MVPPK.addPlayer(zeff);

        Player woxic = new Player("woxic");
        Player DeadFox = new Player("DeadFox");
        Player ANGE1 = new Player("ANGE1");
        Player bondik = new Player("bondik");
        Player HS = new Player("HS");

        players.add(woxic);
        players.add(DeadFox);
        players.add(ANGE1);
        players.add(bondik);
        players.add(HS);

        Team HellRaisers = new Team("HellRaisers");
        HellRaisers.addPlayer(woxic);
        HellRaisers.addPlayer(DeadFox);
        HellRaisers.addPlayer(ANGE1);
        HellRaisers.addPlayer(bondik);
        HellRaisers.addPlayer(HS);


        teams.add(Tyloo);
        teams.add(MVPPK);
        teams.add(HellRaisers);

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
        Player tiziaN = new Player("tiziaN");
        Player luckeRRR = new Player("luckeRRR");
        players.add(tiziaN);
        players.add(luckeRRR);
        BIG.addPlayer(tiziaN);
        BIG.addPlayer(luckeRRR);

        Player twist = new Player("twist");
        Player discodoplan = new Player("disco doplan");
        Player freddieb = new Player("freddieb");
        Player hampus = new Player("hampus");
        Player Brollan = new Player("Brollan");

        players.add(twist);
        players.add(discodoplan);
        players.add(freddieb);
        players.add(hampus);
        players.add(Brollan);

        Team GODSENT = new Team("GODSENT");
        GODSENT.addPlayer(twist);
        GODSENT.addPlayer(discodoplan);
        GODSENT.addPlayer(freddieb);
        GODSENT.addPlayer(hampus);
        GODSENT.addPlayer(Brollan);

        Player Coffee = new Player("Coffee");
        Player lollipop21k = new Player("lollipop21k");
        Player SADZED = new Player("SADZED");
        Player boX = new Player("boX");
        Player fnyekes = new Player("fnyekes");

        players.add(Coffee);
        players.add(lollipop21k);
        players.add(SADZED);
        players.add(boX);
        players.add(fnyekes);

        Team GoodJob = new Team("GoodJob");
        GoodJob.addPlayer(Coffee);
        GoodJob.addPlayer(lollipop21k);
        GoodJob.addPlayer(SADZED);
        GoodJob.addPlayer(boX);
        GoodJob.addPlayer(fnyekes);

        Sprout.removePlayer(zehN);
        Player NaToSaphiX = new Player("NaToSaphiX");
        players.add(NaToSaphiX);
        Sprout.addPlayer(NaToSaphiX);

        Misfits.removePlayer(devoduvek);
        Player DJOXiC = new Player("DJOXiC");
        Player huNter = new Player("huNter");
        Player LETN1 = new Player("LETN1");
        Player emi = new Player("emi");

        players.add(DJOXiC);
        players.add(huNter);
        players.add(LETN1);
        players.add(emi);

        Team Valiance = new Team("Valiance");
        Valiance.addPlayer(devoduvek);
        Valiance.addPlayer(DJOXiC);
        Valiance.addPlayer(huNter);
        Valiance.addPlayer(LETN1);
        Valiance.addPlayer(emi);

        Player pNshr = new Player("pNshr");
        Player SPELLAN = new Player("SPELLAN");
        Player bubble = new Player("bubble");
        Player SHiPZ = new Player("SHiPZ");
        Player v1c7oR = new Player("v1c7oR");

        players.add(pNshr);
        players.add(SPELLAN);
        players.add(bubble);
        players.add(SHiPZ);
        players.add(v1c7oR);

        Team Windigo = new Team("Windigo");
        Windigo.addPlayer(pNshr);
        Windigo.addPlayer(bubble);
        Windigo.addPlayer(SPELLAN);
        Windigo.addPlayer(SHiPZ);
        Windigo.addPlayer(v1c7oR);


        teams.add(GODSENT);
        teams.add(GoodJob);
        teams.add(Valiance);
        teams.add(Windigo);


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
        Player dennis = new Player("dennis");
        players.add(dennis);
        nip.addPlayer(dennis);


        Chiefs.removePlayer(aliStair);
        Player Hatz = new Player("Hatz");
        Player emagine = new Player("emagine");
        Player Sico = new Player("Sico");
        Player liazz = new Player("liazz");

        players.add(Hatz);
        players.add(emagine);
        players.add(Sico);
        players.add(liazz);

        Team ORDER = new Team("ORDER");
        ORDER.addPlayer(aliStair);
        ORDER.addPlayer(Hatz);
        ORDER.addPlayer(emagine);
        ORDER.addPlayer(Sico);
        ORDER.addPlayer(liazz);

        teams.add(ORDER);

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
        Player BURNRUOk = new Player("BURNRUOk");
        players.add(BURNRUOk);
        ORDER.addPlayer(BURNRUOk);
        ORDER.addPlayer(malta);

        Player ImpressioN = new Player("ImpressioN");
        Player Tommy = new Player("Tommy");
        Player splashske = new Player("splashske");
        Player Benkai = new Player("Benkai");
        Player moxie = new Player("moxie");

        players.add(ImpressioN);
        players.add(Tommy);
        players.add(splashske);
        players.add(Benkai);
        players.add(moxie);

        Team BOOTds = new Team("BOOT-d[S]");
        BOOTds.addPlayer(ImpressioN);
        BOOTds.addPlayer(Tommy);
        BOOTds.addPlayer(splashske);
        BOOTds.addPlayer(Benkai);
        BOOTds.addPlayer(moxie);

        Player ViperDemon = new Player("ViperDemon");
        Player bnwGiggs = new Player("bnwGiggs");
        Player veta = new Player("veta");
        Player MAIROLLS = new Player("MAIROLLS");
        Player Kntz = new Player("Kntz");

        players.add(ViperDemon);
        players.add(bnwGiggs);
        players.add(veta);
        players.add(MAIROLLS);
        players.add(Kntz);

        Team AlphaRed = new Team("Alpha Red");
        AlphaRed.addPlayer(ViperDemon);
        AlphaRed.addPlayer(bnwGiggs);
        AlphaRed.addPlayer(veta);
        AlphaRed.addPlayer(MAIROLLS);
        AlphaRed.addPlayer(Kntz);

        Player s550 = new Player("s550");
        Player dmm = new Player("dmm");
        Player ECOKING = new Player("ECOKING");
        Player Lamplight = new Player("LampLight");
        Player Gn = new Player("Gn");

        players.add(s550);
        players.add(dmm);
        players.add(ECOKING);
        players.add(Lamplight);
        players.add(Gn);

        Team MAX = new Team("MAX");
        MAX.addPlayer(s550);
        MAX.addPlayer(dmm);
        MAX.addPlayer(ECOKING);
        MAX.addPlayer(Lamplight);
        MAX.addPlayer(Gn);

        Player Jewelry = new Player("Jewelry");
        Player jackhan = new Player("jackhan");
        Player Mrsix = new Player("Mr.six");
        Player Drea3er = new Player("Drea3er");
        Player xiaosaGe = new Player("xiaosaGe");

        players.add(Jewelry);
        players.add(jackhan);
        players.add(Mrsix);
        players.add(Drea3er);
        players.add(xiaosaGe);

        Team New4 = new Team("New4");
        New4.addPlayer(Jewelry);
        New4.addPlayer(Mrsix);
        New4.addPlayer(Drea3er);
        New4.addPlayer(jackhan);
        New4.addPlayer(xiaosaGe);

        Player LONSDALE = new Player("LONSDALE");
        Player Gratisfaction = new Player("Gratisfaction");
        Player n1ck = new Player("n1ck");
        Player RaZ = new Player("RaZ");

        players.add(LONSDALE);
        players.add(Gratisfaction);
        players.add(n1ck);
        players.add(RaZ);

        Team Parallax = new Team("Parallax");
        Parallax.addPlayer(LONSDALE);
        Parallax.addPlayer(Gratisfaction);
        Parallax.addPlayer(n1ck);
        Parallax.addPlayer(RaZ);
        Parallax.addPlayer(Sico);

        Player Sys = new Player("Sys");
        Player Eeyore = new Player("Eeyore");
        Player roseau = new Player("roseau");
        Player FrostMisty = new Player("FrostMisty");

        players.add(Sys);
        players.add(Eeyore);
        players.add(roseau);
        players.add(FrostMisty);

        Team Recca = new Team("Recca");
        Recca.addPlayer(Sys);
        Recca.addPlayer(xccurate);
        Recca.addPlayer(Eeyore);
        Recca.addPlayer(roseau);
        Recca.addPlayer(FrostMisty);

        Player hypathor = new Player("hypathor");
        Player TENGU9 = new Player("TENGU9");
        Player CHIMEI = new Player("CHIMEI");
        Player chancehangtsz = new Player("chancehangtsz");
        Player fagger = new Player("fagger");

        players.add(hypathor);
        players.add(TENGU9);
        players.add(CHIMEI);
        players.add(chancehangtsz);
        players.add(fagger);

        Team EMC = new Team("EMC");
        EMC.addPlayer(hypathor);
        EMC.addPlayer(TENGU9);
        EMC.addPlayer(CHIMEI);
        EMC.addPlayer(chancehangtsz);
        EMC.addPlayer(fagger);

        Player poem = new Player("poem");
        Player takej = new Player("takej");
        Player Laz = new Player("Laz");
        Player crow = new Player("crow");
        Player barce = new Player("barce");

        players.add(poem);
        players.add(takej);
        players.add(Laz);
        players.add(crow);
        players.add(barce);

        Team SCARZ = new Team("SCARZ Absolute");
        SCARZ.addPlayer(poem);
        SCARZ.addPlayer(takej);
        SCARZ.addPlayer(Laz);
        SCARZ.addPlayer(crow);
        SCARZ.addPlayer(barce);

        Player tb = new Player("tb");
        Player HZ = new Player("HZ");
        Player advent = new Player("advent");
        Player zhokiNg = new Player("zhokiNh");
        Player Savage = new Player("Savage");

        players.add(tb);
        players.add(advent);
        players.add(HZ);
        players.add(zhokiNg);
        players.add(Savage);

        Team ViCi = new Team("ViCi");
        ViCi.addPlayer(tb);
        ViCi.addPlayer(advent);
        ViCi.addPlayer(HZ);
        ViCi.addPlayer(zhokiNg);
        ViCi.addPlayer(Savage);

        Team Ukraine = new Team("Ukraine");
        Ukraine.addPlayer(markeloff);
        Ukraine.addPlayer(Edward);
        Ukraine.addPlayer(Zeus);
        Ukraine.addPlayer(bondik);
        Ukraine.addPlayer(s1mple);

        Player Ex6TenZ = new Player("Ex6TenZ");
        Player Faris = new Player("Faris");
        Player to1nou = new Player("to1nou");
        Player YOUYOU = new Player("YOUYOU");

        players.add(Ex6TenZ);
        players.add(Faris);
        players.add(to1nou);
        players.add(YOUYOU);

        Team Belgium = new Team("Belgium");
        Belgium.addPlayer(Ex6TenZ);
        Belgium.addPlayer(ScreaM);
        Belgium.addPlayer(Faris);
        Belgium.addPlayer(to1nou);
        Belgium.addPlayer(YOUYOU);

        Player kioShiMa = new Player("kioShiMa");
        Player hAdji = new Player("hAdji");

        players.add(kioShiMa);
        players.add(hAdji);

        EnVyUs.removePlayer(ScreaM);
        EnVyUs.removePlayer(xms);
        EnVyUs.addPlayer(kioShiMa);
        EnVyUs.addPlayer(hAdji);

        Player Kairi = new Player("Kairi");
        Player loWel = new Player("loWel");
        Player EasTor = new Player("EasTor");
        Player SOKER = new Player("SOKER");
        Player mixwell = new Player("mixwell");

        players.add(Kairi);
        players.add(loWel);
        players.add(EasTor);
        players.add(SOKER);
        players.add(mixwell);

        Team Wololos = new Team("Wololos");
        Wololos.addPlayer(Kairi);
        Wololos.addPlayer(EasTor);
        Wololos.addPlayer(SOKER);
        Wololos.addPlayer(mixwell);
        Wololos.addPlayer(loWel);

        Player Max0b = new Player("Max0b");
        Player Kan4 = new Player("Kan4");
        Player LoWkii = new Player("LoWkii");
        Player Polox = new Player("Polox");
        Player Maka = new Player("Maka");

        players.add(Max0b);
        players.add(Kan4);
        players.add(LoWkii);
        players.add(Polox);
        players.add(Maka);

        Team Limitless = new Team("Limitless");
        Limitless.addPlayer(Max0b);
        Limitless.addPlayer(Kan4);
        Limitless.addPlayer(LoWkii);
        Limitless.addPlayer(Polox);
        Limitless.addPlayer(Maka);

        Player hooch = new Player("hooch");
        players.add(hooch);

        Team Russia = new Team("Russia");
        Russia.addPlayer(Dosia);
        Russia.addPlayer(seized);
        Russia.addPlayer(WorldEdit);
        Russia.addPlayer(electronic);
        Russia.addPlayer(hooch);


        Player effys = new Player("effys");
        Player cardiac = new Player("cardiac");
        Player krZ = new Player("krZ");
        Player vek = new Player("vek");
        Player Uber = new Player("Uber");

        players.add(effys);
        players.add(cardiac);
        players.add(krZ);
        players.add(vek);
        players.add(Uber);

        Team Onliners = new Team("The Onliners");
        Onliners.addPlayer(effys);
        Onliners.addPlayer(cardiac);
        Onliners.addPlayer(krZ);
        Onliners.addPlayer(vek);
        Onliners.addPlayer(Uber);

        Player NOtA = new Player("NOtA");
        Player natsu = new Player("natsu");
        Player thyx = new Player("thyx");
        Player nOxii = new Player("n0xii");
        Player Malikof = new Player("Malikof");

        players.add(NOtA);
        players.add(natsu);
        players.add(thyx);
        players.add(nOxii);
        players.add(Malikof);

        Team VivaAlgeria = new Team("Viva Algeria");
        VivaAlgeria.addPlayer(NOtA);
        VivaAlgeria.addPlayer(natsu);
        VivaAlgeria.addPlayer(thyx);
        VivaAlgeria.addPlayer(nOxii);
        VivaAlgeria.addPlayer(Malikof);

        Player freakazoid = new Player("freakazoid");
        Player SileNt = new Player("SileNt");
        Player ryan = new Player("ryan");
        Player Zellsis = new Player("Zellsis");
        Player cooper = new Player("Cooper-");

        players.add(freakazoid);
        players.add(SileNt);
        players.add(ryan);
        players.add(Zellsis);
        players.add(cooper);

        Team SwolePatrol = new Team("Swole Patrol");
        SwolePatrol.addPlayer(freakazoid);
        SwolePatrol.addPlayer(SileNt);
        SwolePatrol.addPlayer(ryan);
        SwolePatrol.addPlayer(Zellsis);
        SwolePatrol.addPlayer(cooper);

        Player els = new Player("els");
        Player OCEAN = new Player("OCEAN");
        Player dsr = new Player("dsr");
        Player LILMAN = new Player("LILMAN");
        Player TenZ = new Player("TenZ");

        players.add(els);
        players.add(OCEAN);
        players.add(dsr);
        players.add(LILMAN);
        players.add(TenZ);

        Team subtLe = new Team("subtLe");
        subtLe.addPlayer(els);
        subtLe.addPlayer(OCEAN);
        subtLe.addPlayer(dsr);
        subtLe.addPlayer(LILMAN);
        subtLe.addPlayer(TenZ);

        Player JT = new Player("JT");
        Player Detrony = new Player("Detrony");
        Player Elusive = new Player("Elusive");
        Player Sonic = new Player("Sonic");
        Player Fadey = new Player("Fadey");

        players.add(JT);
        players.add(Detrony);
        players.add(Elusive);
        players.add(Sonic);
        players.add(Fadey);

        Team Bravado = new Team("Bravado");
        Bravado.addPlayer(JT);
        Bravado.addPlayer(Detrony);
        Bravado.addPlayer(Elusive);
        Bravado.addPlayer(Sonic);
        Bravado.addPlayer(Fadey);

        Player caike = new Player("caike");
        Player iDk = new Player("iDk");
        Player trk = new Player("trk");
        Player Maluk3 = new Player("Maluk3");
        Player mch = new Player("mch");

        players.add(caike);
        players.add(iDk);
        players.add(trk);
        players.add(Maluk3);
        players.add(mch);

        Team TeamOne = new Team("TeamOne");
        TeamOne.addPlayer(caike);
        TeamOne.addPlayer(iDk);
        TeamOne.addPlayer(trk);
        TeamOne.addPlayer(Maluk3);
        TeamOne.addPlayer(mch);

        Player Zote = new Player("Zote");
        Player NikoM = new Player("NikoM");
        Player Noktse = new Player("Noktse");
        Player nbl = new Player("nbl");
        Player a1962 = new Player("1962");

        players.add(Zote);
        players.add(NikoM);
        players.add(nbl);
        players.add(Noktse);
        players.add(a1962);

        Team Isurus = new Team("Isurus");
        Isurus.addPlayer(Zote);
        Isurus.addPlayer(NikoM);
        Isurus.addPlayer(nbl);
        Isurus.addPlayer(Noktse);
        Isurus.addPlayer(a1962);


        teams.add(BOOTds);
        teams.add(AlphaRed);
        teams.add(MAX);
        teams.add(New4);
        teams.add(Parallax);
        teams.add(Recca);
        teams.add(EMC);
        teams.add(SCARZ);
        teams.add(ViCi);
        //teams.add(Ukraine); not adding this as an actual team because it was made for 1 tournament
        //teams.add(Belgium); same thing here
        //teams.add(Russia); and here
        teams.add(Wololos);
        teams.add(Limitless);
        teams.add(Onliners);
        teams.add(VivaAlgeria);
        teams.add(SwolePatrol);
        teams.add(subtLe);
        teams.add(Bravado);
        teams.add(TeamOne);
        teams.add(Isurus);

        //Now on to Matches
/*
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
        m.playMatch(fnatic, Space_Soldiers);*/

        //that was pretty awful wasn't it. I hope nobody ever has a tournament this big again

        //</editor-fold>

        //<editor-fold desc="Starladder Imba Invatational Mar 22-25th">
        //Roster Changes
        Flash.removePlayer(Karsa);
        Flash.removePlayer(kaze);

        Player auman = new Player("auman");
        Player Ayeon = new Player("Ayeon");
        players.add(auman);
        players.add(Ayeon);

        Flash.addPlayer(auman);
        Flash.addPlayer(Ayeon);

        Player S0tF1k = new Player("S0tF1k");
        Player COLDYY1 = new Player("COLDYY1");
        Player somedieyoung = new Player("somedieyoung");
        Player DavCost = new Player("DavCost");
        Player Dima = new Player("Dima");

        players.add(S0tF1k);
        players.add(COLDYY1);
        players.add(somedieyoung);
        players.add(DavCost);
        players.add(Dima);

        Team Spirit = new Team("Spirit");
        Spirit.addPlayer(S0tF1k);
        Spirit.addPlayer(COLDYY1);
        Spirit.addPlayer(somedieyoung);
        Spirit.addPlayer(DavCost);
        Spirit.addPlayer(Dima);

        teams.add(Spirit);

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
        Player Tomkeejs = new Player("Tomkeejs");
        Player EYO = new Player("EYO");
        Player capseN = new Player("capseN");
        Player Tusi = new Player("Tusi");
        Player beastik = new Player("beastik");

        players.add(Tomkeejs);
        players.add(EYO);
        players.add(capseN);
        players.add(Tusi);
        players.add(beastik);

        Team DarkTigers = new Team("Dark Tigers");
        DarkTigers.addPlayer(Tomkeejs);
        DarkTigers.addPlayer(EYO);
        DarkTigers.addPlayer(capseN);
        DarkTigers.addPlayer(Tusi);
        DarkTigers.addPlayer(beastik);


        Player fleav = new Player("fleav");
        Player Theelive = new Player("The eLiVe");
        Player gabesson = new Player("gabesson");
        Player Zero = new Player("Zero");
        Player kolor = new Player("kolor");

        players.add(fleav);
        players.add(Theelive);
        players.add(gabesson);
        players.add(Zero);
        players.add(kolor);

        Team GameAgents = new Team("GameAgents");
        GameAgents.addPlayer(fleav);
        GameAgents.addPlayer(Theelive);
        GameAgents.addPlayer(gabesson);
        GameAgents.addPlayer(Zero);
        GameAgents.addPlayer(kolor);

        Player ISSAA = new Player("ISSAA");
        players.add(ISSAA);
        HellRaisers.removePlayer(HS);
        HellRaisers.addPlayer(ISSAA);

        Player ponczek = new Player("ponczek");
        Player Goofy = new Player("Goofy");
        Player tecek = new Player("tecek");
        Player SOON = new Player("SOON");
        Player stark = new Player("stark");

        players.add(ponczek);
        players.add(Goofy);
        players.add(tecek);
        players.add(SOON);
        players.add(stark);

        Team xkom = new Team("x-kom");
        xkom.addPlayer(ponczek);
        xkom.addPlayer(Goofy);
        xkom.addPlayer(tecek);
        xkom.addPlayer(SOON);
        xkom.addPlayer(stark);


        teams.add(DarkTigers);
        teams.add(GameAgents);
        teams.add(xkom);

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
        Player TENZKI = new Player("TENZKI");
        Player AcilioN = new Player("AcilioN");
        Player nexa = new Player("nexa");
        Player EspiranTo = new Player("EspiranTo");
        Player nukkye = new Player("nukkye");

        players.add(TENZKI);
        players.add(AcilioN);
        players.add(nexa);
        players.add(EspiranTo);
        players.add(nukkye);

        Team Imperial = new Team("Imperial");
        Imperial.addPlayer(TENZKI);
        Imperial.addPlayer(AcilioN);
        Imperial.addPlayer(nexa);
        Imperial.addPlayer(EspiranTo);
        Imperial.addPlayer(nukkye);

        Player Impulse = new Player("Impulse");
        Player NENO = new Player("NENO");
        players.add(Impulse);
        players.add(NENO);

        Valiance.removePlayer(devoduvek);
        Valiance.removePlayer(DJOXiC);
        Valiance.addPlayer(Impulse);
        Valiance.addPlayer(NENO);

        Heroic.removePlayer(JUGi);
        Heroic.addPlayer(es3tag);

        Player mouz = new Player("mouz");
        Player MINISE = new Player("MINISE");
        Player rallen = new Player("rallen");
        Player reatz = new Player("reatz");

        players.add(mouz);
        players.add(MINISE);
        players.add(rallen);
        players.add(reatz);

        Team Kinguin = new Team("Kinguin");
        Kinguin.addPlayer(TaZ);
        Kinguin.addPlayer(mouz);
        Kinguin.addPlayer(MINISE);
        Kinguin.addPlayer(rallen);
        Kinguin.addPlayer(reatz);


        teams.add(Imperial);

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

        Player erkaSt = new Player("erkaSt");
        Player Dickstacy = new Player("Dickstacy");
        Player dexter = new Player("dexter");

        players.add(erkaSt);
        players.add(Dickstacy);
        players.add(dexter);

        Team Grayhound = new Team("Grayhound");
        Grayhound.addPlayer(Gratisfaction);
        Grayhound.addPlayer(BURNRUOk);
        Grayhound.addPlayer(erkaSt);
        Grayhound.addPlayer(Dickstacy);
        Grayhound.addPlayer(dexter);

        teams.add(Grayhound);

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
        Player refrezh = new Player("refrezh");
        Player stavn = new Player("stavn");
        Player dragonfly = new Player("dragonfly");
        Player Bubski = new Player("Bubski");
        Player torben = new Player("torben");

        players.add(refrezh);
        players.add(stavn);
        players.add(dragonfly);
        players.add(Bubski);
        players.add(torben);

        Team Fragsters = new Team("Fragsters");
        Fragsters.addPlayer(refrezh);
        Fragsters.addPlayer(stavn);
        Fragsters.addPlayer(dragonfly);
        Fragsters.addPlayer(Bubski);
        Fragsters.addPlayer(torben);

        Player FREDDyFROG = new Player("FREDDyFROG");
        Player Baaten = new Player("Baaten");
        Player Relaxa = new Player("Relaxa");
        Player PlesseN = new Player("PlesseN");
        Player kreaz = new Player("kreaz");

        players.add(FREDDyFROG);
        players.add(Baaten);
        players.add(Relaxa);
        players.add(PlesseN);
        players.add(kreaz);

        Team RedReserve = new Team("Red Reserve");
        RedReserve.addPlayer(FREDDyFROG);
        RedReserve.addPlayer(Baaten);
        RedReserve.addPlayer(Relaxa);
        RedReserve.addPlayer(PlesseN);
        RedReserve.addPlayer(kreaz);

        Player liTTle = new Player("liTTle");
        Player Jerry = new Player("Jerry");
        Player facecrack = new Player("facecrack");
        Player scoobyxie = new Player("scoobyxie");
        Player svyat = new Player("svyat");

        players.add(liTTle);
        players.add(Jerry);
        players.add(facecrack);
        players.add(scoobyxie);
        players.add(svyat);

        Team forZe = new Team("forZe");
        forZe.addPlayer(liTTle);
        forZe.addPlayer(Jerry);
        forZe.addPlayer(facecrack);
        forZe.addPlayer(scoobyxie);
        forZe.addPlayer(svyat);

        teams.add(Fragsters);
        teams.add(RedReserve);
        teams.add(forZe);

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
        Player FNS = new Player("FNS");
        players.add(FNS);
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
        Player dobu = new Player("dobu");
        Player kabal = new Player("kabal");
        Player PTC = new Player("PTC");
        Player forget = new Player("forget");

        players.add(dobu);
        players.add(kabal);
        players.add(PTC);
        players.add(forget);

        Team FivePower = new Team("5POWER");
        FivePower.addPlayer(dobu);
        FivePower.addPlayer(kabal);
        FivePower.addPlayer(PTC);
        FivePower.addPlayer(forget);
        FivePower.addPlayer(xiaosaGe);

        Player bottle = new Player("bottle");
        Player ayaya = new Player("ayaya");
        Player shuadapai = new Player("shuadapai");
        Player AE = new Player("AE");
        Player Mrmao = new Player("Mr.mao");

        players.add(bottle);
        players.add(ayaya);
        players.add(shuadapai);
        players.add(AE);
        players.add(Mrmao);

        Team Eclipse = new Team("Eclipse");
        Eclipse.addPlayer(bottle);
        Eclipse.addPlayer(ayaya);
        Eclipse.addPlayer(shuadapai);
        Eclipse.addPlayer(AE);
        Eclipse.addPlayer(Mrmao);

        Player smooya = new Player("smooya");
        players.add(smooya);

        BIG.removePlayer(gobb);
        BIG.removePlayer(luckeRRR);
        BIG.addPlayer(smooya);
        BIG.addPlayer(LEGIJA);

        teams.add(FivePower);
        teams.add(Eclipse);

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
        Player w1nt3r = new Player("w1nt3r");
        players.add(w1nt3r);
        BOOTds.addPlayer(w1nt3r);

        Grayhound.removePlayer(BURNRUOk);
        ORDER.removePlayer(malta);
        Grayhound.addPlayer(malta);

        Player FugLy = new Player("FugLy");
        Player Brehze = new Player("Brehze");
        Player nahtE = new Player("nahtE");
        Player CeRq = new Player("CeRq");
        Player daps = new Player("daps");

        players.add(FugLy);
        players.add(Brehze);
        players.add(nahtE);
        players.add(CeRq);
        players.add(daps);

        Team NRG = new Team("NRG");
        NRG.addPlayer(FugLy);
        NRG.addPlayer(Brehze);
        NRG.addPlayer(nahtE);
        NRG.addPlayer(CeRq);
        NRG.addPlayer(daps);

        Player BL1TZ = new Player("BL1TZ");
        Player Lacore = new Player("Lacore");
        Player stat = new Player("stat");
        Player soju_j = new Player("soju_j");
        Parallax.removePlayer(LONSDALE);

        players.add(BL1TZ);
        players.add(Lacore);
        players.add(stat);
        players.add(soju_j);

        Team Legacy = new Team("Legacy");
        Legacy.addPlayer(BL1TZ);
        Legacy.addPlayer(Lacore);
        Legacy.addPlayer(stat);
        Legacy.addPlayer(soju_j);
        Legacy.addPlayer(LONSDALE);

        Player ap0c = new Player("ap0c");
        Player flickz = new Player("flickz");
        Player Texta = new Player("Texta");
        Player sterling = new Player("sterling");

        players.add(ap0c);
        players.add(flickz);
        players.add(Texta);
        players.add(sterling);

        Chiefs.removePlayer(pecks);
        Chiefs.removePlayer(INS);
        Chiefs.addPlayer(ap0c);
        Chiefs.addPlayer(flickz);
        Chiefs.addPlayer(Texta);
        Chiefs.addPlayer(sterling);

        ORDER.addPlayer(Sico);
        ORDER.addPlayer(aliStair);

        teams.add(NRG);
        teams.add(Legacy);

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
        Player bld = new Player("bld");
        Player zqkS = new Player("zqkS");
        Player xand = new Player("xand");
        Player dukeN = new Player("dukeN");
        Player delboNi = new Player("delboNi");

        players.add(bld);
        players.add(zqkS);
        players.add(xand);
        players.add(dukeN);
        players.add(delboNi);

        Team YeaH = new Team("YeaH!");
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

        Player Relyks = new Player("Relyks");
        players.add(Relyks);

        Team eUnited = new Team("eUnited");
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
        Player DESPE = new Player("DESPE");
        players.add(DESPE);

        Space_Soldiers.removePlayer(Calyx);
        Space_Soldiers.addPlayer(DESPE);

        Player friberg = new Player("friberg");
        Player cromen = new Player("cromen");

        players.add(cromen);
        players.add(friberg);

        Heroic.removePlayer(RUBINO);
        Heroic.removePlayer(Snappi);
        Heroic.addPlayer(friberg);
        Heroic.addPlayer(cromen);

        Player exit = new Player("exit");
        Player leo_druNky = new Player("leo_druNky");
        Player RCF = new Player("RCF");
        Player jnt = new Player("jnt");
        Player nak = new Player("nak");

        players.add(exit);
        players.add(leo_druNky);
        players.add(RCF);
        players.add(jnt);
        players.add(nak);

        Team Sharks = new Team("Sharks");
        Sharks.addPlayer(exit);
        Sharks.addPlayer(leo_druNky);
        Sharks.addPlayer(RCF);
        Sharks.addPlayer(jnt);
        Sharks.addPlayer(nak);

        Player gade = new Player("gade");
        players.add(gade);

        Team OpTic = new Team("OpTic");
        OpTic.addPlayer(k0nfig);
        OpTic.addPlayer(Snappi);
        OpTic.addPlayer(cajunb);
        OpTic.addPlayer(JUGi);
        OpTic.addPlayer(gade);


        teams.add(Sharks);
        teams.add(OpTic);


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
        //none! yay!

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
        //None again!

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
        Player Freeman = new Player("Freeman");
        players.add(Freeman);
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

        Player yel = new Player("yel");
        Player PKL = new Player("PKL");
        Player SHOOWTiME = new Player("SHOOWTiME");
        Player nekiz = new Player("nekiz");

        players.add(yel);
        players.add(PKL);
        players.add(SHOOWTiME);
        players.add(nekiz);

        Team Luminosity = new Team("Luminosity");
        Luminosity.addPlayer(yel);
        Luminosity.addPlayer(PKL);
        Luminosity.addPlayer(SHOOWTiME);
        Luminosity.addPlayer(nekiz);
        Luminosity.addPlayer(steel);

        Misfits.removePlayer(ShahZam);
        Misfits.removePlayer(SicK);

        Player dephh = new Player("dephh");
        Player stanislaw = new Player("stanislaw");
        Player yay = new Player("yay");
        Player ANDROID = new Player("ANDROID");

        players.add(dephh);
        players.add(stanislaw);
        players.add(yay);
        players.add(ANDROID);

        Team complexity = new Team("compLexity");
        complexity.addPlayer(dephh);
        complexity.addPlayer(stanislaw);
        complexity.addPlayer(yay);
        complexity.addPlayer(ANDROID);
        complexity.addPlayer(ShahZam);

        Player cadiaN = new Player("cadiaN");
        Player Rickeh = new Player("Rickeh");
        Player vice = new Player("vice");
        Player Hiko = new Player("Hiko");

        players.add(cadiaN);
        players.add(Rickeh);
        players.add(vice);
        players.add(Hiko);

        Team Rogue = new Team("Rogue");
        Rogue.addPlayer(cadiaN);
        Rogue.addPlayer(Rickeh);
        Rogue.addPlayer(vice);
        Rogue.addPlayer(Hiko);
        Rogue.addPlayer(SicK);

        teams.add(Luminosity);
        teams.add(complexity);
        teams.add(Rogue);

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
        Player syrsoN = new Player("syrsoN");
        Player HUNDEN = new Player("HUNDEN");
        Player sftN = new Player("sftN");
        Player Console = new Player("Console");
        Player k1to = new Player("k1to");

        players.add(syrsoN);
        players.add(HUNDEN);
        players.add(sftN);
        players.add(Console);
        players.add(k1to);

        Team ALTERNATE = new Team("ALTERNATE aTTaX");
        ALTERNATE.addPlayer(syrsoN);
        ALTERNATE.addPlayer(HUNDEN);
        ALTERNATE.addPlayer(sftN);
        ALTERNATE.addPlayer(Console);
        ALTERNATE.addPlayer(k1to);

        Player allu = new Player("allu");
        Player Aerial = new Player("Aerial");
        Player xseveN = new Player("xseveN");
        Player Aleksib = new Player("Aleksib");
        Player sergej = new Player("sergej");

        players.add(allu);
        players.add(Aerial);
        players.add(xseveN);
        players.add(Aleksib);
        players.add(sergej);

        Team ENCE = new Team("ENCE");
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

        //Online technically but this really helps balance some elo
        //<editor-fold desc="ESL One Cologne Europe Closed Qualifier">
        //Roster Changes
        Player bitchiR = new Player("bitchiR");
        Player sperr = new Player("sperr");
        Player ViztA = new Player("VizrA");
        Player shokz = new Player("shokz");
        Player Dodz = new Player("Dodz");

        players.add(bitchiR);
        players.add(sperr);
        players.add(ViztA);
        players.add(shokz);
        players.add(Dodz);

        Team WASD = new Team("WASD");
        WASD.addPlayer(bitchiR);
        WASD.addPlayer(sperr);
        WASD.addPlayer(ViztA);
        WASD.addPlayer(shokz);
        WASD.addPlayer(Dodz);

        //Games
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

        Player SmithZz = new Player("SmithZz");
        players.add(SmithZz);

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
        Player meisoN = new Player("meisoN");
        Player mopoz = new Player("mopoz");
        Player donQ = new Player("donQ");
        Player MUTiRiS = new Player("MUTiRiS");
        Player dragunov = new Player("dragunov");

        players.add(meisoN);
        players.add(mopoz);
        players.add(donQ);
        players.add(MUTiRiS);
        players.add(dragunov);

        Team Movistar = new Team("Movistar Riders");
        Movistar.addPlayer(meisoN);
        Movistar.addPlayer(mopoz);
        Movistar.addPlayer(donQ);
        Movistar.addPlayer(MUTiRiS);
        Movistar.addPlayer(dragunov);

        Team Winstrike =  QBFire;
        Winstrike.renameTeam("Winstrike");

        Sprout.removePlayer(innocent);
        Wololos.removePlayer(loWel);
        Player fox = new Player("fox");
        Player cheti = new Player("cheti");

        players.add(fox);
        players.add(cheti);

        Team TempoStorm = new Team("Tempo Storm");
        TempoStorm.addPlayer(fox);
        TempoStorm.addPlayer(loWel);
        TempoStorm.addPlayer(cheti);
        TempoStorm.addPlayer(innocent);
        TempoStorm.addPlayer(HS);

        Player obj = new Player("obj");
        Player arki = new Player("arki");
        Player rmn = new Player("rmn");
        Player KILLDREAM = new Player("KILLDREAM");
        Player ALEX = new Player("ALEX");

        players.add(obj);
        players.add(arki);
        players.add(rmn);
        players.add(KILLDREAM);
        players.add(ALEX);

        Team Giants = new Team("Giants");
        Giants.addPlayer(obj);
        Giants.addPlayer(arki);
        Giants.addPlayer(rmn);
        Giants.addPlayer(KILLDREAM);
        Giants.addPlayer(ALEX);

        teams.add(Movistar);
        teams.add(TempoStorm);
        teams.add(Giants);

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

        Player n0thing = new Player("n0thing");
        players.add(n0thing);

        mouse.removePlayer(oskar);
        mouse.addPlayer(n0thing);

        Torqued.removePlayer(naSteel);
        Torqued.removePlayer(pollo);
        Torqued.removePlayer(koosta);

        Player Subroza = new Player("Subroza");
        Player Wardell = new Player("Wardell");

        players.add(Subroza);
        players.add(Wardell);

        Team Ghost = new Team("Ghost");
        Ghost.addPlayer(naSteel);
        Ghost.addPlayer(pollo);
        Ghost.addPlayer(koosta);
        Ghost.addPlayer(Subroza);
        Ghost.addPlayer(Wardell);

        Player bit = new Player("bit");
        Player fnx = new Player("fnx");
        Player kNg = new Player("kNgV-");
        Player chelo = new Player("chelo");

        players.add(bit);
        players.add(fnx);
        players.add(kNg);
        players.add(chelo);

        Team NTC = new Team("Nao Tem Como");
        NTC.addPlayer(bit);
        NTC.addPlayer(fnx);
        NTC.addPlayer(kNg);
        NTC.addPlayer(chelo);
        NTC.addPlayer(felps);

        teams.add(Ghost);
        teams.add(NTC);

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
        Player minixeta = new Player("minixeta");
        players.add(minixeta);

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

        Team MIBR = SK;
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
        Player m1tch = new Player("m1tch");
        Player Infinite = new Player("Infinite");
        Player ptr = new Player("ptr");
        Player ryx = new Player("ryx");

        players.add(m1tch);
        players.add(Infinite);
        players.add(ptr);
        players.add(ryx);

        Team Dignitas = new Team("Dignitas");
        Dignitas.addPlayer(Grim);
        Dignitas.addPlayer(m1tch);
        Dignitas.addPlayer(Infinite);
        Dignitas.addPlayer(ptr);
        Dignitas.addPlayer(ryx);

        subtLe.removePlayer(LILMAN);
        SwolePatrol.removePlayer(ryan);
        SwolePatrol.addPlayer(LILMAN);

        Player spacca = new Player("spacca");
        Player arT = new Player("arT");
        Player yuurih = new Player("yuurih");
        Player VINI = new Player("VINI");
        Player kscerato = new Player("kscerato");

        players.add(spacca);
        players.add(arT);
        players.add(yuurih);
        players.add(VINI);
        players.add(kscerato);

        Team FURIA = new Team("FURIA");
        FURIA.addPlayer(spacca);
        FURIA.addPlayer(arT);
        FURIA.addPlayer(yuurih);
        FURIA.addPlayer(VINI);
        FURIA.addPlayer(kscerato);

        teams.add(Dignitas);
        teams.add(FURIA);

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
        Player ub1que = new Player("ub1que");
        Player spiker = new Player("spiker");
        Player NickelBack = new Player("NickelBack");
        Player YEKINDAR = new Player("YEKINDAr");
        Player propleh = new Player("propleh");

        players.add(ub1que);
        players.add(spiker);
        players.add(NickelBack);
        players.add(YEKINDAR);
        players.add(propleh);

        Team Monolith = new Team("Monolith");
        Monolith.addPlayer(ub1que);
        Monolith.addPlayer(spiker);
        Monolith.addPlayer(NickelBack);
        Monolith.addPlayer(YEKINDAR);
        Monolith.addPlayer(propleh);

        Player Jyo = new Player("Jyo");
        Player redhide = new Player("redhide");
        Player fejtZ = new Player("fejtZ");
        Player a1uke = new Player("1uke");
        Player rommi = new Player("rommi");

        players.add(Jyo);
        players.add(redhide);
        players.add(fejtZ);
        players.add(a1uke);
        players.add(rommi);

        Team PLINK = new Team("PLINK");
        PLINK.addPlayer(Jyo);
        PLINK.addPlayer(redhide);
        PLINK.addPlayer(fejtZ);
        PLINK.addPlayer(a1uke);
        PLINK.addPlayer(rommi);

        Player almazer = new Player("almazer");
        Player xsepower = new Player("xsepower");
        Player malik = new Player("malik");

        players.add(almazer);
        players.add(xsepower);
        players.add(malik);

        forZe.removePlayer(liTTle);
        forZe.removePlayer(scoobyxie);
        forZe.removePlayer(svyat);

        forZe.addPlayer(almazer);
        forZe.addPlayer(xsepower);
        forZe.addPlayer(malik);

        Player AiyvaN = new Player("AiyvaN");
        Player def = new Player("def");
        Player Flarich = new Player("Flarich");
        Player kenzor = new Player("kenzor");

        players.add(AiyvaN);
        players.add(def);
        players.add(Flarich);
        players.add(kenzor);

        Team pro100 = new Team("pro100");
        pro100.addPlayer(AiyvaN);
        pro100.addPlayer(def);
        pro100.addPlayer(Flarich);
        pro100.addPlayer(kenzor);
        pro100.addPlayer(svyat);


        teams.add(Monolith);
        teams.add(PLINK);
        teams.add(pro100);

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

        Player morelz = new Player("morelz");
        players.add(morelz);
        VP.addPlayer(morelz);

        Luminosity.removePlayer(PKL);
        Luminosity.removePlayer(SHOOWTiME);
        Player HEN1 = new Player("HEN1");
        Player LUCAS1 = new Player("LUCAS1");

        players.add(HEN1);
        players.add(LUCAS1);

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
        Player z8z = new Player("z8z");
        players.add(z8z);
        Flash.addPlayer(z8z);

        Tyloo.removePlayer(AE);
        Tyloo.addPlayer(Mo);

        Player Bobosaur = new Player("Bobosaur");
        players.add(Bobosaur);
        BOOTds.removePlayer(w1nt3r);
        BOOTds.addPlayer(Bobosaur);

        Player LaNrefNi = new Player("LaNrefNi");
        Player Nertz = new Player("Nertz");
        Player shp3x = new Player("shp3x");
        Player anarkez = new Player("anarkez");
        Player ponkt = new Player("ponkt");

        players.add(LaNrefNi);
        players.add(Nertz);
        players.add(shp3x);
        players.add(anarkez);
        players.add(ponkt);

        Team Uniquestars = new Team("Uniquestars");
        Uniquestars.addPlayer(LaNrefNi);
        Uniquestars.addPlayer(Nertz);
        Uniquestars.addPlayer(shp3x);
        Uniquestars.addPlayer(anarkez);
        Uniquestars.addPlayer(ponkt);

        Player yam = new Player("yam");
        Player zewsky = new Player("zewsky");
        Player ofnu = new Player("ofnu");

        players.add(yam);
        players.add(zewsky);
        players.add(ofnu);

        Team TaintedMinds = new Team("Tainted Minds");
        TaintedMinds.addPlayer(yam);
        TaintedMinds.addPlayer(zewsky);
        TaintedMinds.addPlayer(ofnu);
        TaintedMinds.addPlayer(INS);
        TaintedMinds.addPlayer(BURNRUOk);

        teams.add(Uniquestars);
        teams.add(TaintedMinds);

        FivePower.removePlayer(dobu);
        FivePower.removePlayer(kabal);
        FivePower.removePlayer(PTC);
        FivePower.removePlayer(forget);

        Player QKA = new Player("QKA");
        Player insanity = new Player("insanity");
        players.add(QKA);
        players.add(insanity);

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
        Player JaCkz = new Player("JaCkz");
        Player Davidp = new Player("Davidp");
        Player Lucky = new Player("Lucky");
        Player JiNKZ = new Player("JiNKZ");

        players.add(JaCkz);
        players.add(Davidp);
        players.add(Lucky);
        players.add(JiNKZ);

        Team ThreeDMax = new Team("3DMAX");
        ThreeDMax.addPlayer(JaCkz);
        ThreeDMax.addPlayer(Davidp);
        ThreeDMax.addPlayer(Maka);
        ThreeDMax.addPlayer(JiNKZ);
        ThreeDMax.addPlayer(Lucky);

        EnVyUs.renameTeam("LeftOut");

        Player sycrone = new Player("sycrone");
        Player PERCY = new Player("PERCY");
        players.add(sycrone);
        players.add(PERCY);

        Sprout.addPlayer(sycrone);
        Sprout.addPlayer(PERCY);

        teams.add(ThreeDMax);

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

        //</editor-fold>

        //<editor-fold desc="">
        //Roster Changes


        //Games

        //</editor-fold>

        //Final Adjustments
        teams.remove(Wololos);
        teams.remove(TeamOne);

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
            System.out.println();
        }
    }
}

package ec.gob.arcotel.drivetest.zonas;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;

import java.util.ArrayList;

/**
 * Created by Supertel on 20/5/15.
 */
public class Zonas {

    public static String[] getAllZonas(){
        String [] zonas = new String[]{"Ninguna","Guayaquil Z1", "Guayaquil Z2","Guayaquil Z3","Guayaquil Z4", "Guayaquil Z5",
                "Guayaquil Z6", "Guayaquil Z7", "Guayaquil Z8", "Guayaquil Z9", "Guayaquil Z10", "Guayaquil Z11", "Guayaquil Z12",
                "Guayaquil Z13", "Guayaquil Z14", "Guayaquil Z15", "Guayaquil Z16", "Guayaquil Z17", "Guayaquil Z18", "Guayaquil Z19",
                "Guayaquil Z20", "Guayaquil Z21", "Guayaquil Z22", "Guayaquil Z23", "Guayaquil Z24", "Guayaquil Z25", "Guayaquil Z26",
                "Guayaquil Z27", "Guayaquil Z28", "Guayaquil Z29", "Guayaquil Z30", "Guayaquil Z31", "Guayaquil Z32", "Guayaquil Z33",
                "Guayaquil Z34", "Guayaquil Z35", "Guayaquil Z36","Guayaquil Z37", "Guayaquil Z38", "Guayaquil Z39", "Machala Z4",
                "Machala Z7","Durán Z1", "Durán Z2", "Durán Z5", "Durán Z6", "Santa Rosa Z1", "Santa Rosa Z2", "Nobol", "Naranjito",
                "Yaguachi", "El Ingenio", "La Iberia", "La Victoria", "Guaranda Z1", "Guaranda Z2", "Guayaquil Z19 NUEVA",
                "Quevedo Z1","Quevedo Z2","Quevedo Z3","Quevedo Z4"
        };
        return zonas;
    }

    public static ArrayList<Coordinate> getGyeZona1 (){
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.052751627722909,-79.9463535341956));
        list.add(new Coordinate(-2.049258275808424,-79.94704996447238));
        list.add(new Coordinate(- 2.045144087632093, -79.94800846287897));
        list.add(new Coordinate(-2.04490188629172,-79.95821988822956));
        list.add(new Coordinate(-2.047290701916826,-79.95981098784137));
        list.add(new Coordinate(-2.048986533919289,-79.96043061413758));
        list.add(new Coordinate(-2.051441477581267,-79.96010212761335));
        list.add(new Coordinate(-2.059131105354197,-79.95867730184381));
        list.add(new Coordinate(-2.05886516461957,-79.95497477668489));
        list.add(new Coordinate(-2.063231276185203,-79.95391173626805));
        list.add(new Coordinate(-2.065739498556081,-79.95329339115679));
        list.add(new Coordinate(-2.068395180044838,-79.95259786769586));
        list.add(new Coordinate(-2.068785825473624,-79.94996467050567));
        list.add(new Coordinate(-2.069208936620202,-79.94911558593404));
        list.add(new Coordinate(-2.069986692895063,-79.94777211148848));
        list.add(new Coordinate(-2.071665111269881,-79.94832562837695));
        list.add(new Coordinate(-2.0727871960705,-79.94133017928493));
        list.add(new Coordinate(-2.070477165492832,-79.94192805630152));
        list.add(new Coordinate(-2.052751627722909,-79.9463535341956));
        return list;
    }

    public static PolygonOptions getGuayaquilZona1Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona1()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona2 (){
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.070133673137879,-79.94201281278259));
        list.add(new Coordinate(-2.07329608951597,-79.94119926620553));
        list.add(new Coordinate(-2.07588638514942,-79.94058625880605));
        list.add(new Coordinate(-2.079625147451917,-79.93966239297664));
        list.add(new Coordinate(-2.082181063257497,-79.93906449792466));
        list.add(new Coordinate(-2.080046733204541,-79.93485222653422));
        list.add(new Coordinate(-2.079632333725946,-79.93389671805589));
        list.add(new Coordinate(-2.07928098338158,-79.93269781799177));
        list.add(new Coordinate(-2.079064757242641,-79.93113027988898));
        list.add(new Coordinate(-2.0790287029671,-79.93008271478372));
        list.add(new Coordinate(-2.078965575007429,-79.92651309349439));
        list.add(new Coordinate(-2.078866457348915,-79.92557560144638));
        list.add(new Coordinate(-2.078678149208658,-79.92487597795963));
        list.add(new Coordinate(-2.078425898041397,-79.92421793817256));
        list.add(new Coordinate(-2.077957437380334,-79.92346975277148));
        list.add(new Coordinate(-2.077526260389865,-79.92291896818877));
        list.add(new Coordinate(-2.074460497887287,-79.91957542343661));
        list.add(new Coordinate(-2.070637280928863,-79.92303128178297));
        list.add(new Coordinate(-2.069028220756875,-79.92139546516225));
        list.add(new Coordinate(-2.063692857635894,-79.92514661074341));
        list.add(new Coordinate(-2.064337620823933,-79.92686331922144));
        list.add(new Coordinate(-2.065145580351712,-79.92725166508284));
        list.add(new Coordinate(-2.06546090975947,-79.92925282684823));
        list.add(new Coordinate(-2.065994041941464,-79.9337941189434));
        list.add(new Coordinate(-2.066427949808432,-79.93544492132423));
        list.add(new Coordinate(-2.066198099529781,-79.93616606662472));
        list.add(new Coordinate(-2.069319641807446,-79.9372707318129));
        list.add(new Coordinate(-2.070133673137879,-79.94201281278259));
        return list;
    }



    public static PolygonOptions getGuayaquilZona2Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona2()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona3 (){
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.089316369042618,-79.93243322136961));
        list.add(new Coordinate(-2.088760678482557,-79.92825524885242));
        list.add(new Coordinate(-2.088652020758264,-79.9274875819097));
        list.add(new Coordinate(-2.08848701340071,-79.92690457576694));
        list.add(new Coordinate(-2.088215918100118,-79.92633844713586));
        list.add(new Coordinate(-2.086794716384353,-79.92364805525637));
        list.add(new Coordinate(-2.084956007391815,-79.92007631486838));
        list.add(new Coordinate(-2.083122753820889,-79.91664136621444));
        list.add(new Coordinate(-2.082928611722536,-79.91625935745891));
        list.add(new Coordinate(-2.082463038787274,-79.91513891289226));
        list.add(new Coordinate(-2.0806983790243,-79.91561873550741));
        list.add(new Coordinate(-2.079534551821607,-79.91591268663031));
        list.add(new Coordinate(-2.078607829270787,-79.9161776496813));
        list.add(new Coordinate(-2.078140990421782,-79.91638682477199));
        list.add(new Coordinate(-2.077653251914552,-79.91671452790797));
        list.add(new Coordinate(-2.074460497887287,-79.91957542343661));
        list.add(new Coordinate(-2.077526260389865,-79.92291896818877));
        list.add(new Coordinate(-2.077957437380334,-79.92346975277148));
        list.add(new Coordinate(-2.078425898041397,-79.92421793817256));
        list.add(new Coordinate(-2.078678149208658,-79.92487597795963));
        list.add(new Coordinate(-2.078866457348915,-79.92557560144638));
        list.add(new Coordinate(-2.078965575007429,-79.92651309349439));
        list.add(new Coordinate(-2.0790287029671,-79.93008271478372));
        list.add(new Coordinate(-2.079064757242641,-79.93113027988898));
        list.add(new Coordinate(-2.07928098338158,-79.93269781799177));
        list.add(new Coordinate(-2.079632333725946,-79.93389671805589));
        list.add(new Coordinate(-2.080046733204541,-79.93485222653422));
        list.add(new Coordinate(-2.082181347321032,-79.93906070767342));
        list.add(new Coordinate(-2.084933509231186,-79.94442934082687));
        list.add(new Coordinate(-2.085406981966756,-79.94511892381991));
        list.add(new Coordinate(-2.086063684361802,-79.94587652983091));
        list.add(new Coordinate(-2.086841310688579,-79.94655370063151));
        list.add(new Coordinate(-2.087652782879703,-79.94706017650961));
        list.add(new Coordinate(-2.088405699485321,-79.94742071429378));
        list.add(new Coordinate(-2.089178316397741,-79.94770255610162));
        list.add(new Coordinate(-2.090232432956384,-79.94791555643707));
        list.add(new Coordinate(-2.091268080865533,-79.94799053669507));
        list.add(new Coordinate(-2.093790208000024,-79.94796172058133));
        list.add(new Coordinate(-2.093315282510442,-79.94600470821752));
        list.add(new Coordinate(-2.092900339609621,-79.9442577580231));
        list.add(new Coordinate(-2.091704992407184,-79.94168610333317));
        list.add(new Coordinate(-2.091650535077993,-79.94138847286416));
        list.add(new Coordinate(-2.091839059399998,-79.93959918844443));
        list.add(new Coordinate(-2.09177740568363,-79.93848007799284));
        list.add(new Coordinate(-2.091463222378572,-79.93732728155321));
        list.add(new Coordinate(-2.091316603787849,-79.93652067220319));
        list.add(new Coordinate(-2.089788760455866,-79.93520176674834));
        list.add(new Coordinate(-2.089583492643742,-79.93444301875954));
        list.add(new Coordinate(-2.089316369042618,-79.93243322136961));
        return list;
    }

    public static PolygonOptions getGuayaquilZona3Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona3()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona4 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.099272893107473,-79.91086406316302));
        list.add(new Coordinate(-2.099209805971346,-79.9106115566978));
        list.add(new Coordinate(-2.098168883573564,-79.90853878966955));
        list.add(new Coordinate(-2.099672408724111,-79.90945410866758));
        list.add(new Coordinate(-2.100566085184255,-79.90824942294503));
        list.add(new Coordinate(-2.100334767579698,-79.90772863127286));
        list.add(new Coordinate(-2.101065493861817,-79.90742350742325));
        list.add(new Coordinate(-2.101349058460857,-79.90722884860885));
        list.add(new Coordinate(-2.100024046009641,-79.90387240233117));
        list.add(new Coordinate(-2.099166167243672,-79.90422487165174));
        list.add(new Coordinate(-2.098782390458241,-79.90339896771678));
        list.add(new Coordinate(-2.096653307963871,-79.90431960573247));
        list.add(new Coordinate(-2.097310460957282,-79.90590827957173));
        list.add(new Coordinate(-2.096944504455014,-79.90606084791087));
        list.add(new Coordinate(-2.096303117029867,-79.90470363100893));
        list.add(new Coordinate(-2.094841673208122,-79.90506663173035));
        list.add(new Coordinate(-2.094559834824319,-79.90377392251747));
        list.add(new Coordinate(-2.094509183067069,-79.90364721513996));
        list.add(new Coordinate(-2.094415119411578,-79.90362549532856));
        list.add(new Coordinate(-2.093713265749731,-79.90374135478984));
        list.add(new Coordinate(-2.093615583857138,-79.90369067328675));
        list.add(new Coordinate(-2.093597493195923,-79.90359654761818));
        list.add(new Coordinate(-2.092504598015325,-79.89778345492745));
        list.add(new Coordinate(-2.092251039160781,-79.89720661138448));
        list.add(new Coordinate(-2.090703792099524,-79.89459556905888));
        list.add(new Coordinate(-2.087613922954557,-79.89607121842275));
        list.add(new Coordinate(-2.086131708638701,-79.89678538972314));
        list.add(new Coordinate(-2.085142906426409,-79.89700514577157));
        list.add(new Coordinate(-2.084163903732353,-79.897005166105));
        list.add(new Coordinate(-2.082772460869383,-79.89673052898199));
        list.add(new Coordinate(-2.080192583420135,-79.89615667264476));
        list.add(new Coordinate(-2.078801531507995,-79.89597656959971));
        list.add(new Coordinate(-2.077032340462321,-79.89616673715972));
        list.add(new Coordinate(-2.074037348185447,-79.89703477784485));
        list.add(new Coordinate(-2.07107525358297,-79.89809927652478));
        list.add(new Coordinate(-2.069555514776784,-79.89886017425054));
        list.add(new Coordinate(-2.068115358250656,-79.90013758440522));
        list.add(new Coordinate(-2.066822535153777,-79.90195534634168));
        list.add(new Coordinate(-2.065807951820113,-79.90486474173341));
        list.add(new Coordinate(-2.065824364677158,-79.90787787075314));
        list.add(new Coordinate(-2.066540775754902,-79.91018678023087));
        list.add(new Coordinate(-2.067756458740713,-79.91215848216683));
        list.add(new Coordinate(-2.074460071172395,-79.91958057490325));
        list.add(new Coordinate(-2.077653251914552,-79.91671452790797));
        list.add(new Coordinate(-2.078140990421782,-79.91638682477199));
        list.add(new Coordinate(-2.078607829270787,-79.9161776496813));
        list.add(new Coordinate(-2.079534551821607,-79.91591268663031));
        list.add(new Coordinate(-2.0806983790243,-79.91561873550741));
        list.add(new Coordinate(-2.082463038787274,-79.91513891289226));
        list.add(new Coordinate(-2.099272893107473,-79.91086406316302));
        return list;
    }

    public static PolygonOptions getGuayaquilZona4Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona4()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona5 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.089583492643742,-79.93444301875954));
        list.add(new Coordinate(-2.089788760455866,-79.93520176674834));
        list.add(new Coordinate(-2.091601237258722,-79.93676615627136));
        list.add(new Coordinate(-2.095107558484944,-79.93630789590276));
        list.add(new Coordinate(-2.098671690298839,-79.93591584304423));
        list.add(new Coordinate(-2.1013926261151,-79.93554656443544));
        list.add(new Coordinate(-2.10214688745612,-79.93538000799089));
        list.add(new Coordinate(-2.104834779071783,-79.93478474630035));
        list.add(new Coordinate(-2.106317219145484,-79.93447420597457));
        list.add(new Coordinate(-2.10807015958679,-79.93412696641673));
        list.add(new Coordinate(-2.110950908378339,-79.93358682698798));
        list.add(new Coordinate(-2.113440499174164,-79.93307975547654));
        list.add(new Coordinate(-2.112348389530379,-79.93064538371785));
        list.add(new Coordinate(-2.111440112013759,-79.93088799947373));
        list.add(new Coordinate(-2.112447506221721,-79.93305237105574));
        list.add(new Coordinate(-2.111183088272093,-79.93330925621918));
        list.add(new Coordinate(-2.110925485189537,-79.93317222170269));
        list.add(new Coordinate(-2.109806372319667,-79.93199012806318));
        list.add(new Coordinate(-2.10951463831995,-79.9318274118143));
        list.add(new Coordinate(-2.109004631994689,-79.9317726609149));
        list.add(new Coordinate(-2.108778582467338,-79.93166763839336));
        list.add(new Coordinate(-2.108640458891573,-79.93146039435514));
        list.add(new Coordinate(-2.10608047036495,-79.92609256094576));
        list.add(new Coordinate(-2.104467139112499,-79.92254032165592));
        list.add(new Coordinate(-2.104327506953255,-79.92222594525094));
        list.add(new Coordinate(-2.101435963831993,-79.91894741208779));
        list.add(new Coordinate(-2.097021627701756,-79.91376911811206));
        list.add(new Coordinate(-2.096369187327027,-79.91277144317185));
        list.add(new Coordinate(-2.096161806117711,-79.91219769478752));
        list.add(new Coordinate(-2.096039819734903,-79.9116849752631));
        list.add(new Coordinate(-2.091835069714653,-79.91274274106334));
        list.add(new Coordinate(-2.08246410812956,-79.91512272588851));
        list.add(new Coordinate(-2.082928611722536,-79.91625935745891));
        list.add(new Coordinate(-2.083122753820889,-79.91664136621444));
        list.add(new Coordinate(-2.084956007391815,-79.92007631486838));
        list.add(new Coordinate(-2.086794716384353,-79.92364805525637));
        list.add(new Coordinate(-2.088215918100118,-79.92633844713586));
        list.add(new Coordinate(-2.08848701340071,-79.92690457576694));
        list.add(new Coordinate(-2.088652020758264,-79.9274875819097));
        list.add(new Coordinate(-2.088760678482557,-79.92825524885242));
        list.add(new Coordinate(-2.089316369042618,-79.93243322136961));
        list.add(new Coordinate(-2.089583492643742,-79.93444301875954));
        return list;
    }

    public static PolygonOptions getGuayaquilZona5Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona5()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona6 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.093776746179886,-79.94796272295127));
        list.add(new Coordinate(-2.100349386247991,-79.94789206868629));
        list.add(new Coordinate(-2.112750735878165,-79.94773432106051));
        list.add(new Coordinate(-2.114171872987665,-79.94782105378732));
        list.add(new Coordinate(-2.116510078882924,-79.94814411657484));
        list.add(new Coordinate(-2.119501696271396,-79.94869570376856));
        list.add(new Coordinate(-2.116498109951494,-79.93240297674286));
        list.add(new Coordinate(-2.113438864738148,-79.93308217301265));
        list.add(new Coordinate(-2.111025080555169,-79.93356834500008));
        list.add(new Coordinate(-2.107206475698954,-79.93429532171827));
        list.add(new Coordinate(-2.105488652709326,-79.93464775278325));
        list.add(new Coordinate(-2.101326496222766,-79.93556159747651));
        list.add(new Coordinate(-2.098116595498243,-79.9359844858255));
        list.add(new Coordinate(-2.09136486567207,-79.93679131649245));
        list.add(new Coordinate(-2.091460787521675,-79.93730971767461));
        list.add(new Coordinate(-2.091774727486691,-79.93845299634144));
        list.add(new Coordinate(-2.091835746768797,-79.93954827116326));
        list.add(new Coordinate(-2.091648181217515,-79.94139562044991));
        list.add(new Coordinate(-2.091704861918009,-79.94167925739376));
        list.add(new Coordinate(-2.092895260648009,-79.9442560039595));
        list.add(new Coordinate(-2.093776746179886,-79.94796272295127));
        return list;
    }

    public static PolygonOptions getGuayaquilZona6Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona6()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona7 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.091522542934757,-79.94799044580437));
        list.add(new Coordinate(-2.090216639370456,-79.94791662785761));
        list.add(new Coordinate(-2.089207478880445,-79.94771613796986));
        list.add(new Coordinate(-2.088410712292912,-79.9474383303593));
        list.add(new Coordinate(-2.087713143781723,-79.94708228749332));
        list.add(new Coordinate(-2.08683938082743,-79.94654520839406));
        list.add(new Coordinate(-2.08699235776158,-79.94755395696825));
        list.add(new Coordinate(-2.086875109187938,-79.94867028811096));
        list.add(new Coordinate(-2.086767896340739,-79.94975375978895));
        list.add(new Coordinate(-2.086993968875495,-79.95078194407616));
        list.add(new Coordinate(-2.085234646410874,-79.95282182063237));
        list.add(new Coordinate(-2.083930992399824,-79.95509899646797));
        list.add(new Coordinate(-2.085742967475362,-79.95682042020503));
        list.add(new Coordinate(-2.086520514863967,-79.9581662309305));
        list.add(new Coordinate(-2.087097940643792,-79.95947606431201));
        list.add(new Coordinate(-2.087119079422841,-79.95990590780902));
        list.add(new Coordinate(-2.086854992860853,-79.96043319001682));
        list.add(new Coordinate(-2.086533032145894,-79.9610731297615));
        list.add(new Coordinate(-2.086577058127633,-79.96159760284158));
        list.add(new Coordinate(-2.086498286777494,-79.96251650449145));
        list.add(new Coordinate(-2.087592958424859,-79.96309843934711));
        list.add(new Coordinate(-2.088237351714025,-79.96347754662976));
        list.add(new Coordinate(-2.088508405305817,-79.96387710377461));
        list.add(new Coordinate(-2.088733757248069,-79.9650356081962));
        list.add(new Coordinate(-2.088901756516294,-79.96537070592734));
        list.add(new Coordinate(-2.089212750336665,-79.96564891112648));
        list.add(new Coordinate(-2.089729732860485,-79.96586124193176));
        list.add(new Coordinate(-2.092915204296407,-79.96685847940699));
        list.add(new Coordinate(-2.094514390533384,-79.96392112307697));
        list.add(new Coordinate(-2.095447515132361,-79.96214510420317));
        list.add(new Coordinate(-2.096023154778875,-79.96081004046866));
        list.add(new Coordinate(-2.098661825348917,-79.96122453687988));
        list.add(new Coordinate(-2.102367190486616,-79.96206335387944));
        list.add(new Coordinate(-2.102849873216832,-79.96218027451721));
        list.add(new Coordinate(-2.103499678630353,-79.96218807097793));
        list.add(new Coordinate(-2.104000097863048,-79.96228618519594));
        list.add(new Coordinate(-2.104267417334235,-79.96022222555827));
        list.add(new Coordinate(-2.105967235778858,-79.96086268605441));
        list.add(new Coordinate(-2.106317995260315,-79.95912626583461));
        list.add(new Coordinate(-2.114861820191281,-79.96168732976294));
        list.add(new Coordinate(-2.11612106726482,-79.96188088717391));
        list.add(new Coordinate(-2.116723592607926,-79.96180621019292));
        list.add(new Coordinate(-2.118465832950009,-79.96245129489876));
        list.add(new Coordinate(-2.118946981056974,-79.95987130749123));
        list.add(new Coordinate(-2.119525039900082,-79.95241552045583));
        list.add(new Coordinate(-2.119501696271396,-79.94869570376856));
        list.add(new Coordinate(-2.116510078882924,-79.94814411657484));
        list.add(new Coordinate(-2.114171872987665,-79.94782105378732));
        list.add(new Coordinate(-2.112750735878165,-79.94773432106051));
        list.add(new Coordinate(-2.100349386247991,-79.94789206868629));
        list.add(new Coordinate(-2.093776746179886,-79.94796272295127));
        list.add(new Coordinate(-2.091522542934757,-79.94799044580437));
        return list;
    }

    public static PolygonOptions getGuayaquilZona7Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona7()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }


    public static ArrayList<Coordinate> getGyeZona8 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.138480132631796,-79.9059810710432));
        list.add(new Coordinate(-2.135194736706108,-79.90151634030566));
        list.add(new Coordinate(-2.131746551478709,-79.89687937765748));
        list.add(new Coordinate(-2.130501505505445,-79.89777535778012));
        list.add(new Coordinate(-2.124392779722944,-79.88959814985925));
        list.add(new Coordinate(-2.129360093975226,-79.88560403660365));
        list.add(new Coordinate(-2.126803565229627,-79.88246480657422));
        list.add(new Coordinate(-2.116789314163158,-79.88308645011067));
        list.add(new Coordinate(-2.115791583663139,-79.88337062156967));
        list.add(new Coordinate(-2.116778086049927,-79.88684767864534));
        list.add(new Coordinate(-2.106953942143631,-79.89984427305743));
        list.add(new Coordinate(-2.109692483499225,-79.90824469024294));
        list.add(new Coordinate(-2.122484279033891,-79.90497612317178));
        list.add(new Coordinate(-2.123329496118243,-79.90479676710508));
        list.add(new Coordinate(-2.124390177431113,-79.90483089691271));
        list.add(new Coordinate(-2.1255480229628,-79.90512663803825));
        list.add(new Coordinate(-2.13250807032155,-79.9073912580164));
        list.add(new Coordinate(-2.133440005233333,-79.90762642564968));
        list.add(new Coordinate(-2.134395414287004,-79.90772318071417));
        list.add(new Coordinate(-2.135351061314951,-79.90763566268029));
        list.add(new Coordinate(-2.136216659443337,-79.90740645372175));
        list.add(new Coordinate(-2.137481269826945,-79.9067942594468));
        list.add(new Coordinate(-2.138480132631796,-79.9059810710432));
        return list;
    }

    public static PolygonOptions getGuayaquilZona8Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona8()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }


    public static ArrayList<Coordinate> getGyeZona9 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.123633890305135,-79.94939399638245));
        list.add(new Coordinate(-2.125280265741054,-79.94960772615828));
        list.add(new Coordinate(-2.127068291995855,-79.94954539995409));
        list.add(new Coordinate(-2.128193629997418,-79.94934331086326));
        list.add(new Coordinate(-2.129812403829445,-79.94886404998066));
        list.add(new Coordinate(-2.133518842978004,-79.94770524039271));
        list.add(new Coordinate(-2.137415031899115,-79.94645798048386));
        list.add(new Coordinate(-2.138609613292164,-79.94615772507362));
        list.add(new Coordinate(-2.140248103068582,-79.9458617875637));
        list.add(new Coordinate(-2.139433966791696,-79.942453848013));
        list.add(new Coordinate(-2.139338242949128,-79.94168932556715));
        list.add(new Coordinate(-2.139354280577845,-79.9408652514318));
        list.add(new Coordinate(-2.139746314672144,-79.93543521016312));
        list.add(new Coordinate(-2.139943776483341,-79.93414130696128));
        list.add(new Coordinate(-2.135603214547575,-79.93386333881543));
        list.add(new Coordinate(-2.129799811909353,-79.93302068499547));
        list.add(new Coordinate(-2.124703613949462,-79.9310360756479));
        list.add(new Coordinate(-2.123899423018385,-79.93094015526947));
        list.add(new Coordinate(-2.122395835205678,-79.93125284679468));
        list.add(new Coordinate(-2.116498688704542,-79.93240660809873));
        list.add(new Coordinate(-2.119499802196008,-79.94869461267339));
        list.add(new Coordinate(-2.123633890305135,-79.94939399638245));

        return list;
    }

    public static PolygonOptions getGuayaquilZona9Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona9()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona10 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.137481269826945,-79.9067942594468));
        list.add(new Coordinate(-2.136216659443337,-79.90740645372175));
        list.add(new Coordinate(-2.135351061314951,-79.90763566268029));
        list.add(new Coordinate(-2.134395414287004,-79.90772318071417));
        list.add(new Coordinate(-2.133440005233333,-79.90762642564968));
        list.add(new Coordinate(-2.13250807032155,-79.9073912580164));
        list.add(new Coordinate(-2.1255480229628,-79.90512663803825));
        list.add(new Coordinate(-2.124390177431113,-79.90483089691271));
        list.add(new Coordinate(-2.123329496118243,-79.90479676710508));
        list.add(new Coordinate(-2.122484279033891,-79.90497612317178));
        list.add(new Coordinate(-2.109836633246111,-79.90822068435489));
        list.add(new Coordinate(-2.111211683243059,-79.91268180282863));
        list.add(new Coordinate(-2.114513313651953,-79.91904997627719));
        list.add(new Coordinate(-2.118444090090237,-79.92664596598726));
        list.add(new Coordinate(-2.11949641333249,-79.92865100730391));
        list.add(new Coordinate(-2.121835981972578,-79.9281575740676));
        list.add(new Coordinate(-2.122401226473601,-79.93125705790249));
        list.add(new Coordinate(-2.123883294634898,-79.93094888565125));
        list.add(new Coordinate(-2.124701819523873,-79.93103825297861));
        list.add(new Coordinate(-2.128724818863355,-79.93259213705102));
        list.add(new Coordinate(-2.129803238467948,-79.9330197107687));
        list.add(new Coordinate(-2.130700512688331,-79.9331397405322));
        list.add(new Coordinate(-2.135616838959201,-79.9338641731989));
        list.add(new Coordinate(-2.139946700585677,-79.93414157096565));
        list.add(new Coordinate(-2.140022714635613,-79.93355619405307));
        list.add(new Coordinate(-2.139952375524886,-79.93115257962039));
        list.add(new Coordinate(-2.140273431648974,-79.92693921358129));
        list.add(new Coordinate(-2.140405189483209,-79.92627366024169));
        list.add(new Coordinate(-2.143626040020592,-79.91918583794332));
        list.add(new Coordinate(-2.147130017319038,-79.911362151495));
        list.add(new Coordinate(-2.147604610956874,-79.90957662546228));
        list.add(new Coordinate(-2.147820389722181,-79.90504129936832));
        list.add(new Coordinate(-2.147493018628194,-79.90500854075539));
        list.add(new Coordinate(-2.145016006434126,-79.90604605697104));
        list.add(new Coordinate(-2.141346590341235,-79.90876863147784));
        list.add(new Coordinate(-2.141046125696579,-79.9086651817717));
        list.add(new Coordinate(-2.140239129087575,-79.90850813836492));
        list.add(new Coordinate(-2.138480132631796,-79.9059810710432));
        list.add(new Coordinate(-2.137481269826945,-79.9067942594468));
        return list;
    }

    public static PolygonOptions getGuayaquilZona10Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona10()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona11 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.140302620549077,-79.88239300841447));
        list.add(new Coordinate(-2.138849922177282,-79.88363234776564));
        list.add(new Coordinate(-2.138122725842305,-79.88231721624371));
        list.add(new Coordinate(-2.137477273892327,-79.88179304812819));
        list.add(new Coordinate(-2.137105697014267,-79.88172997227539));
        list.add(new Coordinate(-2.134133587299487,-79.88199009335303));
        list.add(new Coordinate(-2.130627603775541,-79.88227582176619));
        list.add(new Coordinate(-2.126799110990872,-79.88246450116471));
        list.add(new Coordinate(-2.129361457866096,-79.88560264573745));
        list.add(new Coordinate(-2.124392783894639,-79.88959802424972));
        list.add(new Coordinate(-2.130502089797637,-79.89777465908081));
        list.add(new Coordinate(-2.131745359287589,-79.89687763189589));
        list.add(new Coordinate(-2.13283764254666,-79.89831590473634));
        list.add(new Coordinate(-2.13848032348107,-79.90597844351251));
        list.add(new Coordinate(-2.139968145584775,-79.90812079937308));
        list.add(new Coordinate(-2.140237191177746,-79.90849749718893));
        list.add(new Coordinate(-2.141064474197152,-79.90867328920338));
        list.add(new Coordinate(-2.141349540931094,-79.90876886266881));
        list.add(new Coordinate(-2.145022689349527,-79.90603955040778));
        list.add(new Coordinate(-2.147482410828967,-79.90501698688553));
        list.add(new Coordinate(-2.147819162639805,-79.90503426706604));
        list.add(new Coordinate(-2.147890447022099,-79.9044226121065));
        list.add(new Coordinate(-2.148082270899609,-79.90382708046401));
        list.add(new Coordinate(-2.148737468688224,-79.90247651145651));
        list.add(new Coordinate(-2.150041385308029,-79.90003658288613));
        list.add(new Coordinate(-2.150352565405904,-79.89959103619484));
        list.add(new Coordinate(-2.150827787878732,-79.89902562071094));
        list.add(new Coordinate(-2.154817868503213,-79.89524698950032));
        list.add(new Coordinate(-2.153983537057107,-79.89475543837362));
        list.add(new Coordinate(-2.150843811871205,-79.89291737437647));
        list.add(new Coordinate(-2.151433317213326,-79.89201409205393));
        list.add(new Coordinate(-2.150373412940265,-79.88641616917484));
        list.add(new Coordinate(-2.150069945824401,-79.88645225662538));
        list.add(new Coordinate(-2.148513693280793,-79.88633201126595));
        list.add(new Coordinate(-2.14698173879016,-79.88593061858011));
        list.add(new Coordinate(-2.145814912892745,-79.88541109965379));
        list.add(new Coordinate(-2.141944428786213,-79.88331503889965));
        list.add(new Coordinate(-2.141271816814935,-79.88295612215072));
        list.add(new Coordinate(-2.140684005781632,-79.88254478778808));
        list.add(new Coordinate(-2.140302620549077,-79.88239300841447));
        return list;
    }

    public static PolygonOptions getGuayaquilZona11Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona11()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona12 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.160605524110763,-79.92143295885558));
        list.add(new Coordinate(-2.15917240303748,-79.9193328196029));
        list.add(new Coordinate(-2.158445623588778,-79.91970073484713));
        list.add(new Coordinate(-2.157625589242829,-79.91983984783867));
        list.add(new Coordinate(-2.156944643325325,-79.91978693367869));
        list.add(new Coordinate(-2.159502439687879,-79.91518599057001));
        list.add(new Coordinate(-2.161033402412794,-79.91259965966751));
        list.add(new Coordinate(-2.161584108076053,-79.91179325791447));
        list.add(new Coordinate(-2.161904077384356,-79.9114908644377));
        list.add(new Coordinate(-2.162211405048955,-79.9107444849234));
        list.add(new Coordinate(-2.162758330859616,-79.90822824639308));
        list.add(new Coordinate(-2.163013731694608,-79.90785618516526));
        list.add(new Coordinate(-2.163596223828654,-79.90755366196065));
        list.add(new Coordinate(-2.16424369942931,-79.90711125770295));
        list.add(new Coordinate(-2.164544117561997,-79.90659002105009));
        list.add(new Coordinate(-2.164745720734302,-79.90628010302369));
        list.add(new Coordinate(-2.165593737072094,-79.90561508934722));
        list.add(new Coordinate(-2.165761947712885,-79.90529480743408));
        list.add(new Coordinate(-2.165656494818963,-79.90505134470502));
        list.add(new Coordinate(-2.165528829337327,-79.9047197856526));
        list.add(new Coordinate(-2.165610971131397,-79.90449068764667));
        list.add(new Coordinate(-2.165902078911617,-79.9043344979428));
        list.add(new Coordinate(-2.167849868520923,-79.90211504430441));
        list.add(new Coordinate(-2.166559497724361,-79.90177722618675));
        list.add(new Coordinate(-2.164391873687403,-79.90211511994123));
        list.add(new Coordinate(-2.164119334891299,-79.90223134228397));
        list.add(new Coordinate(-2.163583403699722,-79.90287135467551));
        list.add(new Coordinate(-2.160396494375911,-79.90374111629416));
        list.add(new Coordinate(-2.156226340691577,-79.90388965489767));
        list.add(new Coordinate(-2.153457931515835,-79.90488549066724));
        list.add(new Coordinate(-2.151819354067584,-79.9051688448976));
        list.add(new Coordinate(-2.150600666173588,-79.90561767384939));
        list.add(new Coordinate(-2.147778207371967,-79.90587710345149));
        list.add(new Coordinate(-2.147606690167022,-79.90953959422507));
        list.add(new Coordinate(-2.147117740524818,-79.91139712555786));
        list.add(new Coordinate(-2.142712855089783,-79.92119049948558));
        list.add(new Coordinate(-2.140404326458019,-79.92626330128442));
        list.add(new Coordinate(-2.140245997339414,-79.92725939092631));
        list.add(new Coordinate(-2.139959668534403,-79.93101746282306));
        list.add(new Coordinate(-2.140029761962539,-79.93356116643989));
        list.add(new Coordinate(-2.139943705733389,-79.93413974098014));
        list.add(new Coordinate(-2.143328850586237,-79.93437815427888));
        list.add(new Coordinate(-2.14426321618491,-79.93438703089488));
        list.add(new Coordinate(-2.145043024150936,-79.93421485391417));
        list.add(new Coordinate(-2.147149107803721,-79.93345242236721));
        list.add(new Coordinate(-2.151851773881384,-79.93170179429843));
        list.add(new Coordinate(-2.15906752839027,-79.92860329369933));
        list.add(new Coordinate(-2.158024286263795,-79.92622440800838));
        list.add(new Coordinate(-2.157606768933519,-79.92521553125671));
        list.add(new Coordinate(-2.159205518507923,-79.92450332655264));
        list.add(new Coordinate(-2.158988655433716,-79.92297264260071));
        list.add(new Coordinate(-2.15953294769963,-79.9229022500181));
        list.add(new Coordinate(-2.159143902733828,-79.92231962559139));
        list.add(new Coordinate(-2.160605524110763,-79.92143295885558));
        return list;
    }

    public static PolygonOptions getGuayaquilZona12Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona12()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona13 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.139943962137296,-79.93412870609774));
        list.add(new Coordinate(-2.139746217832175,-79.9354422093747));
        list.add(new Coordinate(-2.139353527149399,-79.94085403155904));
        list.add(new Coordinate(-2.139336045785939,-79.9416821123672));
        list.add(new Coordinate(-2.139435215734481,-79.94245958706334));
        list.add(new Coordinate(-2.140248555648793,-79.9458623556511));
        list.add(new Coordinate(-2.144336056897631,-79.94577743838426));
        list.add(new Coordinate(-2.148230556986206,-79.94583651408283));
        list.add(new Coordinate(-2.149460772674031,-79.94598905905015));
        list.add(new Coordinate(-2.150908716696547,-79.9462723426376));
        list.add(new Coordinate(-2.152193359088122,-79.94669725540578));
        list.add(new Coordinate(-2.15667561993184,-79.94827491575873));
        list.add(new Coordinate(-2.158260855329684,-79.9487605784026));
        list.add(new Coordinate(-2.159619645075651,-79.94893868160062));
        list.add(new Coordinate(-2.160865219865623,-79.94885778272655));
        list.add(new Coordinate(-2.165494400844835,-79.94804846856681));
        list.add(new Coordinate(-2.166222325874818,-79.94778948551317));
        list.add(new Coordinate(-2.167500248159502,-79.94720676529502));
        list.add(new Coordinate(-2.169738140645146,-79.94602416765467));
        list.add(new Coordinate(-2.171291041829657,-79.94527956552463));
        list.add(new Coordinate(-2.172504236681727,-79.94500439910247));
        list.add(new Coordinate(-2.173523320673782,-79.94489110657413));
        list.add(new Coordinate(-2.174964348831577,-79.94498993534418));
        list.add(new Coordinate(-2.176352142070698,-79.94538301326854));
        list.add(new Coordinate(-2.179232453771438,-79.94669326119696));
        list.add(new Coordinate(-2.181641465196052,-79.94795112077682));
        list.add(new Coordinate(-2.183945788855871,-79.94923522320619));
        list.add(new Coordinate(-2.185202729159468,-79.95088620118813));
        list.add(new Coordinate(-2.185909792344285,-79.95264202708742));
        list.add(new Coordinate(-2.186564504630031,-79.95421446071036));
        list.add(new Coordinate(-2.187507304748984,-79.95557731759173));
        list.add(new Coordinate(-2.18784759960566,-79.95046706183335));
        list.add(new Coordinate(-2.18748095684255,-79.94889471466651));
        list.add(new Coordinate(-2.186773905379878,-79.94776786751078));
        list.add(new Coordinate(-2.185516959519709,-79.94653620216931));
        list.add(new Coordinate(-2.184286219905004,-79.94606448814925));
        list.add(new Coordinate(-2.180044207637177,-79.94535687866421));
        list.add(new Coordinate(-2.178944451347789,-79.94475416904317));
        list.add(new Coordinate(-2.169046675934062,-79.93710826861017));
        list.add(new Coordinate(-2.16500871839158,-79.93319304971567));
        list.add(new Coordinate(-2.162625908264376,-79.93038921569347));
        list.add(new Coordinate(-2.162255322631363,-79.92949210993356));
        list.add(new Coordinate(-2.162131147736252,-79.92843015073071));
        list.add(new Coordinate(-2.162281971044375,-79.92714041377815));
        list.add(new Coordinate(-2.162931442062321,-79.92643362104067));
        list.add(new Coordinate(-2.163851870842297,-79.92453304905857));
        list.add(new Coordinate(-2.164349608639531,-79.92388944680336));
        list.add(new Coordinate(-2.165194085329155,-79.92307795307129));
        list.add(new Coordinate(-2.166101303123667,-79.92234486504019));
        list.add(new Coordinate(-2.165257430388921,-79.92196911014129));
        list.add(new Coordinate(-2.161810695350206,-79.92069677699034));
        list.add(new Coordinate(-2.161698436638138,-79.92072389322729));
        list.add(new Coordinate(-2.160602913655375,-79.92143574980322));
        list.add(new Coordinate(-2.159142542486618,-79.9223209868691));
        list.add(new Coordinate(-2.15953294769963,-79.9229022500181));
        list.add(new Coordinate(-2.158988654434387,-79.92297156817135));
        list.add(new Coordinate(-2.159206281122191,-79.92450282179367));
        list.add(new Coordinate(-2.157606720299925,-79.92521654268816));
        list.add(new Coordinate(-2.15906506051004,-79.92860034205006));
        list.add(new Coordinate(-2.151772459482725,-79.93173752279644));
        list.add(new Coordinate(-2.145100616947676,-79.93419139632603));
        list.add(new Coordinate(-2.144229766066861,-79.93439356643815));
        list.add(new Coordinate(-2.143348434886644,-79.93437844072669));
        list.add(new Coordinate(-2.139943962137296,-79.93412870609774));
        return list;
    }

    public static PolygonOptions getGuayaquilZona13Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona13()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona14 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.150827059678666,-79.89902114162929));
        list.add(new Coordinate(-2.153176392449677,-79.90145531022844));
        list.add(new Coordinate(-2.15378944005985,-79.90187461325594));
        list.add(new Coordinate(-2.154237432637928,-79.90199740062745));
        list.add(new Coordinate(-2.157797729993825,-79.90215812344944));
        list.add(new Coordinate(-2.162947340317662,-79.90120557011549));
        list.add(new Coordinate(-2.164488571164316,-79.90014286512373));
        list.add(new Coordinate(-2.164889572886861,-79.89942495119129));
        list.add(new Coordinate(-2.165077559066918,-79.89837720178969));
        list.add(new Coordinate(-2.16487466207669,-79.8977775757447));
        list.add(new Coordinate(-2.164153415791229,-79.89678575691619));
        list.add(new Coordinate(-2.164873252029125,-79.89617893478642));
        list.add(new Coordinate(-2.165538404010279,-79.89585508677679));
        list.add(new Coordinate(-2.166425607428458,-79.8957432691857));
        list.add(new Coordinate(-2.16721114747886,-79.89599820018263));
        list.add(new Coordinate(-2.169174357642352,-79.89739119689904));
        list.add(new Coordinate(-2.170692076240078,-79.89850494706415));
        list.add(new Coordinate(-2.171074753093536,-79.89791650219198));
        list.add(new Coordinate(-2.171286371921615,-79.89719575478135));
        list.add(new Coordinate(-2.171223656543352,-79.89177843962334));
        list.add(new Coordinate(-2.169562368902577,-79.89187299893214));
        list.add(new Coordinate(-2.165108806191311,-79.89204771778638));
        list.add(new Coordinate(-2.164589737579465,-79.89192886261421));
        list.add(new Coordinate(-2.162435606017791,-79.89074735796855));
        list.add(new Coordinate(-2.159847833096019,-79.88924728953421));
        list.add(new Coordinate(-2.156972276590612,-79.88756022603441));
        list.add(new Coordinate(-2.154645504670868,-79.88626858439207));
        list.add(new Coordinate(-2.153792505973558,-79.88604520191993));
        list.add(new Coordinate(-2.152705742498774,-79.88601059003676));
        list.add(new Coordinate(-2.152478474809968,-79.88605441020761));
        list.add(new Coordinate(-2.150375109033444,-79.8864064167597));
        list.add(new Coordinate(-2.151108010250384,-79.89029447456009));
        list.add(new Coordinate(-2.151438858434029,-79.89201308219474));
        list.add(new Coordinate(-2.150847688469478,-79.89292156058716));
        list.add(new Coordinate(-2.154828876130854,-79.89525138243647));
        list.add(new Coordinate(-2.150827059678666,-79.89902114162929));
        return list;
    }

    public static PolygonOptions getGuayaquilZona14Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona14()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona15 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.160615029392381,-79.88969074018608));
        list.add(new Coordinate(-2.163788470347701,-79.8915144946068));
        list.add(new Coordinate(-2.164625678483139,-79.89192033767058));
        list.add(new Coordinate(-2.165089907195281,-79.89203730684174));
        list.add(new Coordinate(-2.166828924853389,-79.89201195310388));
        list.add(new Coordinate(-2.171231551895575,-79.89177533004772));
        list.add(new Coordinate(-2.171058689345333,-79.88867925214152));
        list.add(new Coordinate(-2.170806588975105,-79.88390865533648));
        list.add(new Coordinate(-2.170561563903544,-79.87970986461185));
        list.add(new Coordinate(-2.166387250678665,-79.87997671999439));
        list.add(new Coordinate(-2.159253151913957,-79.880363482335));
        list.add(new Coordinate(-2.157832086616955,-79.88035649281174));
        list.add(new Coordinate(-2.156862532011185,-79.88016983619825));
        list.add(new Coordinate(-2.156177067481779,-79.87983420003509));
        list.add(new Coordinate(-2.155440004289161,-79.87917328726063));
        list.add(new Coordinate(-2.154942093432916,-79.87896381817834));
        list.add(new Coordinate(-2.154391150166945,-79.87889377542248));
        list.add(new Coordinate(-2.153961044477889,-79.87880480742304));
        list.add(new Coordinate(-2.15331261555899,-79.87837983593532));
        list.add(new Coordinate(-2.152103389996575,-79.87751077490067));
        list.add(new Coordinate(-2.150765671397921,-79.87688246699784));
        list.add(new Coordinate(-2.14921855374945,-79.87657183123095));
        list.add(new Coordinate(-2.147863471033493,-79.87648810867407));
        list.add(new Coordinate(-2.146674083145189,-79.87662792364492));
        list.add(new Coordinate(-2.145366480981063,-79.87699677443742));
        list.add(new Coordinate(-2.144303075784856,-79.87739352409199));
        list.add(new Coordinate(-2.142198046412194,-79.87833409743801));
        list.add(new Coordinate(-2.141897695859584,-79.87860536203853));
        list.add(new Coordinate(-2.141570581869544,-79.87914159447742));
        list.add(new Coordinate(-2.141030690030173,-79.88067310490915));
        list.add(new Coordinate(-2.14059231561043,-79.88207762012934));
        list.add(new Coordinate(-2.140690638044061,-79.88255133075614));
        list.add(new Coordinate(-2.141277783463435,-79.88296225059675));
        list.add(new Coordinate(-2.145798534739797,-79.88539925723734));
        list.add(new Coordinate(-2.146991196105219,-79.88592567060077));
        list.add(new Coordinate(-2.148513954470502,-79.88632833154388));
        list.add(new Coordinate(-2.150077766726107,-79.88645480139812));
        list.add(new Coordinate(-2.151473746169037,-79.88623372627201));
        list.add(new Coordinate(-2.152708626119785,-79.88600432989058));
        list.add(new Coordinate(-2.153826930090055,-79.88604964132172));
        list.add(new Coordinate(-2.154669156111944,-79.88627241364259));
        list.add(new Coordinate(-2.156232664829136,-79.88713821550543));
        list.add(new Coordinate(-2.160615029392381,-79.88969074018608));
        return list;
    }

    public static PolygonOptions getGuayaquilZona15Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona15()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona16 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.166095854279797,-79.92234008130583));
        list.add(new Coordinate(-2.166697410690825,-79.92354689033034));
        list.add(new Coordinate(-2.166847093632329,-79.92381538587748));
        list.add(new Coordinate(-2.166982656472104,-79.92388604323442));
        list.add(new Coordinate(-2.167219892009482,-79.9238662602946));
        list.add(new Coordinate(-2.167386521856053,-79.92384365092224));
        list.add(new Coordinate(-2.167697188258625,-79.9239001792463));
        list.add(new Coordinate(-2.167923128486363,-79.92400192781361));
        list.add(new Coordinate(-2.168076290136894,-79.92406514275324));
        list.add(new Coordinate(-2.168460446901617,-79.92411253982979));
        list.add(new Coordinate(-2.169052966033914,-79.92444253168807));
        list.add(new Coordinate(-2.170046069177601,-79.92502998021504));
        list.add(new Coordinate(-2.170311435197133,-79.92549672373166));
        list.add(new Coordinate(-2.171302322941857,-79.92479940842442));
        list.add(new Coordinate(-2.171503210569923,-79.92447516088323));
        list.add(new Coordinate(-2.171710578153964,-79.92398230662975));
        list.add(new Coordinate(-2.172298432822161,-79.92249321615124));
        list.add(new Coordinate(-2.169195599025586,-79.91945995197646));
        list.add(new Coordinate(-2.169658813163269,-79.91894734500039));
        list.add(new Coordinate(-2.167564740342856,-79.91729134842633));
        list.add(new Coordinate(-2.167409894592771,-79.91697238627997));
        list.add(new Coordinate(-2.167271613114349,-79.91655724656091));
        list.add(new Coordinate(-2.166575363328662,-79.91631228948305));
        list.add(new Coordinate(-2.166412969086366,-79.91616201391902));
        list.add(new Coordinate(-2.166388520868214,-79.91587453012393));
        list.add(new Coordinate(-2.166584113885693,-79.91565432898116));
        list.add(new Coordinate(-2.166522991504364,-79.91515888160605));
        list.add(new Coordinate(-2.166235715302147,-79.91474295248817));
        list.add(new Coordinate(-2.167158662978575,-79.9142169210602));
        list.add(new Coordinate(-2.167971589475603,-79.91426585159924));
        list.add(new Coordinate(-2.16986639694549,-79.91444323042441));
        list.add(new Coordinate(-2.169921407590788,-79.91432089721685));
        list.add(new Coordinate(-2.169811383929268,-79.91378874868701));
        list.add(new Coordinate(-2.169927518767437,-79.91319543135219));
        list.add(new Coordinate(-2.170642693872684,-79.91248300146374));
        list.add(new Coordinate(-2.171058324179596,-79.91217716910117));
        list.add(new Coordinate(-2.171535078265409,-79.91196308503614));
        list.add(new Coordinate(-2.172922569511446,-79.91070304144608));
        list.add(new Coordinate(-2.173504616973688,-79.9102338951959));
        list.add(new Coordinate(-2.173596297598386,-79.909799608984));
        list.add(new Coordinate(-2.174286982114276,-79.90970173989291));
        list.add(new Coordinate(-2.174855422816413,-79.90953047165232));
        list.add(new Coordinate(-2.17545442653121,-79.90914511982162));
        list.add(new Coordinate(-2.175829429698162,-79.90881273266571));
        list.add(new Coordinate(-2.176202272919595,-79.9082928108145));
        list.add(new Coordinate(-2.176550663395965,-79.90741812512083));
        list.add(new Coordinate(-2.176636227072763,-79.90644557684401));
        list.add(new Coordinate(-2.176770687622697,-79.90525486084133));
        list.add(new Coordinate(-2.176825691978158,-79.90467989441622));
        list.add(new Coordinate(-2.176954045632214,-79.90425784395985));
        list.add(new Coordinate(-2.179776671529643,-79.89801055186844));
        list.add(new Coordinate(-2.180182645900812,-79.89695607955825));
        list.add(new Coordinate(-2.179806890143957,-79.89693680206456));
        list.add(new Coordinate(-2.177855800996216,-79.89764745448633));
        list.add(new Coordinate(-2.174699052171146,-79.89819284128622));
        list.add(new Coordinate(-2.172605692899179,-79.89863682155506));
        list.add(new Coordinate(-2.171520668209575,-79.89874731025358));
        list.add(new Coordinate(-2.170675009305876,-79.89850454081942));
        list.add(new Coordinate(-2.169944520591984,-79.89927907742629));
        list.add(new Coordinate(-2.167837339840461,-79.90212310617521));
        list.add(new Coordinate(-2.165900840446633,-79.90433239834616));
        list.add(new Coordinate(-2.165610034647238,-79.90448506453997));
        list.add(new Coordinate(-2.165533759453583,-79.9047188315096));
        list.add(new Coordinate(-2.165757829096603,-79.90529608984917));
        list.add(new Coordinate(-2.16558620765458,-79.9056205027392));
        list.add(new Coordinate(-2.164755428348913,-79.90628465954164));
        list.add(new Coordinate(-2.164507530050582,-79.90665677900687));
        list.add(new Coordinate(-2.16423579555251,-79.90712908417817));
        list.add(new Coordinate(-2.163592206446738,-79.90755368589502));
        list.add(new Coordinate(-2.163023171744641,-79.90784832119419));
        list.add(new Coordinate(-2.16276097112365,-79.90821566941597));
        list.add(new Coordinate(-2.162218644168365,-79.91073786477466));
        list.add(new Coordinate(-2.161904004273942,-79.91149164554503));
        list.add(new Coordinate(-2.161586899548103,-79.91179801268125));
        list.add(new Coordinate(-2.161040760370033,-79.91259017946116));
        list.add(new Coordinate(-2.159486744504235,-79.91521567625388));
        list.add(new Coordinate(-2.157618076427177,-79.91856462905209));
        list.add(new Coordinate(-2.157618076422468,-79.91856155883804));
        list.add(new Coordinate(-2.156945348363944,-79.91978624326256));
        list.add(new Coordinate(-2.157632630853466,-79.91983537106788));
        list.add(new Coordinate(-2.158442984123675,-79.91970027255233));
        list.add(new Coordinate(-2.1591670844306,-79.91933796534678));
        list.add(new Coordinate(-2.160608853823855,-79.92143322134903));
        list.add(new Coordinate(-2.161702888699112,-79.92072227392343));
        list.add(new Coordinate(-2.161810276431262,-79.92069771080227));
        list.add(new Coordinate(-2.165264592115866,-79.9219716575217));
        list.add(new Coordinate(-2.166095854279797,-79.92234008130583));
        return list;
    }

    public static PolygonOptions getGuayaquilZona16Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona16()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona17 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.178483974591977,-79.88274061453231));
        list.add(new Coordinate(-2.178117590782542,-79.88197867826777));
        list.add(new Coordinate(-2.177324188380695,-79.88111918680571));
        list.add(new Coordinate(-2.176401198652541,-79.8803168978548));
        list.add(new Coordinate(-2.175278727634836,-79.87974633544546));
        list.add(new Coordinate(-2.173878582286315,-79.87956145635759));
        list.add(new Coordinate(-2.170562430576234,-79.8796939019075));
        list.add(new Coordinate(-2.170814129262726,-79.88369015864934));
        list.add(new Coordinate(-2.171041503171193,-79.88822585191934));
        list.add(new Coordinate(-2.171281031634628,-79.89286933493276));
        list.add(new Coordinate(-2.171291844973182,-79.89724903977566));
        list.add(new Coordinate(-2.171091980909555,-79.89790526847581));
        list.add(new Coordinate(-2.170664079182932,-79.89851706091888));
        list.add(new Coordinate(-2.171495354257402,-79.89874396991972));
        list.add(new Coordinate(-2.172594781530773,-79.89865274468922));
        list.add(new Coordinate(-2.174113920516765,-79.89829464757321));
        list.add(new Coordinate(-2.177861599121342,-79.89764116964157));
        list.add(new Coordinate(-2.178622023114935,-79.89736835390075));
        list.add(new Coordinate(-2.179819548490404,-79.8969337309299));
        list.add(new Coordinate(-2.18039871191331,-79.89540412400885));
        list.add(new Coordinate(-2.180914743357859,-79.8940822464605));
        list.add(new Coordinate(-2.18135902744583,-79.89294477510408));
        list.add(new Coordinate(-2.181510801340802,-79.89190822112614));
        list.add(new Coordinate(-2.182036605404945,-79.89173174532469));
        list.add(new Coordinate(-2.182442924120681,-79.89163160640068));
        list.add(new Coordinate(-2.18368228395735,-79.89199538282729));
        list.add(new Coordinate(-2.184143824604287,-79.88944469518921));
        list.add(new Coordinate(-2.184188327334025,-79.88903419652674));
        list.add(new Coordinate(-2.184127735270326,-79.88845639270025));
        list.add(new Coordinate(-2.183457175218531,-79.88843186073244));
        list.add(new Coordinate(-2.182635594058342,-79.88911678842507));
        list.add(new Coordinate(-2.182390359028518,-79.8892273637488));
        list.add(new Coordinate(-2.182072360662451,-79.88927591237821));
        list.add(new Coordinate(-2.181328774045893,-79.88920930853821));
        list.add(new Coordinate(-2.180975856481257,-79.88916373813579));
        list.add(new Coordinate(-2.180696920134818,-79.88899690373106));
        list.add(new Coordinate(-2.180501752774048,-79.88872511018535));
        list.add(new Coordinate(-2.179665850571061,-79.88681752525002));
        list.add(new Coordinate(-2.178918457898026,-79.88555139153473));
        list.add(new Coordinate(-2.178483974591977,-79.88274061453231));
        return list;
    }

    public static PolygonOptions getGuayaquilZona17Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona17()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona18 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.18887319322419,-79.91523122187896));
        list.add(new Coordinate(-2.188851654795998,-79.91320713369919));
        list.add(new Coordinate(-2.188815004000082,-79.91110776577798));
        list.add(new Coordinate(-2.188755537690219,-79.90998057161868));
        list.add(new Coordinate(-2.188641238840404,-79.90948287824877));
        list.add(new Coordinate(-2.188226121369542,-79.90739790095323));
        list.add(new Coordinate(-2.18811354111335,-79.90676347123561));
        list.add(new Coordinate(-2.188109790332185,-79.90631194728056));
        list.add(new Coordinate(-2.188291103163648,-79.90479985168749));
        list.add(new Coordinate(-2.188913308597476,-79.90186734893049));
        list.add(new Coordinate(-2.188207107152524,-79.90142388950798));
        list.add(new Coordinate(-2.187582915169732,-79.90101350105456));
        list.add(new Coordinate(-2.187120702162184,-79.90051958024117));
        list.add(new Coordinate(-2.186693165740497,-79.8999801657436));
        list.add(new Coordinate(-2.186270795096671,-79.8991614616093));
        list.add(new Coordinate(-2.185989653261506,-79.89903548161148));
        list.add(new Coordinate(-2.185728269752599,-79.89951751096729));
        list.add(new Coordinate(-2.185425335384225,-79.89989234151634));
        list.add(new Coordinate(-2.184732501068032,-79.9004327980014));
        list.add(new Coordinate(-2.184236687345817,-79.90068247564253));
        list.add(new Coordinate(-2.183144829754324,-79.90117727699106));
        list.add(new Coordinate(-2.181951691737397,-79.90176359898983));
        list.add(new Coordinate(-2.18139758697188,-79.90202831269588));
        list.add(new Coordinate(-2.18094103539431,-79.90235581213227));
        list.add(new Coordinate(-2.180580598763682,-79.90285220381307));
        list.add(new Coordinate(-2.180242260377051,-79.90368569433163));
        list.add(new Coordinate(-2.179533438487792,-79.90549782676676));
        list.add(new Coordinate(-2.178931038026225,-79.90715125733603));
        list.add(new Coordinate(-2.17834607393793,-79.90875986610375));
        list.add(new Coordinate(-2.178924546172125,-79.90916320598602));
        list.add(new Coordinate(-2.179566599410918,-79.90989869837337));
        list.add(new Coordinate(-2.179983888742397,-79.91061919072865));
        list.add(new Coordinate(-2.179932991014441,-79.91085616030843));
        list.add(new Coordinate(-2.1789010208753,-79.9132610511309));
        list.add(new Coordinate(-2.178790988861787,-79.91354658467687));
        list.add(new Coordinate(-2.178799228550657,-79.91366772599788));
        list.add(new Coordinate(-2.178939483447698,-79.91381980426176));
        list.add(new Coordinate(-2.179986270282142,-79.91444743305884));
        list.add(new Coordinate(-2.182976435669237,-79.91639405140413));
        list.add(new Coordinate(-2.182985479383136,-79.91682930266968));
        list.add(new Coordinate(-2.1842802674516,-79.91768339813895));
        list.add(new Coordinate(-2.185598834180982,-79.9176581970945));
        list.add(new Coordinate(-2.18590899720232,-79.91760116110595));
        list.add(new Coordinate(-2.186061891360184,-79.91775311072286));
        list.add(new Coordinate(-2.186956594160818,-79.91784632689721));
        list.add(new Coordinate(-2.187721830649331,-79.91767850482967));
        list.add(new Coordinate(-2.188876677821215,-79.91770543376829));
        list.add(new Coordinate(-2.18887319322419,-79.91523122187896));
        return list;
    }

    public static PolygonOptions getGuayaquilZona18Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona18()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona19 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.191780480381423,-79.89071760619683));
        list.add(new Coordinate(-2.184529628834496,-79.88852998099165));
        list.add(new Coordinate(-2.184127142430323,-79.88845301931812));
        list.add(new Coordinate(-2.184189530142761,-79.88903653173297));
        list.add(new Coordinate(-2.184143372062802,-79.88944654336972));
        list.add(new Coordinate(-2.183681762887054,-79.89199584134288));
        list.add(new Coordinate(-2.182441078620165,-79.89163204760072));
        list.add(new Coordinate(-2.182042908315981,-79.89173022524847));
        list.add(new Coordinate(-2.181512013221527,-79.89190925230251));
        list.add(new Coordinate(-2.181356006235058,-79.89295213177942));
        list.add(new Coordinate(-2.180106990402099,-79.89615390775491));
        list.add(new Coordinate(-2.179987664412462,-79.89689467800085));
        list.add(new Coordinate(-2.180174361201471,-79.89696981451328));
        list.add(new Coordinate(-2.184138514730236,-79.89533083672474));
        list.add(new Coordinate(-2.184666603128958,-79.89544088956804));
        list.add(new Coordinate(-2.185386475799601,-79.89700602582227));
        list.add(new Coordinate(-2.18562408975219,-79.89683428843392));
        list.add(new Coordinate(-2.185913231862827,-79.89583657265851));
        list.add(new Coordinate(-2.186933035236832,-79.89614312084589));
        list.add(new Coordinate(-2.186716496033301,-79.89679557593314));
        list.add(new Coordinate(-2.18897769318044,-79.89751842691919));
        list.add(new Coordinate(-2.190236444438887,-79.89792620394901));
        list.add(new Coordinate(-2.191780480381423,-79.89071760619683));
        return list;
    }

    public static PolygonOptions getGuayaquilZona19Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona19()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona20 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.184455191813247,-79.88850493771761));
        list.add(new Coordinate(-2.184838520281437,-79.88860666010307));
        list.add(new Coordinate(-2.191780541319051,-79.89072928256758));
        list.add(new Coordinate(-2.192164772154741,-79.88898897732106));
        list.add(new Coordinate(-2.192596177630394,-79.88718348335912));
        list.add(new Coordinate(-2.192929486894498,-79.88557622860458));
        list.add(new Coordinate(-2.19338408079016,-79.88353076969752));
        list.add(new Coordinate(-2.193865732453265,-79.88170478815589));
        list.add(new Coordinate(-2.194222044061315,-79.88024233820336));
        list.add(new Coordinate(-2.193932477970054,-79.88016679785117));
        list.add(new Coordinate(-2.192728701393235,-79.87984297699011));
        list.add(new Coordinate(-2.191174032229612,-79.87939791969109));
        list.add(new Coordinate(-2.190334778788881,-79.87909282804547));
        list.add(new Coordinate(-2.189459688483203,-79.87872055586337));
        list.add(new Coordinate(-2.188519161853345,-79.87826807466128));
        list.add(new Coordinate(-2.187223359251445,-79.87769153236545));
        list.add(new Coordinate(-2.185841268497296,-79.8769813049576));
        list.add(new Coordinate(-2.184741410840307,-79.87640918857149));
        list.add(new Coordinate(-2.184271574940173,-79.87619323783274));
        list.add(new Coordinate(-2.183955674986832,-79.87618652091548));
        list.add(new Coordinate(-2.183708681005113,-79.87647398509344));
        list.add(new Coordinate(-2.183089234710702,-79.87760065365555));
        list.add(new Coordinate(-2.183449518909506,-79.87776922342052));
        list.add(new Coordinate(-2.183521628667199,-79.87797705167058));
        list.add(new Coordinate(-2.183643713886132,-79.8785238591168));
        list.add(new Coordinate(-2.183771258735485,-79.87895534088187));
        list.add(new Coordinate(-2.18382060796961,-79.87922340720627));
        list.add(new Coordinate(-2.183740966447903,-79.87958328081884));
        list.add(new Coordinate(-2.183623424369378,-79.87997927179896));
        list.add(new Coordinate(-2.183401514528965,-79.88060013756953));
        list.add(new Coordinate(-2.183344923086979,-79.88093745568719));
        list.add(new Coordinate(-2.18340336935989,-79.88174438548211));
        list.add(new Coordinate(-2.183524916943796,-79.88229559102607));
        list.add(new Coordinate(-2.183746115272662,-79.88279611215812));
        list.add(new Coordinate(-2.183873373378153,-79.88324231117809));
        list.add(new Coordinate(-2.183884395742112,-79.88364607034093));
        list.add(new Coordinate(-2.183819640989015,-79.88442425873257));
        list.add(new Coordinate(-2.183414105522904,-79.88651301382633));
        list.add(new Coordinate(-2.183568176194351,-79.88718063360095));
        list.add(new Coordinate(-2.184130380563555,-79.88845949968503));
        list.add(new Coordinate(-2.184455191813247,-79.88850493771761));
        return list;
    }

    public static PolygonOptions getGuayaquilZona20Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona20()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona21 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.19053676813486,-79.8965096689804));
        list.add(new Coordinate(-2.193537303844741,-79.89743618455212));
        list.add(new Coordinate(-2.195915241921451,-79.89820382527022));
        list.add(new Coordinate(-2.196743057265845,-79.89453949857682));
        list.add(new Coordinate(-2.197169856020135,-79.89256797247386));
        list.add(new Coordinate(-2.197686311833296,-79.89030535137795));
        list.add(new Coordinate(-2.198225727790574,-79.88797528127115));
        list.add(new Coordinate(-2.199055421781966,-79.88600507245744));
        list.add(new Coordinate(-2.19942725318206,-79.88518384437987));
        list.add(new Coordinate(-2.199909342893311,-79.88417396286233));
        list.add(new Coordinate(-2.200554490234658,-79.88307028663841));
        list.add(new Coordinate(-2.200325830790317,-79.88296315414723));
        list.add(new Coordinate(-2.20086877838268,-79.88246007042176));
        list.add(new Coordinate(-2.200649068903578,-79.88221130342215));
        list.add(new Coordinate(-2.200490662704913,-79.88189457796291));
        list.add(new Coordinate(-2.200026294575411,-79.88170547804731));
        list.add(new Coordinate(-2.199845564338202,-79.88158901463395));
        list.add(new Coordinate(-2.199400569326281,-79.8813991008163));
        list.add(new Coordinate(-2.198761163461491,-79.88127312048573));
        list.add(new Coordinate(-2.19731255681321,-79.88094860050906));
        list.add(new Coordinate(-2.196584891400042,-79.88083339191721));
        list.add(new Coordinate(-2.195783392453129,-79.88063299219972));
        list.add(new Coordinate(-2.194224375215764,-79.88023734735728));
        list.add(new Coordinate(-2.193871432608832,-79.88180089297262));
        list.add(new Coordinate(-2.193337097035556,-79.88377292702782));
        list.add(new Coordinate(-2.192761758121192,-79.88638134015682));
        list.add(new Coordinate(-2.192191868816651,-79.88898799067236));
        list.add(new Coordinate(-2.191784643123517,-79.89072748556555));
        list.add(new Coordinate(-2.19053676813486,-79.8965096689804));
        return list;
    }

    public static PolygonOptions getGuayaquilZona21Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona21()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona22 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.193569422603185,-79.89745458939743));
        list.add(new Coordinate(-2.190541037368756,-79.89650883679595));
        list.add(new Coordinate(-2.190223711816175,-79.89791647672354));
        list.add(new Coordinate(-2.189716090570819,-79.90014325008171));
        list.add(new Coordinate(-2.1895166475196,-79.90039708215684));
        list.add(new Coordinate(-2.189650583397009,-79.90071748024869));
        list.add(new Coordinate(-2.19045097193409,-79.90088610612281));
        list.add(new Coordinate(-2.190358196081663,-79.90147980594809));
        list.add(new Coordinate(-2.191403524382466,-79.90170012483058));
        list.add(new Coordinate(-2.191033323025978,-79.90359495497265));
        list.add(new Coordinate(-2.190616748888422,-79.90544528422163));
        list.add(new Coordinate(-2.190172267311354,-79.90761738409437));
        list.add(new Coordinate(-2.193664272562441,-79.90854998073361));
        list.add(new Coordinate(-2.19407002475034,-79.90678084059377));
        list.add(new Coordinate(-2.194365244119091,-79.90549289542544));
        list.add(new Coordinate(-2.194731499779663,-79.9037130710864));
        list.add(new Coordinate(-2.19526392655424,-79.9012444017071));
        list.add(new Coordinate(-2.195907447784029,-79.89820000262021));
        list.add(new Coordinate(-2.193569422603185,-79.89745458939743));
        return list;
    }

    public static PolygonOptions getGuayaquilZona22Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona22()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona23 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.21018020376671,-79.88614688787769));
        list.add(new Coordinate(-2.201422362186055,-79.88352086978357));
        list.add(new Coordinate(-2.200554490234658,-79.88307028663841));
        list.add(new Coordinate(-2.199909342893311,-79.88417396286233));
        list.add(new Coordinate(-2.19942725318206,-79.88518384437987));
        list.add(new Coordinate(-2.199055421781966,-79.88600507245744));
        list.add(new Coordinate(-2.198225727790574,-79.88797528127115));
        list.add(new Coordinate(-2.197686311833296,-79.89030535137795));
        list.add(new Coordinate(-2.197380746745385,-79.89164440269751));
        list.add(new Coordinate(-2.20766199025623,-79.89488078692394));
        list.add(new Coordinate(-2.21018020376671,-79.88614688787769));
        return list;
    }

    public static PolygonOptions getGuayaquilZona23Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona23()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona24 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.195763921323772,-79.89889627308473));
        list.add(new Coordinate(-2.198063339608678,-79.89961535049388));
        list.add(new Coordinate(-2.1976147907778,-79.90123143391298));
        list.add(new Coordinate(-2.198965852923836,-79.90147196334883));
        list.add(new Coordinate(-2.19914871675695,-79.9006855193114));
        list.add(new Coordinate(-2.206169571147026,-79.90291113905658));
        list.add(new Coordinate(-2.208378859116543,-79.89510638318703));
        list.add(new Coordinate(-2.197380691727095,-79.89164451304406));
        list.add(new Coordinate(-2.195763921323772,-79.89889627308473));
        return list;
    }

    public static PolygonOptions getGuayaquilZona24Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona24().size()>0) {
            for (Coordinate c : getGyeZona24()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona25 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona25Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona25().size()>0) {
            for (Coordinate c : getGyeZona25()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona26 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona26Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona26().size()>0) {
            for (Coordinate c : getGyeZona26()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona27 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona27Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona27().size()>0) {
            for (Coordinate c : getGyeZona27()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona28 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona28Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona28().size()>0) {
            for (Coordinate c : getGyeZona28()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona29 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona29Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona29().size()>0) {
            for (Coordinate c : getGyeZona29()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona30 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona30Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona30().size()>0) {
            for (Coordinate c : getGyeZona30()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona31 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona31Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona31().size()>0) {
            for (Coordinate c : getGyeZona31()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona32 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona32Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona32().size()>0) {
            for (Coordinate c : getGyeZona32()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona33 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona33Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona33().size()>0) {
            for (Coordinate c : getGyeZona33()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona34 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona34Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona34().size()>0) {
            for (Coordinate c : getGyeZona34()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona35 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        return list;
    }

    public static PolygonOptions getGuayaquilZona35Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona34().size()>0) {
            for (Coordinate c : getGyeZona35()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona36() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.24331698775349,-79.91014291616872));
        list.add(new Coordinate(-2.245836514166852,-79.91243362798473));
        list.add(new Coordinate(-2.247428663184366,-79.91378878258414));
        list.add(new Coordinate(-2.249095145813547,-79.91379800506445));
        list.add(new Coordinate(-2.249891977986823,-79.91333017696657));
        list.add(new Coordinate(-2.251228841883062,-79.91159010375051));
        list.add(new Coordinate(-2.249683147730528,-79.90997841213621));
        list.add(new Coordinate(-2.251873510529393,-79.90784513992612));
        list.add(new Coordinate(-2.25220397516514,-79.90792058294584));
        list.add(new Coordinate(-2.252770824325296,-79.90693295899777));
        list.add(new Coordinate(-2.252569015395022,-79.90622765534032));
        list.add(new Coordinate(-2.254192412391081,-79.90601027067717));
        list.add(new Coordinate(-2.25719328681117,-79.90674092867883));
        list.add(new Coordinate(-2.258941381716801,-79.90675472059397));
        list.add(new Coordinate(-2.262519979208781,-79.90156347486489));
        list.add(new Coordinate(-2.262457331437637,-79.90135479892585));
        list.add(new Coordinate(-2.264462625294898,-79.89841255553272));
        list.add(new Coordinate(-2.260413085700588,-79.89561759479926));
        list.add(new Coordinate(-2.259826708855895,-79.89524133346248));
        list.add(new Coordinate(-2.259260066631259,-79.89492613672901));
        list.add(new Coordinate(-2.258661878206463,-79.89467757757403));
        list.add(new Coordinate(-2.258304401609948,-79.89452452306684));
        list.add(new Coordinate(-2.257481328963376,-79.89423915513834));
        list.add(new Coordinate(-2.256684673072018,-79.89406337417915));
        list.add(new Coordinate(-2.255979409371574,-79.89397049689346));
        list.add(new Coordinate(-2.255058269883128,-79.8939347194694));
        list.add(new Coordinate(-2.253787276031741,-79.89402370434114));
        list.add(new Coordinate(-2.253121932915296,-79.8941277965727));
        list.add(new Coordinate(-2.238958470941467,-79.89634333091996));
        list.add(new Coordinate(-2.23892583211989,-79.91019840575389));
        list.add(new Coordinate(-2.238926560309721,-79.91095874629527));
        list.add(new Coordinate(-2.239024899513135,-79.91160568213944));
        list.add(new Coordinate(-2.24331698775349,-79.91014291616872));
        return list;
    }

    public static PolygonOptions getGuayaquilZona36Polygon() {
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona36()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona37() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.257599258550315, -79.89427718737747));
        list.add(new Coordinate(-2.26190890812861, -79.8745189304512));
        list.add(new Coordinate(-2.260233463951077, -79.87426795494369));
        list.add(new Coordinate(-2.260219106659696, -79.87312522266159));
        list.add(new Coordinate(-2.259096295774349, -79.87287122971409));
        list.add(new Coordinate(-2.25618974386635, -79.87087925031096));
        list.add(new Coordinate(-2.25577517595687, -79.87138391437685));
        list.add(new Coordinate(-2.254275406464414, -79.87401973896567));
        list.add(new Coordinate(-2.253436973747152, -79.87535990100186));
        list.add(new Coordinate(-2.252303332755878, -79.87697613962078));
        list.add(new Coordinate(-2.251633854631215, -79.87764687812266));
        list.add(new Coordinate(-2.249884081367448, -79.87896563071502));
        list.add(new Coordinate(-2.246061578186301, -79.88189187019428));
        list.add(new Coordinate(-2.243614620199292, -79.8838051366495));
        list.add(new Coordinate(-2.241753834618299, -79.8843551443268));
        list.add(new Coordinate(-2.241569940325738, -79.8895316410063));
        list.add(new Coordinate(-2.23903416435535, -79.88950958596108));
        list.add(new Coordinate(-2.238958470941467, -79.89634333091996));
        list.add(new Coordinate(-2.253121932915296, -79.8941277965727));
        list.add(new Coordinate(-2.253787276031741, -79.89402370434114));
        list.add(new Coordinate(-2.254415380736596, -79.89396110709831));
        list.add(new Coordinate(-2.255058269883128, -79.8939347194694));
        list.add(new Coordinate(-2.255979409371574, -79.89397049689346));
        list.add(new Coordinate(-2.256684673072018, -79.89406337417915));
        list.add(new Coordinate(-2.257500048351921, -79.89424127406808));
        list.add(new Coordinate(-2.257599258550315, -79.89427718737747));
        return list;
    }

    public static PolygonOptions getGuayaquilZona37Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona37()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona38 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        //list.add(new Coordinate());

        return list;
    }

    public static PolygonOptions getGuayaquilZona38Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGyeZona38().size()>0) {
            for (Coordinate c : getGyeZona38()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGyeZona39 () {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.181057311294934,-79.97201617329868));
        list.add(new Coordinate(-2.183138836922986,-79.9721984441496));
        list.add(new Coordinate(-2.182218954813831,-79.97809650395726));
        list.add(new Coordinate(-2.178545836428026,-79.97762909027041));
        list.add(new Coordinate(-2.176163175948508,-79.98248687548933));
        list.add(new Coordinate(-2.175956336591541,-79.98714722964138));
        list.add(new Coordinate(-2.182815126909578,-79.98749031072518));
        list.add(new Coordinate(-2.182462274872053,-79.99009156894084));
        list.add(new Coordinate(-2.1824329057226,-79.9921463938024));
        list.add(new Coordinate(-2.182566587642554,-79.99385983849905));
        list.add(new Coordinate(-2.182837745946367,-79.99558692835468));
        list.add(new Coordinate(-2.187976589573341,-80.02171566346513));
        list.add(new Coordinate(-2.188441736242879,-80.0288266765841));
        list.add(new Coordinate(-2.191654792126744,-80.02841446198907));
        list.add(new Coordinate(-2.194601464100525,-80.00545043781642));
        list.add(new Coordinate(-2.194932486099545,-79.97109317250674));
        list.add(new Coordinate(-2.197444023233008,-79.96621659549562));
        list.add(new Coordinate(-2.195102744440011,-79.96230910214329));
        list.add(new Coordinate(-2.19233025740045,-79.95859174508074));
        list.add(new Coordinate(-2.191534449290258,-79.95831907896466));
        list.add(new Coordinate(-2.19078684851331,-79.9580135796086));
        list.add(new Coordinate(-2.190191567557095,-79.95789117590506));
        list.add(new Coordinate(-2.189602685377956,-79.95786572522937));
        list.add(new Coordinate(-2.188989181589418,-79.95800347604425));
        list.add(new Coordinate(-2.187592397797741,-79.95866376875202));
        list.add(new Coordinate(-2.187028798036699,-79.95963803303675));
        list.add(new Coordinate(-2.185957713084204,-79.9661239131334));
        list.add(new Coordinate(-2.181506573937963,-79.96487897630004));
        list.add(new Coordinate(-2.176016369723436,-79.96589211532258));
        list.add(new Coordinate(-2.175554019677577,-79.96664143578485));
        list.add(new Coordinate(-2.181057311294934,-79.97201617329868));
        return list;
    }

    public static PolygonOptions getGuayaquilZona39Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getGyeZona39()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getMachZona4() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-3.252442116791793,-79.95960055737956));
        list.add(new Coordinate(-3.258118530977122,-79.95456693493044));
        list.add(new Coordinate(-3.262276222716841,-79.95015353060001));
        list.add(new Coordinate(-3.25348244984143,-79.94216494124528));
        list.add(new Coordinate(-3.244917923734008,-79.94999353887695));
        list.add(new Coordinate(-3.244653941552942,-79.9507578447467));
        list.add(new Coordinate(-3.24478604084129,-79.95162431849936));
        list.add(new Coordinate(-3.245205866087972,-79.95248465496815));
        list.add(new Coordinate(-3.245853103390011,-79.95383582362058));
        list.add(new Coordinate(-3.252442116791793,-79.95960055737956));
        return list;
    }

    public static PolygonOptions getMachalaZona4Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getMachZona4()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getMachZona7() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-3.253458183149426,-79.94212682627153));
        list.add(new Coordinate(-3.255197055532096,-79.93726537675997));
        list.add(new Coordinate(-3.25267433265838,-79.93324532858944));
        list.add(new Coordinate(-3.249887316761623,-79.93093049724797));
        list.add(new Coordinate(-3.251930821873908,-79.92815500161515));
        list.add(new Coordinate(-3.251695477406467,-79.92789644210427));
        list.add(new Coordinate(-3.249479090563102,-79.9294436754986));
        list.add(new Coordinate(-3.248706720178412,-79.92832851390189));
        list.add(new Coordinate(-3.242424980212038,-79.93605416517477));
        list.add(new Coordinate(-3.240235907851995,-79.93620477697942));
        list.add(new Coordinate(-3.240241972528951,-79.93874062452031));
        list.add(new Coordinate(-3.238174983675731,-79.94005987489246));
        list.add(new Coordinate(-3.246656447577577,-79.94829119973059));
        list.add(new Coordinate(-3.253458183149426,-79.94212682627153));

        return list;
    }

    public static PolygonOptions getMachalaZona7Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getMachZona7()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getSantaRosa() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-3.454016758309557,-79.9744386076824));
        list.add(new Coordinate(-3.459501680495556,-79.97426688474081));
        list.add(new Coordinate(-3.45941317438957,-79.96447286499426));
        list.add(new Coordinate(-3.459451710374553,-79.96385082266212));
        list.add(new Coordinate(-3.459824257681077,-79.9637306906165));
        list.add(new Coordinate(-3.460051215792177,-79.96333599688266));
        list.add(new Coordinate(-3.46054221962349,-79.95951393964539));
        list.add(new Coordinate(-3.459190453521376,-79.95956892729603));
        list.add(new Coordinate(-3.459180243497126,-79.95819068457095));
        list.add(new Coordinate(-3.458553172803862,-79.95820642270567));
        list.add(new Coordinate(-3.456391745181798,-79.95399409036493));
        list.add(new Coordinate(-3.455725981625861,-79.95462071626466));
        list.add(new Coordinate(-3.453249509767403,-79.95335490611514));
        list.add(new Coordinate(-3.452669068840991,-79.95259480938614));
        list.add(new Coordinate(-3.452039307320033,-79.95220909410854));
        list.add(new Coordinate(-3.450811307712281,-79.9525830170806));
        list.add(new Coordinate(-3.45047441993586,-79.95490347477336));
        list.add(new Coordinate(-3.448348516034551,-79.95666200216105));
        list.add(new Coordinate(-3.447361317089558,-79.95766307732683));
        list.add(new Coordinate(-3.44731313347034,-79.95546797270885));
        list.add(new Coordinate(-3.448264207697527,-79.95326075544401));
        list.add(new Coordinate(-3.450082174348386,-79.95090864826645));
        list.add(new Coordinate(-3.448183165182905,-79.9492652812674));
        list.add(new Coordinate(-3.446421424435621,-79.94786141630009));
        list.add(new Coordinate(-3.44516730024649,-79.94648110537131));
        list.add(new Coordinate(-3.438879056601041,-79.94806742412237));
        list.add(new Coordinate(-3.438502831925627,-79.94860139947078));
        list.add(new Coordinate(-3.436480507045498,-79.9481616962793));
        list.add(new Coordinate(-3.435963204607476,-79.95029758388714));
        list.add(new Coordinate(-3.438628304061854,-79.95125551326358));
        list.add(new Coordinate(-3.4410895845981,-79.95477345697505));
        list.add(new Coordinate(-3.442220609176977,-79.95375494908583));
        list.add(new Coordinate(-3.444544247383243,-79.95596216971612));
        list.add(new Coordinate(-3.444628535924541,-79.95712004282746));
        list.add(new Coordinate(-3.445203463195423,-79.95830557399535));
        list.add(new Coordinate(-3.4449152679805,-79.95841440366051));
        list.add(new Coordinate(-3.445431594175759,-79.95970991424676));
        list.add(new Coordinate(-3.445692116997661,-79.95970990984621));
        list.add(new Coordinate(-3.446624045919837,-79.96307618852103));
        list.add(new Coordinate(-3.44973405958133,-79.96328172631864));
        list.add(new Coordinate(-3.45008459521113,-79.96475260256379));
        list.add(new Coordinate(-3.450733560929318,-79.96530781957372));
        list.add(new Coordinate(-3.452183841609982,-79.96599836605491));
        list.add(new Coordinate(-3.45259595043412,-79.96643020328305));
        list.add(new Coordinate(-3.454236858623338,-79.97063239875014));
        list.add(new Coordinate(-3.454016758309557,-79.9744386076824));


        return list;
    }

    public static PolygonOptions getSantaRosaPolygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getSantaRosa()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getDurZona1() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.169104368486063,-79.85414507890523));
        list.add(new Coordinate(-2.179384599804813,-79.85960048198523));
        list.add(new Coordinate(-2.180852278393106,-79.856373153107));
        list.add(new Coordinate(-2.187529635603436,-79.85631554631584));
        list.add(new Coordinate(-2.186780235300314,-79.84931561873803));
        list.add(new Coordinate(-2.185536890923826,-79.84945965327307));
        list.add(new Coordinate(-2.179448672162892,-79.84742920918242));
        list.add(new Coordinate(-2.179194216946428,-79.84829357545586));
        list.add(new Coordinate(-2.177310864317331,-79.8492005157035));
        list.add(new Coordinate(-2.172616140910434,-79.84500449805699));
        list.add(new Coordinate(-2.172397581678335,-79.84147632139137));
        list.add(new Coordinate(-2.170448384141563,-79.84157757833593));
        list.add(new Coordinate(-2.170398031465907,-79.83877955827711));
        list.add(new Coordinate(-2.169976635644597,-79.83825846124373));
        list.add(new Coordinate(-2.163722433985674,-79.84759472198624));
        list.add(new Coordinate(-2.169104368486063,-79.85414507890523));
        return list;
    }

    public static PolygonOptions getDuranZona1Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getDurZona1()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getDurZona2() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.176662002018819,-79.82808289992174));
        list.add(new Coordinate(-2.16672349100761,-79.82154956769112));
        list.add(new Coordinate(-2.165568516691415,-79.82291921531132));
        list.add(new Coordinate(-2.162594343662776,-79.82096872878573));
        list.add(new Coordinate(-2.161001104213169,-79.82226273526069));
        list.add(new Coordinate(-2.160782112189549,-79.82386320176693));
        list.add(new Coordinate(-2.154914216080599,-79.82398946121589));
        list.add(new Coordinate(-2.155176145497495,-79.82811766484547));
        list.add(new Coordinate(-2.152561066052237,-79.83142031838793));
        list.add(new Coordinate(-2.153539375681633,-79.83285297035184));
        list.add(new Coordinate(-2.151837978791752,-79.83500227135652));
        list.add(new Coordinate(-2.152335966673504,-79.83569218620256));
        list.add(new Coordinate(-2.15140216394202,-79.83833457810364));
        list.add(new Coordinate(-2.151206036815118,-79.84125280588648));
        list.add(new Coordinate(-2.160122546561216,-79.84484791999688));
        list.add(new Coordinate(-2.163517973456651,-79.84736645894576));
        list.add(new Coordinate(-2.176662002018819,-79.82808289992174));
        return list;
    }

    public static PolygonOptions getDuranZona2Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getDurZona2()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getDurZona5() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.170482066921122,-79.84155111685467));
        list.add(new Coordinate(-2.172417687686069,-79.84146636459801));
        list.add(new Coordinate(-2.172636031267927,-79.84501488627707));
        list.add(new Coordinate(-2.177323825940759,-79.84920577621455));
        list.add(new Coordinate(-2.179214250421443,-79.84830886703836));
        list.add(new Coordinate(-2.179464663864778,-79.8474532334948));
        list.add(new Coordinate(-2.185541477675121,-79.84945314457556));
        list.add(new Coordinate(-2.186804035285327,-79.84930070451003));
        list.add(new Coordinate(-2.18812077890174,-79.84385825951644));
        list.add(new Coordinate(-2.186260522908769,-79.83907727387192));
        list.add(new Coordinate(-2.183703006196586,-79.8384483206399));
        list.add(new Coordinate(-2.183689343651142,-79.83558445941101));
        list.add(new Coordinate(-2.182117548556432,-79.83540683471527));
        list.add(new Coordinate(-2.183252005704046,-79.8319415050788));
        list.add(new Coordinate(-2.187046617511433,-79.82850649822223));
        list.add(new Coordinate(-2.186720171090326,-79.82783066887303));
        list.add(new Coordinate(-2.178484959753115,-79.82981147156825));
        list.add(new Coordinate(-2.173713638356367,-79.83281590365034));
        list.add(new Coordinate(-2.170309202415841,-79.8380499578726));
        list.add(new Coordinate(-2.170482066921122,-79.84155111685467));
        return list;
    }

    public static PolygonOptions getDuranZona5Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getDurZona5()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getDurZona6() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.18253934656351,-79.83439850165334));
        list.add(new Coordinate(-2.188615753047465,-79.84423938911034));
        list.add(new Coordinate(-2.202870537144944,-79.83214016736282));
        list.add(new Coordinate(-2.217900599039844,-79.82705094437584));
        list.add(new Coordinate(-2.214032628722858,-79.81709666259521));
        list.add(new Coordinate(-2.210620164223089,-79.81740192137188));
        list.add(new Coordinate(-2.207673949471701,-79.81260579002405));
        list.add(new Coordinate(-2.200290001974831,-79.81902030156292));
        list.add(new Coordinate(-2.198717406980779,-79.81760005864867));
        list.add(new Coordinate(-2.195233249532858,-79.82041749952388));
        list.add(new Coordinate(-2.186595032157127,-79.81163830194596));
        list.add(new Coordinate(-2.198281165176666,-79.79955041315733));
        list.add(new Coordinate(-2.191286294077592,-79.79456500782001));
        list.add(new Coordinate(-2.187991802489723,-79.80092122787924));
        list.add(new Coordinate(-2.184997295076149,-79.81042957938341));
        list.add(new Coordinate(-2.182000504309571,-79.81982612121735));
        list.add(new Coordinate(-2.174194265771235,-79.83234974903584));
        list.add(new Coordinate(-2.178394112513514,-79.82964527220469));
        list.add(new Coordinate(-2.186689921159086,-79.8278753038332));
        list.add(new Coordinate(-2.18253934656351,-79.83439850165334));
        return list;
    }

    public static PolygonOptions getDuranZona6Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getDurZona6()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getStaRosaZona1() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-3.454384911246547,-79.97072327962336));
        list.add(new Coordinate(-3.452372292363847,-79.96571654286302));
        list.add(new Coordinate(-3.451015330626258,-79.96499062187186));
        list.add(new Coordinate(-3.45011846978192,-79.96275441536928));
        list.add(new Coordinate(-3.447162110133907,-79.96247355042415));
        list.add(new Coordinate(-3.445579241507745,-79.95834190762393));
        list.add(new Coordinate(-3.434920665912081,-79.96175839355914));
        list.add(new Coordinate(-3.433750289548577,-79.97039849913475));
        list.add(new Coordinate(-3.436362936861702,-79.97190185544629));
        list.add(new Coordinate(-3.441678617513287,-79.96936981063148));
        list.add(new Coordinate(-3.443435795438553,-79.96947933360575));
        list.add(new Coordinate(-3.446219214219974,-79.9724729031454));
        list.add(new Coordinate(-3.448736637028187,-79.97333917161248));
        list.add(new Coordinate(-3.454188031296178,-79.97382040865558));
        list.add(new Coordinate(-3.454384911246547,-79.97072327962336));
        return list;
    }

    public static PolygonOptions getSantaRosaZona1Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getStaRosaZona1()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getStaRosaZona2() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-3.459681087464035,-79.97397642634228));
        list.add(new Coordinate(-3.459707351585178,-79.96414747323031));
        list.add(new Coordinate(-3.461189686673871,-79.95922543035721));
        list.add(new Coordinate(-3.454828007658456,-79.94847195917984));
        list.add(new Coordinate(-3.450842057019365,-79.94237075351441));
        list.add(new Coordinate(-3.43507555618044,-79.94699574242759));
        list.add(new Coordinate(-3.433897794473004,-79.94959464938333));
        list.add(new Coordinate(-3.440498224234526,-79.95516520966798));
        list.add(new Coordinate(-3.443944169543448,-79.95597834844169));
        list.add(new Coordinate(-3.446271605812782,-79.96329219126335));
        list.add(new Coordinate(-3.449711859686969,-79.9635988427836));
        list.add(new Coordinate(-3.451959336406659,-79.96557997367709));
        list.add(new Coordinate(-3.454543332893757,-79.97008840034842));
        list.add(new Coordinate(-3.454344423144144,-79.97372039762128));
        list.add(new Coordinate(-3.459681087464035,-79.97397642634228));
        return list;
    }

    public static PolygonOptions getSantaRosaZona2Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getStaRosaZona2()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getNobol() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-1.906118325198725,-80.01760382797635));
        list.add(new Coordinate(-1.908075818438306,-80.01750519735681));
        list.add(new Coordinate(-1.908358117406847,-80.01830295171054));
        list.add(new Coordinate(-1.909593098263374,-80.01806696145144));
        list.add(new Coordinate(-1.910400300851341,-80.01952351147044));
        list.add(new Coordinate(-1.912323880480514,-80.01838743027399));
        list.add(new Coordinate(-1.912428226544653,-80.01737792791424));
        list.add(new Coordinate(-1.91393446490054,-80.01650207034791));
        list.add(new Coordinate(-1.916687336442581,-80.0177775538464));
        list.add(new Coordinate(-1.919407690666188,-80.01602495423221));
        list.add(new Coordinate(-1.920513320179738,-80.0162605286597));
        list.add(new Coordinate(-1.923378297799781,-80.01500382101726));
        list.add(new Coordinate(-1.923039213368033,-80.01345413469898));
        list.add(new Coordinate(-1.925743286374795,-80.01152802786227));
        list.add(new Coordinate(-1.924766343414065,-80.01063237174472));
        list.add(new Coordinate(-1.924714469379241,-80.00886429031617));
        list.add(new Coordinate(-1.921209518385974,-80.0086527737474));
        list.add(new Coordinate(-1.919010808457874,-80.00987738570829));
        list.add(new Coordinate(-1.9170597862453,-80.00860418651762));
        list.add(new Coordinate(-1.915265269756421,-80.00518334123315));
        list.add(new Coordinate(-1.914410540574937,-80.00659280194533));
        list.add(new Coordinate(-1.912720353138362,-80.00734419683272));
        list.add(new Coordinate(-1.910973676799067,-80.00979280848566));
        list.add(new Coordinate(-1.904387178891389,-80.0094361296799));
        list.add(new Coordinate(-1.903667219307303,-80.01063271820374));
        list.add(new Coordinate(-1.905084398673917,-80.01085398295085));
        list.add(new Coordinate(-1.905600676444933,-80.01257751328926));
        list.add(new Coordinate(-1.903962856961367,-80.01710876284326));
        list.add(new Coordinate(-1.906118325198725,-80.01760382797635));
        return list;
    }

    public static PolygonOptions getNobolPolygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        for (Coordinate c : getNobol()){
            rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getNaranjito() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.163468195956982,-79.47605171270196));
        list.add(new Coordinate(-2.17013772690229,-79.47570409807925));
        list.add(new Coordinate(-2.169900386395767,-79.47840541194242));
        list.add(new Coordinate(-2.182890178116429,-79.45944260429606));
        list.add(new Coordinate(-2.173155621498854,-79.45103616297649));
        list.add(new Coordinate(-2.168152605536416,-79.45796208853456));
        list.add(new Coordinate(-2.165036681765548,-79.42939163097911));
        list.add(new Coordinate(-2.158870457300192,-79.4302096390134));
        list.add(new Coordinate(-2.164310569016624,-79.45199726117622));
        list.add(new Coordinate(-2.162301715988521,-79.4532260397452));
        list.add(new Coordinate(-2.162728685174344,-79.45745723181143));
        list.add(new Coordinate(-2.15495008306808,-79.45748394255301));
        list.add(new Coordinate(-2.154839695041749,-79.46433540812828));
        list.add(new Coordinate(-2.162363268047242,-79.4643723638755));
        list.add(new Coordinate(-2.163468195956982,-79.47605171270196));
        return list;
    }

    public static PolygonOptions getNaranjitoPolygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getNaranjito().size()>0) {
            for (Coordinate c : getNaranjito()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getYaguachi() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.098594441443832,-79.71062657632284));
        list.add(new Coordinate(-2.105309078705637,-79.70040977676806));
        list.add(new Coordinate(-2.103872768697993,-79.68864865600881));
        list.add(new Coordinate(-2.096587989132826,-79.6848119929486));
        list.add(new Coordinate(-2.093295217249369,-79.67942042216052));
        list.add(new Coordinate(-2.092212502559992,-79.68933944277222));
        list.add(new Coordinate(-2.090559463020279,-79.69144311317236));
        list.add(new Coordinate(-2.090744146475222,-79.69574384835276));
        list.add(new Coordinate(-2.083492508041895,-79.69735691318626));
        list.add(new Coordinate(-2.085077981325263,-79.70267093642806));
        list.add(new Coordinate(-2.094636093366963,-79.7005896089195));
        list.add(new Coordinate(-2.098594441443832,-79.71062657632284));
        return list;
    }

    public static PolygonOptions getYaguachiPolygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getYaguachi().size()>0) {
            for (Coordinate c : getYaguachi()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getElIngenio() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-3.73539688214993,-79.93143824012969));
        list.add(new Coordinate(-3.733446607233918,-79.93200921477205));
        list.add(new Coordinate(-3.732870970853042,-79.93106952201356));
        list.add(new Coordinate(-3.735840617978679,-79.92936946654959));
        list.add(new Coordinate(-3.736415021134035,-79.92993323411784));
        list.add(new Coordinate(-3.73539688214993,-79.93143824012969));
        return list;
    }

    public static PolygonOptions getElIngenioPolygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getElIngenio().size()>0) {
            for (Coordinate c : getElIngenio()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getLaIberia() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-3.256951836901734,-79.87746726550584));
        list.add(new Coordinate(-3.254977695746427,-79.87503602616086));
        list.add(new Coordinate(-3.256838298788209,-79.87214793782886));
        list.add(new Coordinate(-3.253148740038585,-79.86895443110436));
        list.add(new Coordinate(-3.256307074336821,-79.86657363339833));
        list.add(new Coordinate(-3.259220201738039,-79.86707930669728));
        list.add(new Coordinate(-3.259814480997798,-79.86783151558988));
        list.add(new Coordinate(-3.260972142001302,-79.86784609091784));
        list.add(new Coordinate(-3.262502434611652,-79.86980944531692));
        list.add(new Coordinate(-3.262706853236351,-79.87147302340738));
        list.add(new Coordinate(-3.260554155999856,-79.87266696331442));
        list.add(new Coordinate(-3.261460473868778,-79.87475389704679));
        list.add(new Coordinate(-3.260371340096952,-79.87580616195027));
        list.add(new Coordinate(-3.25985957947009,-79.87477917267744));
        list.add(new Coordinate(-3.257752433717767,-79.87523849920468));
        list.add(new Coordinate(-3.258388996887501,-79.87621880480249));
        list.add(new Coordinate(-3.256951836901734,-79.87746726550584));
        return list;
    }

    public static PolygonOptions getLaIberiaPolygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getLaIberia().size()>0) {
            for (Coordinate c : getLaIberia()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getLaVictoria() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-3.781817088773508,-80.06456237891158));
        list.add(new Coordinate(-3.77919101561222,-80.05877057940535));
        list.add(new Coordinate(-3.779971466321852,-80.05749869030748));
        list.add(new Coordinate(-3.783470186342256,-80.0611478136762));
        list.add(new Coordinate(-3.786026811038486,-80.0568332759462));
        list.add(new Coordinate(-3.786844397284606,-80.05703608307897));
        list.add(new Coordinate(-3.789273470117334,-80.06110949464143));
        list.add(new Coordinate(-3.790088422418758,-80.05882418319344));
        list.add(new Coordinate(-3.792145914753919,-80.06006643528782));
        list.add(new Coordinate(-3.788953394301905,-80.06625019630813));
        list.add(new Coordinate(-3.786946280897766,-80.06480507937283));
        list.add(new Coordinate(-3.785481790524163,-80.06668457423498));
        list.add(new Coordinate(-3.781817088773508,-80.06456237891158));
        return list;
    }

    public static PolygonOptions getLaVictoriaPolygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getLaVictoria().size()>0) {
            for (Coordinate c : getLaVictoria()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGuarandaZona1() {
        ArrayList<Coordinate> list = new ArrayList<>();
        /*list.add(new Coordinate());
        list.add(new Coordinate());
        list.add(new Coordinate());
        list.add(new Coordinate());
        list.add(new Coordinate());
        list.add(new Coordinate());
        list.add(new Coordinate());
        list.add(new Coordinate());
        list.add(new Coordinate());
        list.add(new Coordinate());
*/
        return list;
    }

    public static PolygonOptions getGuarandaZona1Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGuarandaZona1().size()>0) {
            for (Coordinate c : getGuarandaZona1()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getGuarandaZona2() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.098594441443832,-79.71062657632284));
        list.add(new Coordinate(-2.105309078705637,-79.70040977676806));
        list.add(new Coordinate(-2.103872768697993,-79.68864865600881));
        list.add(new Coordinate(-2.096587989132826,-79.6848119929486));
        list.add(new Coordinate(-2.093295217249369,-79.67942042216052));
        list.add(new Coordinate(-2.092212502559992,-79.68933944277222));
        list.add(new Coordinate(-2.090559463020279,-79.69144311317236));
        list.add(new Coordinate(-2.090744146475222,-79.69574384835276));
        list.add(new Coordinate(-2.083492508041895,-79.69735691318626));
        list.add(new Coordinate(-2.085077981325263,-79.70267093642806));
        list.add(new Coordinate(-2.094636093366963,-79.7005896089195));
        list.add(new Coordinate(-2.098594441443832,-79.71062657632284));
        return list;
    }

    public static PolygonOptions getGuarandaZona2Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGuarandaZona2().size()>0) {
            for (Coordinate c : getGuarandaZona2()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }


    public static ArrayList<Coordinate> getGuayaquilNuevaZona19() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-2.213571068362987,-79.94366480680574));
        list.add(new Coordinate(-2.222600134969625,-79.94703637476012));
        list.add(new Coordinate(-2.223193028583454,-79.94585558365925));
        list.add(new Coordinate(-2.225603131374627,-79.94702472227402));
        list.add(new Coordinate(-2.227065929252344,-79.9444281804125));
        list.add(new Coordinate(-2.22799336941018,-79.9450861195587));
        list.add(new Coordinate(-2.228462975163283,-79.94455157567744));
        list.add(new Coordinate(-2.229443302982225,-79.94545035666243));
        list.add(new Coordinate(-2.22975492217254,-79.94497693853883));
        list.add(new Coordinate(-2.230154066993955,-79.94416628211678));
        list.add(new Coordinate(-2.230433947631734,-79.94391956646636));
        list.add(new Coordinate(-2.231596199377798,-79.94554094173577));
        list.add(new Coordinate(-2.232604016271234,-79.94490377630982));
        list.add(new Coordinate(-2.234379084328716,-79.94367399293374));
        list.add(new Coordinate(-2.233156153024992,-79.94263151713139));
        list.add(new Coordinate(-2.23382254232221,-79.94024071902638));
        list.add(new Coordinate(-2.231786499547535,-79.93760554303967));
        list.add(new Coordinate(-2.231341951282239,-79.9379320541924));
        list.add(new Coordinate(-2.230505893119233,-79.93700962521328));
        list.add(new Coordinate(-2.231411738882891,-79.93603959793565));
        list.add(new Coordinate(-2.229812981685391,-79.93419881407611));
        list.add(new Coordinate(-2.228814502668513,-79.93335675373942));
        list.add(new Coordinate(-2.229229773527356,-79.93289775956782));
        list.add(new Coordinate(-2.230054911327192,-79.93114249977489));
        list.add(new Coordinate(-2.231099905819653,-79.92987720067485));
        list.add(new Coordinate(-2.23066913203604,-79.92950366154391));
        list.add(new Coordinate(-2.230102783567169,-79.92924820574562));
        list.add(new Coordinate(-2.230505619549387,-79.92846190257151));
        list.add(new Coordinate(-2.23058940589451,-79.92752358661937));
        list.add(new Coordinate(-2.229759795399454,-79.9276872345165));
        list.add(new Coordinate(-2.228670938526068,-79.92712442184451));
        list.add(new Coordinate(-2.229040830182584,-79.9264817872153));
        list.add(new Coordinate(-2.227032937377833,-79.92564583316513));
        list.add(new Coordinate(-2.226799940554618,-79.92606094506334));
        list.add(new Coordinate(-2.226165765345563,-79.92568808193447));
        list.add(new Coordinate(-2.2255435862537,-79.92502152072817));
        list.add(new Coordinate(-2.226644985711991,-79.92213552663606));
        list.add(new Coordinate(-2.22576482743745,-79.92195933059708));
        list.add(new Coordinate(-2.225553375804291,-79.9226426387153));
        list.add(new Coordinate(-2.224779895997254,-79.92256786849121));
        list.add(new Coordinate(-2.22437981105993,-79.92332593482364));
        list.add(new Coordinate(-2.224075776699445,-79.92454840937648));
        list.add(new Coordinate(-2.223561032351398,-79.92548703347745));
        list.add(new Coordinate(-2.221857422315636,-79.92464498422255));
        list.add(new Coordinate(-2.222204145055751,-79.92417522378499));
        list.add(new Coordinate(-2.221574726137499,-79.92367344545106));
        list.add(new Coordinate(-2.223164316676594,-79.92143907608971));
        list.add(new Coordinate(-2.224008478533821,-79.92002315530797));
        list.add(new Coordinate(-2.22187033371904,-79.91909389829621));
        list.add(new Coordinate(-2.221446685734369,-79.91869156144001));
        list.add(new Coordinate(-2.221948548586303,-79.91805928313936));
        list.add(new Coordinate(-2.219936047461139,-79.91599598849828));
        list.add(new Coordinate(-2.219307353684609,-79.91670746468323));
        list.add(new Coordinate(-2.217545601586692,-79.91848010877212));
        list.add(new Coordinate(-2.218177538888582,-79.91903585414879));
        list.add(new Coordinate(-2.217593456678732,-79.9196443325817));
        list.add(new Coordinate(-2.218359447674385,-79.92043623129952));
        list.add(new Coordinate(-2.217550355519638,-79.92176812636521));
        list.add(new Coordinate(-2.218067400775832,-79.92212745415444));
        list.add(new Coordinate(-2.216341496890911,-79.92514151004914));
        list.add(new Coordinate(-2.216968638394127,-79.92569248983699));
        list.add(new Coordinate(-2.215575853027705,-79.92811161264663));
        list.add(new Coordinate(-2.214939120228212,-79.92788642030362));
        list.add(new Coordinate(-2.214738059698286,-79.92839428989066));
        list.add(new Coordinate(-2.21427849809155,-79.9291847751381));
        list.add(new Coordinate(-2.213852429899446,-79.92977882846672));
        list.add(new Coordinate(-2.215365181712179,-79.93119231528121));
        list.add(new Coordinate(-2.215729035572881,-79.93081857965387));
        list.add(new Coordinate(-2.21630590283804,-79.93139361727012));
        list.add(new Coordinate(-2.213868427809453,-79.93384368780946));
        list.add(new Coordinate(-2.214380654217162,-79.93437547234542));
        list.add(new Coordinate(-2.21385405070016,-79.9348928818842));
        list.add(new Coordinate(-2.21490246103816,-79.93600843648618));
        list.add(new Coordinate(-2.214524258877333,-79.93659290737119));
        list.add(new Coordinate(-2.213470997751806,-79.93987945534667));
        list.add(new Coordinate(-2.214232172496637,-79.94011951056071));
        list.add(new Coordinate(-2.213571068362987,-79.94366480680574));
        return list;
    }

    public static PolygonOptions getGuayaquilNuevaZona19Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getGuayaquilNuevaZona19().size()>0) {
            for (Coordinate c : getGuayaquilNuevaZona19()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getQuevedoZona1() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-1.035122991415816,-79.48593124013414));
        list.add(new Coordinate(-1.034472421333645,-79.49163426447727));
        list.add(new Coordinate(-1.038422195980638,-79.49663912066879));
        list.add(new Coordinate(-1.055428649636128,-79.4977488178905));
        list.add(new Coordinate(-1.072404642933664,-79.49339697078031));
        list.add(new Coordinate(-1.060124453846196,-79.4648319359014));
        list.add(new Coordinate(-1.059592804455985,-79.46227498652988));
        list.add(new Coordinate(-1.057548567689985,-79.45911949004841));
        list.add(new Coordinate(-1.05485645295097,-79.45879269654159));
        list.add(new Coordinate(-1.05106088669617,-79.46106291538358));
        list.add(new Coordinate(-1.050839739508716,-79.46494378150977));
        list.add(new Coordinate(-1.048486947274662,-79.46594100920635));
        list.add(new Coordinate(-1.048851533319157,-79.46810775407906));
        list.add(new Coordinate(-1.042812907207795,-79.47753002114619));
        list.add(new Coordinate(-1.042048441441578,-79.47699874209765));
        list.add(new Coordinate(-1.040726742354019,-79.47916035709635));
        list.add(new Coordinate(-1.041616205646406,-79.47979602013663));
        list.add(new Coordinate(-1.041616028026936,-79.48035543997216));
        list.add(new Coordinate(-1.041005742978943,-79.48195670835899));
        list.add(new Coordinate(-1.041030997906137,-79.48302343790587));
        list.add(new Coordinate(-1.03940624618807,-79.48525650603244));
        list.add(new Coordinate(-1.037603120282095,-79.48416665179467));
        list.add(new Coordinate(-1.035122991415816,-79.48593124013414));
        return list;
    }

    public static PolygonOptions getQuevedoZona1Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getQuevedoZona1().size()>0) {
            for (Coordinate c : getQuevedoZona1()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getQuevedoZona2() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-1.048211545368416,-79.46452427501281));
        list.add(new Coordinate(-1.048854516105715,-79.46810556799962));
        list.add(new Coordinate(-1.042023511317259,-79.47705290896629));
        list.add(new Coordinate(-1.040675927678713,-79.4791845955548));
        list.add(new Coordinate(-1.041677185172087,-79.47977064672509));
        list.add(new Coordinate(-1.041676322221863,-79.48019540185462));
        list.add(new Coordinate(-1.041487621566645,-79.48068880628136));
        list.add(new Coordinate(-1.041085744446892,-79.48194928904694));
        list.add(new Coordinate(-1.04098509407171,-79.48289763078421));
        list.add(new Coordinate(-1.039404088249735,-79.48523094028859));
        list.add(new Coordinate(-1.037607974449275,-79.48416511584229));
        list.add(new Coordinate(-1.035859511916328,-79.4794173340713));
        list.add(new Coordinate(-1.036712438436393,-79.47801178902067));
        list.add(new Coordinate(-1.033131899273604,-79.47566777914237));
        list.add(new Coordinate(-1.03051389163244,-79.47550516457989));
        list.add(new Coordinate(-1.026657506958186,-79.47864851863896));
        list.add(new Coordinate(-1.020631562123617,-79.47841228323676));
        list.add(new Coordinate(-1.019572460052865,-79.47326702160986));
        list.add(new Coordinate(-1.01835084927263,-79.47047644269802));
        list.add(new Coordinate(-1.019149702289897,-79.46946894080293));
        list.add(new Coordinate(-1.019220696897267,-79.46914193432875));
        list.add(new Coordinate(-1.019866064766345,-79.46840320168357));
        list.add(new Coordinate(-1.02029554725803,-79.46811097573949));
        list.add(new Coordinate(-1.020980156069032,-79.46790352737537));
        list.add(new Coordinate(-1.02193839827889,-79.46415977627719));
        list.add(new Coordinate(-1.029936928047192,-79.46543246448532));
        list.add(new Coordinate(-1.048211545368416,-79.46452427501281));
        return list;
    }

    public static PolygonOptions getQuevedoZona2Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getQuevedoZona2().size()>0) {
            for (Coordinate c : getQuevedoZona2()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getQuevedoZona3() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-1.041481193079324,0  -79.46487285457648));
        list.add(new Coordinate(-1.041931175536471,0 -79.45778646826051));
        list.add(new Coordinate(-1.043660967381362,0 -79.4559014123892));
        list.add(new Coordinate(-1.043716544017832,0 -79.45467554349578));
        list.add(new Coordinate(-1.041750831589142,0 -79.45396015437262));
        list.add(new Coordinate(-1.033841483983594,0 -79.44844079972926));
        list.add(new Coordinate(-1.03425757141362,0 -79.44610086567035));
        list.add(new Coordinate(-1.026727543339967,0 -79.4417312445339));
        list.add(new Coordinate(-1.025925758027807,0 -79.43815278950414));
        list.add(new Coordinate(-1.020813679233722,0 -79.43910370949197));
        list.add(new Coordinate(-1.023315439410308,0 -79.44384008807106));
        list.add(new Coordinate(-1.022136184224572,0 -79.4480165163465));
        list.add(new Coordinate(-1.018290705042011,0 -79.44359970235108));
        list.add(new Coordinate(-1.014073505987428,0 -79.44546646668978));
        list.add(new Coordinate(-1.01549447253774,0 -79.44011812310824));
        list.add(new Coordinate(-1.004110864732145,0 -79.43764696828717));
        list.add(new Coordinate(-0.997463216837764,0 -79.44024747985463));
        list.add(new Coordinate(-0.9985077242938699,0 -79.44743403170877));
        list.add(new Coordinate(-1.012028593878099,0 -79.44737030492237));
        list.add(new Coordinate(-1.013973298560795,0 -79.44925614677158));
        list.add(new Coordinate(-1.015428511724195,0 -79.45138747056653));
        list.add(new Coordinate(-1.0122671901251,0 -79.45690949365165));
        list.add(new Coordinate(-1.013087840969638,0 -79.46279244351216));
        list.add(new Coordinate(-1.01710202455595,0 -79.46424472816329));
        list.add(new Coordinate(-1.021940275931517,0 -79.46416012493835));
        list.add(new Coordinate(-1.029933246690065,0 -79.46543232687084));
        list.add(new Coordinate(-1.041481193079324,0 -79.46487285457648));
        return list;
    }

    public static PolygonOptions getQuevedoZona3Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getQuevedoZona3().size()>0) {
            for (Coordinate c : getQuevedoZona3()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static ArrayList<Coordinate> getQuevedoZona4() {
        ArrayList<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(-0.979329814562764,0 -79.47300662873943));
        list.add(new Coordinate(-0.9792719014050654,0 -79.46721061440148));
        list.add(new Coordinate(-0.9818734607944674,0 -79.46670168819786));
        list.add(new Coordinate(-0.9912790415309714,0 -79.46639954524039));
        list.add(new Coordinate(-1.003007691572906,0 -79.467610415534));
        list.add(new Coordinate(-1.003282720684335,0 -79.45542312083784));
        list.add(new Coordinate(-1.006854322206126,0 -79.45539205349303));
        list.add(new Coordinate(-1.013086413029485,0 -79.46278994181692));
        list.add(new Coordinate(-1.017101453162702,0 -79.46424451888143));
        list.add(new Coordinate(-1.021938778118465,0 -79.46416060689673));
        list.add(new Coordinate(-1.02098055974577,0 -79.4679030503147));
        list.add(new Coordinate(-1.020297261494319,0 -79.46810994390366));
        list.add(new Coordinate(-1.019866830321764,0 -79.46840307674486));
        list.add(new Coordinate(-1.019220119241555,0 -79.46914248718952));
        list.add(new Coordinate(-1.019149917423605,0 -79.46946894657198));
        list.add(new Coordinate(-1.018352016782991,0 -79.47047382221487));
        list.add(new Coordinate(-1.014429316657292,0 -79.47399028375615));
        list.add(new Coordinate(-1.013977956726653,0 -79.47675232507919));
        list.add(new Coordinate(-1.007279621771073,0 -79.47936573936309));
        list.add(new Coordinate(-1.005268652214264,0 -79.47550021863549));
        list.add(new Coordinate(-1.00295422400938,0 -79.47919082895115));
        list.add(new Coordinate(-0.999818699405276,0 -79.47825822471067));
        list.add(new Coordinate(-1.003073770480219,0 -79.47347776063344));
        list.add(new Coordinate(-0.9946038922670389,0 -79.47643670630764));
        list.add(new Coordinate(-0.9861964406588926,0 -79.47594333781818));
        list.add(new Coordinate(-0.9846392531655035,0 -79.47238103947602));
        list.add(new Coordinate(-0.979329814562764,0 -79.47300662873943));
        return list;
    }

    public static PolygonOptions getQuevedoZona4Polygon(){
        PolygonOptions rectOptions = new PolygonOptions();
        if (getQuevedoZona4().size()>0) {
            for (Coordinate c : getQuevedoZona4()) {
                rectOptions.add(new LatLng(c.getLatitude(), c.getLongitude()));
            }
        } else {
            rectOptions = null;
        }
        return rectOptions;
    }

    public static PolygonOptions getZonaForPosition(int position) {
        PolygonOptions opt = new PolygonOptions();
        switch (position){
            case 0: {
                opt = null;
                break;
            }
            case 1:{
                opt = getGuayaquilZona1Polygon();
                break;
            }
            case 2:{
                opt = getGuayaquilZona2Polygon();
                break;
            }
            case 3:{
                opt = getGuayaquilZona3Polygon();
                break;
            }
            case 4:{
                opt = getGuayaquilZona4Polygon();
                break;
            }
            case 5:{
                opt = getGuayaquilZona5Polygon();
                break;
            }
            case 6:{
                opt = getGuayaquilZona6Polygon();
                break;
            }
            case 7:{
                opt = getGuayaquilZona7Polygon();
                break;
            }
            case 8:{
                opt = getGuayaquilZona8Polygon();
                break;
            }
            case 9:{
                opt = getGuayaquilZona9Polygon();
                break;
            }
            case 10:{
                opt = getGuayaquilZona10Polygon();
                break;
            }
            case 11:{
                opt = getGuayaquilZona11Polygon();
                break;
            }
            case 12:{
                opt = getGuayaquilZona12Polygon();
                break;
            }
            case 13:{
                opt = getGuayaquilZona13Polygon();
                break;
            }
            case 14:{
                opt = getGuayaquilZona14Polygon();
                break;
            }
            case 15:{
                opt = getGuayaquilZona15Polygon();
                break;
            }
            case 16:{
                opt = getGuayaquilZona16Polygon();
                break;
            }
            case 17:{
                opt = getGuayaquilZona17Polygon();
                break;
            }
            case 18:{
                opt = getGuayaquilZona18Polygon();
                break;
            }
            case 19:{
                opt = getGuayaquilZona19Polygon();
                break;
            }
            case 20:{
                opt = getGuayaquilZona20Polygon();
                break;
            }
            case 21:{
                opt = getGuayaquilZona21Polygon();
                break;
            }
            case 22:{
                opt = getGuayaquilZona22Polygon();
                break;
            }
            case 23:{
                opt = getGuayaquilZona23Polygon();
                break;
            }
            case 24:{
                opt = getGuayaquilZona24Polygon();
                break;
            }
            case 25:{
                opt = getGuayaquilZona25Polygon();
                break;
            }
            case 26:{
                opt = getGuayaquilZona26Polygon();
                break;
            }
            case 27:{
                opt = getGuayaquilZona27Polygon();
                break;
            }
            case 28:{
                opt = getGuayaquilZona28Polygon();
                break;
            }
            case 29:{
                opt = getGuayaquilZona29Polygon();
                break;
            }
            case 30:{
                opt = getGuayaquilZona30Polygon();
                break;
            }
            case 31:{
                opt = getGuayaquilZona31Polygon();
                break;
            }
            case 32:{
                opt = getGuayaquilZona32Polygon();
                break;
            }
            case 33:{
                opt = getGuayaquilZona33Polygon();
                break;
            }
            case 34:{
                opt = getGuayaquilZona34Polygon();
                break;
            }
            case 35:{
                opt = getGuayaquilZona35Polygon();
                break;
            }
            case 36:{
                opt = getGuayaquilZona36Polygon();
                break;
            }
            case 37:{
                opt = getGuayaquilZona37Polygon();
                break;
            }
            case 38:{
                opt = getGuayaquilZona38Polygon();
                break;
            }
            case 39:{
                opt = getGuayaquilZona39Polygon();
                break;
            }
            case 40:{
                opt = getMachalaZona4Polygon();
                break;
            }
            case 41:{
                opt = getMachalaZona7Polygon();
                break;
            }
            case 42:{
                opt = getDuranZona1Polygon();
                break;
            }
            case 43:{
                opt = getDuranZona2Polygon();
                break;
            }
            case 44:{
                opt = getDuranZona5Polygon();
                break;
            }
            case 45:{
                opt = getDuranZona6Polygon();
                break;
            }
            case 46:{
                opt = getSantaRosaZona1Polygon();
                break;
            }
            case 47:{
                opt = getSantaRosaZona2Polygon();
                break;
            }
            case 48:{
                opt = getNobolPolygon();
                break;
            }
            case 49:{
                opt = getNaranjitoPolygon();
                break;
            }
            case 50:{
                opt = getYaguachiPolygon();
                break;
            }
            case 51:{
                opt = getElIngenioPolygon();
                break;
            }
            case 52:{
                opt = getLaIberiaPolygon();
                break;
            }
            case 53:{
                opt = getLaVictoriaPolygon();
                break;
            }
            case 54:{
                opt = getGuarandaZona1Polygon();
                break;
            }
            case 55:{
                opt = getGuarandaZona2Polygon();
                break;
            }
            case 56:{
                opt = getGuayaquilNuevaZona19Polygon();
                break;
            }
            case 57:{
                opt = getQuevedoZona1Polygon();
                break;
            }
            case 58:{
                opt = getQuevedoZona2Polygon();
                break;
            }
            case 59:{
                opt = getQuevedoZona3Polygon();
                break;
            }
            case 60:{
                opt = getQuevedoZona4Polygon();
                break;
            }
            default:{
                opt = null;
                break;
            }
        }
        return opt;
    }

    private static class Coordinate {
        private double latitude;
        private double longitude;

        public Coordinate(double lat, double lon){
            latitude = lat;
            longitude = lon;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double lat) {
            latitude = lat;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double lon) {
            longitude = lon;
        }
    }
}


package com.na_rahat.football_videos;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){



		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//1==========================================================================

		addVideoItem("aI3CDaY9H_E", "Pele the Brazilian Legend || The King of Football", "Edson Arantes do Nascimento born 23 October 1940), known as Pelé , is a retired Brazilian legend professional footballer who played as a forward.");

		addVideoItem("WXg8P0u9W9I", "Pele -Top 10 Impossible Goals in the world", "Pele -Top 10 Impossible Goals in the world");

		addVideoItem("3iD4-udNZj8", " Film Pele Birth of a Legend (2016) Full Movie Explained In Bangla", "Watch in this Film Pele Birth of a Legend (2016)");

		addVideoItem("sYokNMEgRvw", "Pele ● He did it 50 years ago ● ", "Watch in this video the legendary Pele  ● He did it 50 years ago ●");

		addVideoItem("WJ5sgKiZDYI", "Pele - When Football Becomes legend", "Watch in this video the Pele - When Football Becomes legend");

		addVideoItem("ioA0DwrriWM", "legend Pele's • Best Goals Skills.", "Pele  Edson Arantes do Nascimento or simply the King. The main player of the History of Brazilian Soccer.");

		addVideoItem("rD0030YClQQ", "legend Pele's ● Highlights ●The Best Goals & Skills of the King", "legend Pele's ● Highlights ●The Best Goals & Skills of the King");

		addVideoItem("prSYaKD1s4w", "10 legend Pele Goals That SHOCKED The World.", "Watch in this video the legendary and unforgettable goals of Pele, the king of soccer.");

		addVideoItem("vSpofyhs0P8", "legendary Pele Did It First.", "Watch in this video the legendary Pele Did It First.");

		addVideoItem("dSfyq18yGHA", "Why PELE  was called the king of football", "Watch in this video Why PELE was called the king of football");

		createPlayList("Pele", R.drawable.pele);

		//==========================================================================

		//2==========================================================================
		addVideoItem("3qquQqWGLJY", "Diego Maradona best Goals That SHOCKED The World", "Watch this video of the legendary and unforgettable goals of Diego Maradona, one of the best players of all time in football.");
		addVideoItem("PNsRIn_eg4E", "Legendary Moments by Diego Maradona boss", "Watch in this video the best plays and goals of Diego Maradona");
		addVideoItem("J5-9vSfxrdQ", "Diego Maradona - The Legend -best Skills", "Diego Maradona - The Legend -best Skills");
		addVideoItem("K0wOP-hWIUs", "Why Diego Maradona is the Number 1", "Why Diego Maradona is the Number 1 - best skills");
		addVideoItem("9nrPo3aIqAs", "Old Diego Maradona Has More Skills Than Today's", "Old Diego Maradona Has More Skills Than Today's");
		addVideoItem("aAIWk3FdkM4", "Most Humiliating Skills and goals By Diego Maradona", "Most Humiliating Skills and goals By Diego Maradona");
		addVideoItem("i9BANg9Q-K0", " Legend Maradona - Best Goals and Skills (1981-1997)", "Legend Maradona - Best Goals and Skills (1981-1997)");
		addVideoItem("_ipl1mInKbY", "Maradona Best Goals and Skills", "Maradona Best Goals and Skills");
		addVideoItem("Pjzj_2AMAPg", "Diego Maradona - World Cup Semi Final 1990", "Diego Maradona - World Cup Semi Final 1990");
		createPlayList("Maradona", R.drawable.maradona);
		//==========================================================================


		//3==========================================================================
		addVideoItem("dEKKXhBgBZQ", "Stylish player David Beckham ● Skills and Goals ● Fantastic Midfielder", "Watch in this video the Stylish player David Beckham ● Skills and Goals ● Fantastic Midfielder");

		addVideoItem("jce3PzGPPMo", "Top David Beckham Dribbling, Skills and Unreal Passes", "Watch in this video the Top David Beckham Dribbling, Skills and Unreal Passes");

		addVideoItem("S26n2wvsuC0", "Stylish player David Beckham ● The King of Crossing ● Skills and Goals", "Watch in this video the Stylish player David Beckham ● The King of Crossing ● Skills and Goals");

		addVideoItem("uQvJPBcIvOc", "David Beckham || Impossible Skills & Goals", "Thank you for watching David Beckham Impossible Skills & Goals");

		addVideoItem("03uJX606Uz4", "SKILL AND STYLISH PLAYER  DAVID BECKHAM ", "Watch in this video the SKILL AND STYLISH PLAYER  DAVID BECKHAM");

		addVideoItem("sDR-wpIxdx8", "No Current Midfielder Is Close to David Beckham", "Free Kicks, skill, Long shots, Dribbling... Beckham has it all!");

		addVideoItem("1uOGtz2JUoA", "David Beckham moments of Genius", "Some people still think David Beckham is overrated...");

		addVideoItem("IFRygBxmCZA", "Stylish player David Beckham's best England goals || Top Five.", "To celebrate David Beckham’s 40th birthday, we've put together five of his best goals in an England shirt.");

		addVideoItem("QdHLv2nS6yE", "David Beckham ● best Skills & Goals Ever", "Watch in this video the Stylish player David Beckham ● best Skills & Goals Ever");

		addVideoItem("sXC54ju1Xo0", "The Stylish Player David Beckham All 60 Goals & Assists For Real Madrid", "David Beckham All 60 Goals & Assists for Real Madrid in domestic competitions 2003-2007\n");


		createPlayList("Beckham", R.drawable.beckham);
		//==========================================================================


		//4==========================================================================
		addVideoItem("p693u53Q10U", "Lionel Messi - best goals in the world", "▷ Lionel Messi - King Of Football ● Amazing Dribbling");

		addVideoItem("sjMofjmzQKU", "20 Lionel Messi Dribbles That Shocked The World ", "Watch in this video the 20 Lionel Messi Dribbles That Shocked The World");

		addVideoItem("5twveLmWhvI", "10 Impossible Goals Scored By Lionel Messi ", "Watch in this video the 10 Impossible Goals Scored By Lionel Messi ");

		addVideoItem("XzXvBoI-w9s", "Lionel Messi - best Goals That SHOCKED The World", "Watch in this video the Lionel Messi - best Goals That SHOCKED The World");

		addVideoItem("PMZy53PHbY0", "TOP 25 GOALS LEGEND Lionel Messi LaLiga Santander ", "Run, dribble, shoot and score. He does it all! Do not miss the best solo goals of the Argentine star with FC Barcelona in LaLiga Santander.");

		addVideoItem("V1SJGmgX67A", "legend Lionel Messi - The Best of All Time", "Watch in this video the legend Lionel Messi - The Best of All Time");

		addVideoItem("McQEy_BtAxg", "Lionel Messi 2022-23 || Magical Goals, Skills & Assists", "Best goals, skills, dribbling, assists, playmaking, passing, tricks, free kicks of Leo Messi.");

		addVideoItem("twOMe6o1eLU", "Lionel Messi ● 20 LEGENDARY Goals", "Lionel Messi Best Goals Ever || Literally The Greatest Solo Goals Ever Scored in Football History");

		addVideoItem("n5GvmyLJeLg", "17 Impossible Things Only Messi Can Do this", "Watch in this video the 17 Impossible Things Only Messi Can Do this");

		addVideoItem("KV06YZjqL08", "Lionel Messi 2022/2023 - Beautiful Dribbling Skills, Goals & Assists ", "This Video is About Lionel Messi 2022/2023 Skills, Goals, Assists, Dribbling, Ball Control, Playmaking, Attacking, Passing & Speed.");

		addVideoItem("YrmC5l-0RJM", "Legend Lionel Messi ● Crazy Dribbling Skills ● 2014/2015 ", "Watch in this video the Leo Messi Amazing Dribbling, Skills & Tricks 2014 - 2015");

		addVideoItem("amyNZXsnsFA", "LEGENDARY Moments By Lionel Messi", "Watch in this video the LEGENDARY Moments By Lionel Messi");

		createPlayList("Messi", R.drawable.messi);
		//==========================================================================


		//5==========================================================================
		addVideoItem("bdPvE4QpgqM", "Cristiano Ronaldo - The Master Of Skills And Goals", "Watch in this video the Cristiano Ronaldo - The Master Of Skills And Goals");

		addVideoItem("HvQ1WrN6AP4", "Cristiano Ronaldo Top 10 Mind Blind Goals In The World ", "Watch in this video the Cristiano Ronaldo Top 10 Mind Blind Goals In The World");

		addVideoItem("CIIYLcMhyUU", "Cristiano Ronaldo ●King Of Dribbling Skills● ", "Watch in this video the Cristiano Ronaldo ●King Of Dribbling Skills●");

		addVideoItem("2gA4hohc1Bw", "Cristiano Ronaldo master of the head goals ", "Watch in this video the Cristiano Ronaldo master of the head goals ");

		addVideoItem("toHPXbnRE3A", "Cristiano Ronaldo LEGENDARY Goals ", "Watch in this video the Cristiano Ronaldo LEGENDARY Goals");

		addVideoItem("Yq7Yy8H5J-8", " Cristiano Ronaldo Master of the Skill", "Watch in this video the Cristiano Ronaldo Master of the Skill");

		addVideoItem("XWWM4jycABI", "LEGENDARY Moments By Cristiano Ronaldo", "Watch in this video the LEGENDARY Moments By Cristiano Ronaldo");

		addVideoItem("bGjlfEgFJLc", "legend Cristiano Ronaldo The Most Power Shots", "Watch in this video the  legend Cristiano Ronaldo The Most Power Shots");

		addVideoItem("bGChYWxgHP8", "Fascinated by the legendary Cristiano Ronaldo's football game.", "Watch in this video the Fascinated by the legendary Cristiano Ronaldo's football game.");

		addVideoItem("3qOfhuzfCqA", "Cristiano Ronaldo Impossible Goal In the World ", "Watch in this video the Cristiano Ronaldo Impossible Goal In the World");

		addVideoItem("uvwTFUeqMBQ", "Cristiano Ronaldo - Inspiration for us", "Cristiano Ronaldo - Inspiration for us");

		addVideoItem("t00j8NDH6gU", "ToP 10 Goals By Cristiano Ronaldo That Shocked The Whole World", " Watch in this video the ToP 10 Goals By Cristiano Ronaldo That Shocked The Whole World");

		createPlayList("Cristiano", R.drawable.cristiano);
		//==========================================================================

//6==========================================================================

		addVideoItem("OWOjRdmpM6I", "Neymar Jr - The Master Of Penalty", "Some of Neymar's best penalties in high quality. Including moments against great goalkeepers");

		addVideoItem("BXPc1x4lBDE", " Neymar Jr ● best Skills & Goals ", "Neymar Jr Abusing his power of skills and destroying famous players in Brazil.");

		addVideoItem("tV6076aT_l0", "Best Neymar Jr Goals That Shocked The World", "Watch in this video the Best Neymar Jr Goals That Shocked The World");

		addVideoItem("i11k5_6sN0E", "Neymar Skills ● Crazy Skills & Goals", "Watch in this video the Neymar Skills ● Crazy Skills & Goals");

		addVideoItem("DpVrn9HdMwc", "LEGENDARY Moments By Neymar Jr", "Watch in this video the LEGENDARY Moments By Neymar Jr");

		addVideoItem("0ygZg54y0wE", "Legend Neymar Jr Epic Moments that Destroyed Famous players", "In this video you'll be able to see Neymar jr destroying great players and ending their careers and in return they get angry. You can see what happens if you make neymar jr angry . ");

		addVideoItem("oJumRWQf0EU", "Fascinated by the legendary Neymar's  football game ", "In this video you can see  performances that made the whole world admire Neymar jr because of ");

		addVideoItem("hKb8VMPv_3Y", "Neymar JR mind blind Skills", "Watch in this video the Neymar JR mind blind Skills");

		addVideoItem("zz00ZE6YbkI", " Neymar JR Impossible Goal In the World", "Watch in this video the Neymar JR Impossible Goal In the World");

		addVideoItem("Mhs-ctRTlEY", "Neymar JR ● Crazy Dribbling Skills ● ", "Watch in this video the Neymar JR ● Crazy Dribbling Skills ●");

		createPlayList("Neymar Jr", R.drawable.nymer);
		//==========================================================================

//7==========================================================================
		addVideoItem("S84vy_Zz2O0", "LEGENDARY Moments By Ronaldo Phenomenon", "Watch in this video the LEGENDARY Moments By Ronaldo Phenomenon");

		addVideoItem("H6aeMMZ_rJQ", "Ronaldo Phenomenon ●King Of Dribbling Skills●", "Watch in this video the Ronaldo Phenomenon ●King Of Dribbling Skills●");

		addVideoItem("phtQaPqhIjA", "Ronaldo Phenomenon Top 20 Crazy Goals and Super Skills", "Watch in this video the Ronaldo Phenomenon Top 20 Crazy Goals and Super Skills");

		addVideoItem("291v2KT63GQ", "legend Ronaldo Phenomenon Goals That SHOCKED The World.", "Watch in this video the Ronaldo Phenomenon Goals That SHOCKED The World");

		addVideoItem("Wmg2fcQhNPM", "Ronaldo Nazario● Best Goals & Skills Ever ● 1993-2011", "Watch in this video the Ronaldo Nazario● Best Goals & Skills Ever ● 1993-2011");

		addVideoItem("yy7a0ea1W1Q", "Ronaldo Nazario - The Master Of dribbling Skill ", "Watch in this video the Ronaldo Nazario - The Master Of dribbling Skill");

		addVideoItem("d5FCrYZSzlo", "Ronaldo Phenomenon (Best of all time).", "Watch in this video the Ronaldo Phenomenon (Best of all time).");

		addVideoItem("c7fRpMgzzGc", "Ronaldo Phenomenon ●King Of Dribbling Skills● ", "Watch in this video the Ronaldo Phenomenon ●King Of Dribbling Skills● ");

		addVideoItem("hNHIWg7spyM", "Ronaldo Was Insanely Fast", "Watch in this video the Ronaldo Was Insanely Fast");

		addVideoItem("P7f2k6icJ-M", "Ronaldo El Fenomeno ● Best Skills & Goals Ever", "Watch in this video the Ronaldo Phenomenon ● Best Skills & Goals Ever");

		createPlayList("Ronaldo", R.drawable.ronaldo);
		//==========================================================================

		//8==========================================================================
		addVideoItem("ntKeSghZyag", "Ronaldinho is the only one Football's Greatest Entertainment", "Watch in this video the Ronaldinho is the only one Football's Greatest Entertainment");

		addVideoItem("PbdeHoDJZIE", "Ronaldinho Goals That Shocked in The World", "Watch in this video the Ronaldinho Goals That Shocked in The World ");

		addVideoItem("meczWdaZxro", "Legendary Moments Ronaldinho  Impossible to Forget", " Featuring his best skills, dribbling, tricks, passes, goals and much more for Barcelona. ");

		addVideoItem("AJn1eGWRyqI", "LEGENDARY Moments By Ronaldinho ", "Watch in this video the LEGENDARY Moments By Ronaldinho ");

		addVideoItem("rAm-iBZ17PQ", " Legend Ronaldinho ● Impossible To Forget ", "Watch in this video the Legend Ronaldinho ● Impossible To Forget");

		addVideoItem("UFZefq3fAAA", "Ronaldinho is the only player who has no haters", "Watch in this video the Ronaldinho is the only player who has no haters");

		addVideoItem("297agtgoaBc", "Ronaldinho ●King Of Dribbling Skills● ", "Watch in this video the Ronaldinho ●King Of Dribbling Skills●");

		addVideoItem("V5Ooyml9vto", "Ronaldinho Impossible Goal In the World", "Watch in this video the Ronaldinho Impossible Goal In the World");

		addVideoItem("U6Mpx3dSjuk", "Legend Ronaldinho - When Football Becomes Art", "Watch in this video the Ronaldinho - When Football Becomes Art Best Goals, Skills, Dribbles, Dribbling, Passes, Assists, Amazing");

		addVideoItem("-_82UBKYsb4", "Young Ronaldinho's Ridiculous tricks that no one expected! ", "Watch in this video the Young Ronaldinho's Ridiculous tricks that no one expected! ");

		createPlayList("Ronaldinho", R.drawable.ronaldinho);
		//==========================================================================


		//9==========================================================================
		addVideoItem("D5ue1K9_7rg", "Legend Ricardo Kaka Best Goals and Skills", "Watch in this video the Legend Ricardo Kaka Best Goals and Skills");

		addVideoItem("xSdR7-8hBEU", "RICARDO KAKA In  The Unstoppable Player (2003-2009) ", "Watch in this video the RICARDO KAKA In  The Unstoppable Player (2003-2009)");

		addVideoItem("Bey7g-Fi_YU", "10 Times That Legend Kaká Made The Whole World Admire Him", "Watch in this video the 10 Times That Legend Kaká Made The Whole World Admire Him");

		addVideoItem("5iJRKICxKFc", "Kaká ● Magical Skills & Goals ", "Watch in this video the Kaká ● Magical Skills & Goals ");

		addVideoItem("gtJ82e45pCc", "The Fastest Footballer In History⚡Ricardo Kaká Dribbling, Insane Speed, Sprints ", "Watch in this video the The Fastest Footballer In History⚡Ricardo Kaká Dribbling, Insane Speed, Sprints ");

		addVideoItem("11Z62wlXzos", "Ricardo Kaká - ●King Of Dribbling Runs, Skills & Goals & Assists● ", "Watch in this video the Ricardo Kaká - ●King Of Dribbling Runs, Skills & Goals & Assists●");

		addVideoItem("dUAovj4XeBU", "LEGENDARY Moments By Ricardo Kaká", "Watch in this video the LEGENDARY Moments By Ricardo Kaká");

		addVideoItem("yi4iWU6MisU", "Ricardo Kaka  Impossible Goal In the World ", "Watch in this video the Ricardo Kaka  Impossible Goal In the World");

		addVideoItem("G1seVZULWdM", "Legend Ricardo Kaka - Our Story", "Watch in this video the Legend Ricardo Kaka - Our Story");

		addVideoItem("I0BDsr6Ax6Q", "Legendary Goals in Ricardo Kaka ", "Watch in this video the Legendary Goals in Ricardo Kaka");

		createPlayList("Kaka", R.drawable.kaka);
		//==========================================================================


		//10==========================================================================
		addVideoItem("Tpgv_5JFJNQ", "Legend Gabriel Batistuta ● One of the best Strike", "Watch in this video the Legend Gabriel Batistuta ● One of the best Strike");

		addVideoItem("GYGxua-HUGM", "Gabriel Batistuta Impossible Goal In the World", "Watch in this video the For me, he's the best striker I've ever seen.");

		addVideoItem("-UAfAGBW9b0", "Legendary Goals in Gabriel Batistuta", "Watch in this video the Legendary Goals in Gabriel Batistuta");

		addVideoItem("r9y8ejrjgGQ", "Gabriel Batistuta Goals That Shocked in The World", "Watch in this video the Gabriel Batistuta Goals That Shocked in The World");

		addVideoItem("PHwjFDY5z0o", "LEGENDARY Moments By Gabriel Batistuta", "Watch in this video the LEGENDARY Moments By Gabriel Batistuta");

		addVideoItem("x5TcEZXuHb4", "Gabriel Batistuta Best Power Shots", "Watch in this video the Gabriel Batistuta Best Power Shots");

		addVideoItem("z-ki898ASJs", "Gabriel Batistuta ●King Of Strike and Power Shots ●", "Watch in this video the Gabriel Batistuta ●King Of Strike and Power Shots");

		addVideoItem("AO26JMeKey0", "Legend Gabriel Batistuta ToP 50 Goals", "Watch in this video the Legend Gabriel Batistuta ToP 50 Goals");

		addVideoItem("hTv7IZxMT1s", "Gabriel Batistuta Best Skills & Goals", "Watch in this video the Gabriel Batistuta Best Skills & Goals");

		addVideoItem("QprZWuheSLQ", "Golden Goal in Gabriel Batistuta", "Watch in this video the Golden Goal in Gabriel Batistuta");

		createPlayList("Batistuta", R.drawable.batistuta);
		//==========================================================================

//11==========================================================================
		addVideoItem("f44IQb5Igtc", "No One Has Matched Zidane's Elegance So Far", "Watch in this video the No One Has Matched Zidane's Elegance So Far");

		addVideoItem("PLcusosjNtU", "legend  Zinedine Zidane - When Football Becomes Art", "Watch in this video the legend  Zinedine Zidane - When Football Becomes Art");

		addVideoItem("5JofJ7g729A", "Legendary Moments by Zinedine Zidane", "Watch in this video the Legendary Moments by Zinedine Zidane");

		addVideoItem("ZGUpqd3vFVU", "Legendary ToP 10 Goals in Zinedine Zidane ", "Watch in this video the Legendary ToP 10 Goals in Zinedine Zidane ");

		addVideoItem("OiTFGLkmIN4", "10 Impossible Legendary Things That Only Zidane Did In Football", "Watch in this video the 10 Impossible Legendary Things That Only Zidane Did In Football");

		addVideoItem("5vjtsTmzP8Y", "Legend Zidane - The Greatest Magician in Football ● Dribbling Skills amazing", "Watch in this video the Legend Zidane - The Greatest Magician in Football ● Dribbling Skills amazing");

		addVideoItem("A4p1ooFCOqg", "Zidane best Goals That SHOCKED The World", "Watch in this video the Zidane best Goals That SHOCKED The World");

		addVideoItem("aRiwK7Xddr0", "Zinedine Zidane Best Powerful Shots", "Watch in this video the Zinedine Zidane Best Powerful Shots");

		addVideoItem("3i2LfP4PlNo", "Zinedine Zidane Top 15 Crazy Goals", "Watch in this video the Zinedine Zidane Top 15 Crazy Goals");

		addVideoItem("AgKVx0dWCjk", "Zinedine Zidane ● Magisterial Skills", "Watch in this video the Zinedine Zidane ● Magisterial Skills");

		createPlayList("Zidane", R.drawable.zidane);
		//==========================================================================

		//12==========================================================================

		addVideoItem("-gYGFDi8NKs", "Karim Benzema Ballon d'Or Season", "Watch in this video the Karim Benzema Ballon d'Or Season");

		addVideoItem("o4ZQMqj-QVY", "Karim Benzema - When Football Becomes legend", "Karim Benzema - When Football Becomes legend");

		addVideoItem("S0Xd1IShdbI", "Legendary Moments by Karim Benzema", "Legendary Moments by Karim Benzem");

		addVideoItem("FWazbb_nfWM", "Karim BENZEMA'S Legendary  Goals Real Madrid", "Karim BENZEMA'S Legendary  Goals Real Madrid");

		addVideoItem("DYkh3MjIx4k", "Karim BENZEMA All goals La Liga Santander", "Karim BENZEMA All goals La Liga Santander");

		addVideoItem("ol_26r3Jlv0", "Karim Benzema is UNSTOPPABLE GOAlS", "Watch in this video the Karim Benzema is UNSTOPPABLE GOAlS");

		addVideoItem("uc2_2bxe9EI", "Legendary Moments by Karim Benzema", "Watch in this video the Legendary Moments by Karim Benzema");

		addVideoItem("uSIEQ-cJq5g", "Karim Benzema TOP 50 LEGENDARY Goals", "Watch in this video the Karim Benzema TOP 50 LEGENDARY Goals");

		addVideoItem("ByKkLu4PUQk", "Karim Benzema 2022 ► Ballon d'Or - Amazing Skills, Best Goals  ", "Amazing Skills, Best Goals & Assists ");

		addVideoItem("f_X1aWoehno", "Karim Benzema Best Skills & Goals", "Karim Benzema Best Skills & Goals");

		createPlayList("Benzema", R.drawable.benzema);
		//==========================================================================

		//13==========================================================================
		addVideoItem("omlWuLD5SXk", "Kylian Mbappe 2022 - Magical Skills, Goals & Assists", "Watch in this video the  Kylian Mbappé 2022 - Magical Skills, Goals & Assists");

		addVideoItem("tWj_Y4QBMk8", "When Kylian Mbappe Hits TOP SPEED", "Watch in this video the When Kylian Mbappe Hits TOP SPEED");

		addVideoItem("hTOl6_8nCsI", "Kylian Mbappe ●King Of the  TOP SPEED ●", "Watch in this video the Karim Benzema ●King Of the TOP SPEED ●");

		addVideoItem("gUx4KQi40M0", "Kylian Mbappe's 30 legendary goals", "Watch in this video the Kylian Mbappe's 30 legendary goals");

		addVideoItem("GwHwcqLAUaw", "10 Times Kylian Mbappe Shocked The World", "Watch in this video the 10 Times Kylian Mbappe Shocked The World");

		addVideoItem("GBD5DXivOY4", "Kylian Mbappe Legendary MOMENTS", "Watch in this video the Kylian Mbappe Legendary MOMENTS");

		addVideoItem("gBH9wLoC36Q", "Mbappe 2021/22 - Speed Show , Skills & Goals", "Watch in this video the Mbappe 2021/22 - Speed Show , Skills & Goals");

		addVideoItem("0rrKcQGSrbk", "Kylian Mbappe One of The Best Goals", "Watch in this video the Kylian Mbappe One of The Best Goals");

		addVideoItem("79FHkwzgCtE", "Kylian Mbappe - 30+ Crazy Fast Runs/Sprints Will Make You Say WOW ", "Watch in this video the Kylian Mbappe - 30+ Crazy Fast Runs/Sprints Will Make You Say WOW ");

		addVideoItem("Uubu-iXGx9Y", "Kylian Mbappe is INCREDIBLE GOALS in 2021", "Watch in this video the Kylian Mbappe is INCREDIBLE GOALS in 2021");

		createPlayList("Mbappe", R.drawable.mbappe);
		//==========================================================================


		//14==========================================================================
		addVideoItem("pPJNkY7Tpxs", "Mohamed Salah is Unstoppable Goals", "Watch in this video the Mohamed Salah is Unstoppable Goals");

		addVideoItem("UStCZ9kNies", "Mohamed Salah Legendary Goals IMPOSSIBLE To Forget", "Mohamed Salah Legendary Goals IMPOSSIBLE To Forget");

		addVideoItem("U0gE24EErTg", "Mohamed Salah All Legendary 175 Goals For Liverpool So Far ", " Mohamed Salah All Legendary 175 Goals For Liverpool So Far ");

		addVideoItem("TmQD-V9X_W8", "Mohamed Salah 2023 – Speed Show, Skills & Goals", "Mohamed Salah 2023 – Speed Show, Skills & Goals");

		addVideoItem("RIOcO3-5uME", "Mohamed Salah the best Goals", "Watch in this video the Mohamed Salah the best Goals");

		addVideoItem("FtnT9Xl2iBg", "Mohamed Salah Best Dribbling ", "Watch in this video the Mohamed Salah Best Dribbling ");

		addVideoItem("A1wu3MVAnKs", "Mohamed Salah is World Class", " Mohamed Salah is World Class");

		addVideoItem("mJsTa0xSFbE", "Mohamed Salah  BEST - Skills, Assist & LEGENDARY Goals ", "Mohamed Salah  BEST - Skills, Assist & LEGENDARY Goals ");

		addVideoItem("JBpas_FAYXU", "Mohamed Salah is UNSTOPPABLE in 2022 ● Skills,Goals & Passes", "Mohamed Salah is UNSTOPPABLE in 2022 ● Skills, Goals & Passes");

		addVideoItem("dLqSEEI3oZE", "history Egypt vs Congo | Qualifying for the 2018 World Cup (Mohamed Salah)", "The toughest 7 minutes in Egyptian football history Egypt vs Congo Qualifying for the 2018 World Cup (Mohamed Salah)");

		createPlayList("Salah", R.drawable.salah);
		//==========================================================================


		//15==========================================================================
		addVideoItem("89MeYMpRm3o", "Sergio Kun Agüero - THE PERFECT STRIKER - Best Goals",  "WHAT A STRIKER! The Best Goals Of Sergio Kun Aguero At Manchester City ");

		addVideoItem("Pq_i5yzIZa0", "SERGIO AGUERO | RAINING GOALS", "SERGIO AGUERO | RAINING GOALS | EVERY PREMIER LEAGUE GOAL SCORED | MAN CITY");

		addVideoItem("ooYwlAWmsvU", "Sergio Agüero 2018-19 | Amazing Goals & Skills", "Sergio Aguero amazing goals and dribbling skills in season 2018-2019 with Manchester City.");

		addVideoItem("s-XPDRTptJk", "Top 10 Sergio Aguero Premier League Goals", "100 Premier League goals for Sergio, here's 10 of the best from City's star striker!");

		addVideoItem("8P29ZQIJRSU", "Sergio Kun Aguero - All 260 Goals for Manchester City ", "Sergio Kun Aguero scored a total of 260 goals for Manchester City.");

		addVideoItem("xOt9dmkydwM", " Aguerooo !!! Last 10 Mins Manchester City QPR 3-2", "My heart bleeds for everyone who didn't get to experience this live.");

		addVideoItem("nBNvVAJp-B4", "Sergio Aguero All 26 Goals", "Sergio Aguero All 26 Goals 19/20");

		addVideoItem("STPvRNhC5rI", "Sergio Agüero - Complete Forward", "Sergio Agüero Aguero Complete Forward Barcelona Manchester Man City Argentina Highlights Goals Goal Skills Skills Assists Best Top Most vs 2020 2020/21");

		addVideoItem("v--u9aypeY8", "Sergio Aguero • Goodbye Manchester City", "Manchester City officially announced that Sergio Agüero will leave the club at the end of the season.");

		addVideoItem("PnY4FwUbDfA", "Fabulous Manchester City Goals | Aguero", " A compilation of some of the best @Man City goals scored in the Premier League.\n");

		createPlayList("Aguero", R.drawable.aguero1);

		//==========================================================================


//16==========================================================================
		addVideoItem("a1e54af_DV0", "10 Impossible Things That Only Zlatan Ibrahimovic Did In Football ", "Watch in this video the 10 Impossible Things That Only Zlatan Ibrahimovic Did In Football");

		addVideoItem("V2Ki6a1dnRQ", "Zlatan Ibrahimovic - When Football Becomes Legend", "Watch in this video the Zlatan Ibrahimovic - When Football Becomes Legend");

		addVideoItem("34ID1L4w6qk", "Legend Zlatan Ibrahimovic ● Craziest Skills Ever ● Impossible Goals", "Watch in this video the Legend Zlatan Ibrahimovic ● Craziest Skills Ever ● Impossible Goals");

		addVideoItem("5g8oqxneaaM", "Times When Legend Zlatan Ibrahimovic Lose Control", "Watch in this video the 55 Times When Legend Zlatan Ibrahimovic Lose Control");

		addVideoItem("OfS5MI_3_WE", "Zlatan Ibrahimovic - Top 10 Legendary Goals Ever", "Watch in this video the Zlatan Ibrahimovic - Top 10 Legendary Goals Ever");

		addVideoItem("RKsfHCeVsEU", "Legend Zlatan Ibrahimovic crazy moment", "Watch in this video the Legend Zlatan Ibrahimovic crazy moment");

		addVideoItem("ntohaMEcPL0", "LEGENDARY GOALS Zlatan Ibrahimovic", "Watch in this video the LEGENDARY GOALS Zlatan Ibrahimovic");

		addVideoItem("PAzliiJJDFU", "Zlatan Ibrahimovic Amazing Goals & Skills", "Watch in this video the Zlatan Ibrahimovic Amazing Goals & Skills");

		addVideoItem("Buzt25cItBM", "Zlatan Ibrahimovic funny moment", "Watch in this video the Zlatan Ibrahimovic funny moment");

		addVideoItem("GmSDE2lZ-4U", "Sergio Ramos vs Zlatan Ibrahimovic Crazy Fights", "Sergio Ramos vs Zlatan Ibrahimovic Crazy Fights ● Fouls,Yellow and Red cards & Bad Boy moments");

		createPlayList("Zalatan", R.drawable.zalatan);
		//==========================================================================

		//17==========================================================================
		addVideoItem("_6eJC3JBo7w", "Roberto Carlos Top 15 Overpowered Goals", "Watch in this video the Roberto Carlos Top 15 Overpowered Goals/Legendary 15 Sublime Skills");

		addVideoItem("zSF9KKTMCHs", "Legend Roberto Carlos Was an Absolute Monster", "Watch in this video the Legend Roberto Carlos Was an Absolute Monster");

		addVideoItem("4nIMaOamFeI", "Legend ROBERTO CARLOS was UNSTOPPABLE | SPEED & SKILLS", "Watch in this video the Legend ROBERTO CARLOS was UNSTOPPABLE | SPEED & SKILLS");

		addVideoItem("dMUzrcUhy_Y", "Roberto Carlos Top 10 Legendary  Goals That Shocked The World", "Watch in this video the Roberto Carlos Top 10 Legendary  Goals That Shocked The World");

		addVideoItem("SyD6Tgc-wQg", "The 5 best free kicks in the world", "Watch in this video the The 5 best free kicks in the world");

		addVideoItem("Rir3xUbPxpY", " Roberto Carlos Legendary Goals That Will Impress You", "Watch in this video the  Roberto Carlos Legendary 15 Goals That Will Impress You");

		addVideoItem("fY1ztR1YlCI", "Legend Roberto Carlos ● The Most Complete Left-Back Ever", "Watch in this video the Legend Roberto Carlos ● The Most Complete Left-Back Ever");


		createPlayList("Carlos", R.drawable.carlos);
		//==========================================================================


		//18==========================================================================
		addVideoItem("oLgWGVqWSak", "Legend Iker Casillas Was an Absolute Monster", "Watch in this video the Iker Casillas Was an Absolute Monster");

		addVideoItem("46LqYUzS5cQ", "Legend Iker Casillas ● Fantastic Saves ●", "Watch in this video the Iker Casillas ● Fantastic Saves ●");

		addVideoItem("6bmotkfupjI", " Legend Iker Casillas mind blind Saved", "Watch in this video the Iker Casillas mind blind Saved");

		addVideoItem("FEe-0I1hNdg", "Young Iker Casillas - Sensational Saves Real Madrid", "Watch in this video the Young Iker Casillas - Sensational Saves Real Madrid");

		addVideoItem("sU0qmGSiVN8", "Legend Iker Casillas | Best Saves in the history Best Saves Ever", "Watch in this video the Iker Casillas | Best Saves in the history Best Saves Ever");

		addVideoItem("dJwsP2c0AHE", "Iker Casillas LEGENDARY 25 SAVES in LaLiga Santander", "Watch in this video the Iker Casillas LEGENDARY 25 SAVES in LaLiga Santander");

		addVideoItem("ap_I-tBBcmY", "Iker Casillas,  Best Saves in the world", "Watch in this video the Iker Casillas,  Best Saves in the world");

		addVideoItem("gmqtAlMWMYs", "Iker Casillas | A True Captain | Ultimate Saves | 2010-14 ", "Watch in this video the Iker Casillas | A True Captain | Ultimate Saves | 2010-14 ");

		addVideoItem("c1GZRWUaSeA", "Iker Casillas is the best goalkeeper of all time", "Watch in this video the Iker Casillas is the best goalkeeper of all time");

		addVideoItem("S3nWvtXQqIM", "The Legend Iker Casillas ● Saves Compilation ● 2018/19", "Watch in this video the The Legend Iker Casillas ● Saves Compilation ● 2018/19");

		createPlayList("Casills", R.drawable.casills);
		//==========================================================================


		//19==========================================================================
		addVideoItem("F8NGWznllzo", "One Of The Best Goalkee Thibaut Courtois LEGENDARY Saves", "Watch in this video the Goalkee Thibaut Courtois LEGENDARY Saves ");

		addVideoItem("NM7EckJ73us", "Thibaut Courtois is UNBEATABLE", "Watch in this video the Thibaut Courtois is UNBEATABLE");

		addVideoItem("zwdTCuzrAyk", "COURTOIS THE BEST GOALKEEPER", "Watch in this video the COURTOIS THE BEST GOALKEEPER");

		addVideoItem("50Usg9HWWOs", "Legend Thibaut Courtois SUPERHUMAN SAVES", "Watch in this video the legend Thibaut Courtois SUPERHUMAN SAVES");

		addVideoItem("RtkSDLu6PUw", "Thibaut Courtois 2022 ● the giant ● Miraculous saves", "Watch in this video the Thibaut Courtois 2022 ● the giant ● Miraculous saves");

		addVideoItem("i9_FFBeSnBc", "impossible save in Thibaut Courtois", "Watch in this video the impossible save in Thibaut Courtois");

		addVideoItem("7Jw_6pmxNQE", "Thibaut Courtois is THE BEST Goalkeeper in the World", "Watch in this video the Thibaut Courtois is THE BEST Goalkeeper in the World");

		addVideoItem("3Fjo_nwFz7Q", "TOP SAVES THIBAUT COURTOIS | REAL MADRID", "Watch in this video the TOP SAVES THIBAUT COURTOIS | REAL MADRID");

		addVideoItem("_joIrRpkbwQ", "The BEST goalkeeping display in a FINAL | Courtois Champions League", "The BEST goalkeeping display in a FINAL | Courtois Champions League");

		addVideoItem("zYw0IknAAXc", "Thibaut Courtois - Best Saves", "Watch in this video the Thibaut Courtois - Best Saves");

		createPlayList("Courtois", R.drawable.courtois);
		//==========================================================================

//20==========================================================================

		addVideoItem("llMHTVxSBcE", "PHILIPPE COUTINHO • Most Amazing Long Shot Goals That Shocked The World", "Watch in this video the PHILIPPE COUTINHO • Most Amazing Long Shot Goals");

		addVideoItem("pERSaD1fHqs", "Philippe Coutinho 2022 - Amazing Skills, Passes, Assists and Goals", "Watch in this video the Philippe Coutinho 2022 - Amazing Skills, Passes, Assists and Goals");

		addVideoItem("3GRUEh7Qn_U", "Philippe Coutinho in his Brilliant Skills", "Watch in this video the Philippe Coutinho in his Brilliant Skills");

		addVideoItem("2ZXu4AM2mkw", "Philippe Coutinho ● Playmaker Genius ● ", "Watch in this video the Philippe Coutinho ● Playmaker Genius ● ");

		addVideoItem("rdlRO_lHykk", "Never Forget the Brilliance of Philippe Coutinho", "Watch in this video the Never Forget the Brilliance of Philippe Coutinho");

		addVideoItem("DgT4y_LWJL8", "Philippe Coutinho ● one of the best  Skills and Goals", "Watch in this video the Philippe Coutinho ● one of the best  Skills and Goals");

		addVideoItem("Q1qOVIfAa9w", "Philippe Coutinho ● Brazilian magician●", "Watch in this video the Philippe Coutinho ● Brazilian magician●");

		addVideoItem("iCLyNFvfjv0", "Philippe Coutinho best Skills and Goals ", "Watch in this video the Philippe Coutinho best Skills and Goals ");

		addVideoItem("uwum5kyUYWM", "Philippe Coutinho - amazin Goals and Skills", "Watch in this video the Philippe Coutinho - amazin Goals and Skills");

		addVideoItem("S4FdtrrHJq0", "Philippe Coutinho -  LEGENDARY 40  Goals", "Watch in this video the Philippe Coutinho -  LEGENDARY 40  Goals");

		createPlayList("Coutinho", R.drawable.coutinho);
		//==========================================================================

		//21==========================================================================
		addVideoItem("PZkvgddZT00", "Johan Cruyff ● Legendary  Skills and Goals", "Watch in this video the Johan Cruyff ● Legendary  Skills and Goals");

		addVideoItem("Vib2uy5cf7M", "Legend Johan Cruyff - The Impossible is Nothing", "Watch in this video the Legend Johan Cruyff - The Impossible is Nothing");

		addVideoItem("vEH_lhJbewQ", "Johan Cruijff- Legendary goals/skills/passing ", "Watch in this video the Johan Cruijff- Legendary goals/skills/passing");

		addVideoItem("Y-BpXEMr6LU", " Legendary Moment by Johan Cruyff• Skills • Goals", "Watch in this video the  Legendary Moment by Johan Cruyff• Skills • Goals");

		addVideoItem("jxkr2BX-vIs", "Johan Cruyff The Best Player of a Genius", "Watch in this video the Johan Cruyff The Best Player of a Genius");

		addVideoItem("YU-k-Ots3iY", "Legend Johan Cruyff  Dribbling Compilation", "Watch in this video the Legend Johan Cruyff  Dribbling Compilation");

		addVideoItem("2abt5xiV1XA", "The Art of the Cruyff Turn", "Watch in this video the The Art of the Cruyff Turn");

		addVideoItem("kIAVTd3jVe8", "Legend Johan Cruyff - Amazing Skills, Passes, Assists and Goals", "Watch in this video the Legend Johan Cruyff - Amazing Skills, Passes, Assists and Goals");

		addVideoItem("GHNhJHo48UA", "Johan Cruyff - Ultimate Skills & Goal", "Watch in this video the Johan Cruyff - Ultimate Skills & Goal");

		createPlayList("Cruyff", R.drawable.cruyff);
		//==========================================================================

		//22==========================================================================
		addVideoItem("i-vCAkL0ch8", "Didier Drogba Best Skills & Goals", " Didier Drogba Best Skills & Goals");

		addVideoItem("ZWYGRehfmR4", "Didier Drogba's 11 Best Champions League Goals", " Didier Drogba's 11 Best Champions League Goals | Chelsea Tops");

		addVideoItem("oAtTg2Fagd8", "Didier Drogba's Five Greatest Goals For The Blues", "Watch in this video the Didier Drogba's Five Greatest Goals For The Blues | The King Of The Bridge");

		addVideoItem("ldd0fC97JSU", "Didier Drogba moment impossible to forget", "Watch in this video the Didier Drogba moment impossible to forget");

		addVideoItem("Qbz1XQhZabA", "Tribute to Didier Drogba Chelsea King ", "Tribute to Didier Drogba Chelsea King 2004/2015");

		addVideoItem("0B7IVqRK5ZU", "Didier Drogba All 160 Goals For Chelsea", "Didier Drogba All 160 Goals For Chelsea 2004-2015");

		createPlayList("Drogba", R.drawable.drogba);
		//==========================================================================

//23==========================================================================
		addVideoItem("xOwxr5PkYgY", "PAULO DYBALA SPECIAL MOMENTS: GOALS AND SKILLS", "Watch in this video the PAULO DYBALA SPECIAL MOMENTS: GOALS AND SKILLS");

		addVideoItem("SvmQepL8giE", "Paulo Dybala Just Plays Beautiful Football", "Watch in this video the Paulo Dybala Just Plays Beautiful Football");

		addVideoItem("ZJBunzFwMfI", "Paulo Dybala - When Football Becomes Art", "Watch in this video the Paulo Dybala - When Football Becomes Art");

		addVideoItem("lgJAQ9Nple4", "Paulo Dybala All 110 Goals For Juventus", "Watch in this video the Paulo Dybala All 110 Goals For Juventus In 2015-2022");

		addVideoItem("BUE684lmYVc", "Paulo Dybala - Dribbling Skills & Goals ", "Watch in this video the Paulo Dybala - Dribbling Skills & Goals ");

		addVideoItem("pRfDf-Ai9W8", "Paulo Dybala Special Dribbling Skills & Goals..", "Watch in this video the Paulo Dybala Special Dribbling Skills & Goals.");

		addVideoItem("7jySe5ygoC4", "Paulo Dybala - Amazing Skills, Goals & Assists", "Watch in this video the Paulo Dybala - Amazing Skills, Goals & Assists");

		addVideoItem("QN9fGS1HC3c", "Paulo Dybala LEGENDARY GOALS", "Watch in this video the Paulo Dybala LEGENDARY GOALS");

		addVideoItem("gDCiVtp9Rig", "NEW lEGEND Paulo Dybala ► Amazing Skills, Goals & Assists", "Watch in this video the NEW lEGEND Paulo Dybala ► Amazing Skills");

		addVideoItem("Hbp_tbaENMU", "Paulo Dybala 2022 - Incredible Skills, Goals & Assists |", "Watch in this video the Paulo Dybala 2022 - Incredible Skills, Goals & Assists |");

		createPlayList("Dybala", R.drawable.dybala);
		//==========================================================================


		//24==========================================================================
		addVideoItem("Y-raI6y7r2Q", "Legend Steven Gerrard ● Ultimate Skills Show 1998–2015", "Watch in this video the Legend Steven Gerrard ● Ultimate Skills Show 1998–2015");

		addVideoItem("cwYTuvEpj7g", "Steven Gerrard LEGENDARY Long Shot Goals", "Watch in this video the Steven Gerrard LEGENDARY Long Shot Goals");

		addVideoItem("aLgTIiT0mc8", "Steven Gerrard GENIUS Assists", "Watch in this video the Steven Gerrard GENIUS Assists");

		addVideoItem("M6tKTmb-TrU", "Gerrard Miraculous Legendary Passes ", "Watch in this video the Gerrard Miraculous Legendary Passes ");

		addVideoItem("Mdx138YafOo", "This is why Gerrard is the Ultimate Midfielder in Football", "Watch in this video the This is why Gerrard is the Ultimate Midfielder in Football");

		addVideoItem("6zQy_O3NoJU", "Steven Gerrard - A Complete legendary Midfielder", "Watch in this video the Steven Gerrard - A Complete legendary Midfielder");

		addVideoItem("62MvIuqdKR8", "Steven Gerrard's Top 10 LEGENDARY Goals", "Watch in this video the Steven Gerrard's Top 10 LEGENDARY Goals");

		addVideoItem("oooXvVIUbPk", "Steven Gerrard ● legendary Midfielder", "Watch in this video the Steven Gerrard ● legendary Midfielder");

		addVideoItem("nSU0OkFYuEE", "Steven Gerrard All Mind Blind  186 Goals", "Watch in this video the Steven Gerrard All Mind Blind  186 Goals");

		createPlayList("Gerrard", R.drawable.gerrard);
		//==========================================================================

//25==========================================================================
		addVideoItem("XVOV9o79U3M", "Erling Haaland becomes fastest player to 20  goals!", "Erling Haaland becomes fastest player to 20  goals!");

		addVideoItem("tE8p4BLtmSY", "10 Times Erling Haaland Shocked The World! ", "10 Times Erling Haaland Shocked The World!");

		addVideoItem("uRnBVpIWIFA", "Erling Haaland Legendary ● Goals & Skills", "Watch in this video the Erling Haaland Legendary ● Goals & Skills");

		addVideoItem("N-A-ZPTVa8A", "Holland special speed", "Watch in this video the Holland special speed");

		addVideoItem("NWCkAqskMow", "Erling Haaland - Special Dribbling Skills & Goals.", "Erling Haaland - Special Dribbling Skills & Goals.");

		addVideoItem("BVdeqO7vV9Q", "Erling Haaland Impossible Goals", "Watch in this video the Erling Haaland Impossible Goals");

		addVideoItem("v4w0As8pBds", "Haaland 99 Strength Moments just a wow", "Haaland 99 Strength Moments just a wow");

		addVideoItem("4LzYePfTPwA", "Erling Haaland Top 20 Goals That Shocked The World", "Erling Haaland Top 20 Goals That Shocked The World");

		addVideoItem("kDSCd_7jAYE", "Don't Try to Stop Haaland", "Watch in this video the Don't Try to Stop Haaland");

		addVideoItem("wyOJ9Fo6Uto", "When Haaland Gets Angry", "Watch in this video the When Haaland Gets Angry");

		createPlayList("Haaland", R.drawable.haaland);
		//==========================================================================

//26==========================================================================
		addVideoItem("XJYNSuRyjIs", "Eden Hazard - Sublime Dribbling Skills & Goals", "Watch in this video the Eden Hazard - Sublime Dribbling Skills & Goals");

		addVideoItem("xkdEGy3wD7g", "Eden Hazard in his Beautiful Prime", "Watch in this video the Eden Hazard in his Beautiful Prime");

		addVideoItem("LaRPbel21Ec", "When Eden Hazard was the Best Player in the World", "Watch in this video the When Eden Hazard was the Best Player in the World");

		addVideoItem("vP9SfbEbOPY", "Eden Hazard - The Legend of Turning", "Watch in this video the Eden Hazard - The Legend of Turning");

		addVideoItem("ay7gLICjvOI", " Won't Forget Eden Hazard at Chelsea", "Watch in this video the  Won't Forget Eden Hazard at Chelsea");

		addVideoItem("tI6voVyl4qs", "Legend Eden Hazard - Ultimate Skill Show", "Watch in this video the Legend Eden Hazard - Ultimate Skill Show");

		addVideoItem("7z2YTytXEjM", "Legend Eden Hazard's foot magic", "Watch in this video the Legend Eden Hazard's foot magic");

		addVideoItem("bjW5yJB40KE", "TOP 10: Eden Hazard Goals", "Watch in this video the TOP 10: Eden Hazard Goals");

		addVideoItem("BjxoME-MT1s", "Eden Hazard - Sublime Dribbling Skills & Goals", "Watch in this video the Eden Hazard - Sublime Dribbling Skills & Goals");

		addVideoItem("PRLYcW3FxAw", "Legend Eden Hazard the best skills ", "Watch in this video the Legend Eden Hazard the best skills");

		createPlayList("Hazard", R.drawable.hazard);
		//==========================================================================

		//27==========================================================================
		addVideoItem("e89F5X0bIxE", "ToP 12 Legendary Goals Thierry Henry Shocked The World", "Watch in this video the ToP 12 Legendary Goals Thierry Henry Shocked The World");

		addVideoItem("jms67PNNMac", "Thierry Henry - When Football Becomes Legend", "Watch in this video the Thierry Henry - When Football Becomes Legend");

		addVideoItem("_jBfu0FHzjU", "Thierry Henry Mind blind Goals", "Watch in this video the Thierry Henry Mind blind Goals");

		addVideoItem("NTe1jDy5aOc", "THIERRY HENRY'S SPEED - Incredible Acceleration and Skill", "Watch in this video the THIERRY HENRY'S SPEED - Incredible Acceleration and Skill");

		addVideoItem("WlAOYuzoQjw", "Amazing Goals Henry", "Watch in this video the Amazing Goals Henry");

		addVideoItem("o3L8DGeNqHg", "Legendary Moment by Thierry Henryn ", "Watch in this video the Legendary Moment by Thierry Henryn  ");

		addVideoItem("XwN4lEpq_Z8", "Legend THIERRY HENRY'S - Amazing Skills, Passes, Assists and Goals", "Watch in this video the THIERRY HENRY'S");

		addVideoItem("wCBRtiI6I9w", "Never Forget The Brilliance of Thierry Henry.", "Watch in this video the Never Forget The Brilliance of Thierry Henry.");

		addVideoItem("2QkDyAclcrk", "Thierry Henry Top Legendary 25 goals ", "Watch in this video the Thierry Henry Top Legendary 25 goals");

		addVideoItem("yWBu6rY_aHo", "Thierry Henry - The King - Skills & Goals ", "Watch in this video the Thierry Henry - The King - Skills & Goals ");

		createPlayList("Henry", R.drawable.henry);
		//==========================================================================


		//28==========================================================================
		addVideoItem("RIbmWdYEV18", "Andres Iniesta - When Football Becomes LEGEND", "Watch in this video the Andres Iniesta - When Football Becomes LEGEND");

		addVideoItem("CyfUc4-DZCY", "Andres Iniesta - The Last of his Kind ", "Watch in this video the Andres Iniesta - The Last of his Kind ");

		addVideoItem("ujDXQXN9a9c", "Andres Iniesta - The legend of Passing", "Watch in this video the Andrés Iniesta - The legend of Passing");

		addVideoItem("L2p3i5We1HE", "LEGENDARY Moment by Andrés Iniesta", "Watch in this video the LEGENDARY Moment by Andrés Iniesta");

		addVideoItem("nhRjZGvwEy4", "Andres Iniesta - The Last of His Kind", "Watch in this video the Andrés Iniesta - The Last of His Kind");

		addVideoItem("dUNQKvSzxRY", "Andres Iniesta Moments of Genius", "Watch in this video the Andres Iniesta Moments of Genius");

		addVideoItem("JXsATcfVeSk", "TOP 10 Legendary GOALS LaLiga Iniesta", "Watch in this video the TOP 10 Legendary GOALS LaLiga Iniesta");

		addVideoItem("xJcU6CUFA4Y", "55 LEGENDARY Assists from Andres Iniesta", "Watch in this video the 55 LEGENDARY Assists from Andres Iniesta");

		addVideoItem("8vv4s6mlCy4", "Andres Iniesta - Top 10 Goals For FC Barcelona", "Watch in this video the Andres Iniesta - Top 10 Goals For FC Barcelona");

		createPlayList("Iniesta", R.drawable.iniesta);
		//==========================================================================


		//29==========================================================================
		addVideoItem("6FEgltL2DrY", "5 Legendary Goals of Harry Kane being BRILLIANT", "5 Legendary Goals of Harry Kane being BRILLIANT");

		addVideoItem("ln6WBPwHe9E", "HARRY KANE'S TOP 10 Super GOALS", "Watch in this video the HARRY KANE'S TOP 10 Super GOALS");

		addVideoItem("nF6Go5vW__Q", "Harry Kane is the Best Striker in the World!", "Watch in this video the Harry Kane is the Best Striker in the World!");

		addVideoItem("p13ZuzsOr14", "Harry Kane’s Legendary Premier League goals!", "Watch in this video the Harry Kane’s Legendary Premier League goals!");

		addVideoItem("y--p3r7qJBQ", " Harry Kane Legendary striker", "Watch in this video the  Harry Kane Legendary striker");

		addVideoItem("alcru4Pz_y4", "Harry Kane Amazing Skills, Goals & Assists ", "Harry Kane 2022 Amazing Skills, Goals & Assists ");

		addVideoItem("Bn57wWCrnwY", "Harry Kane Skills , Goals & Assists", "Watch in this video the Harry Kane - Skills , Goals & Assists");

		addVideoItem("NCvz3fozcdA", "Harry Kane is the Legendary Striker in the World!", "Harry Kane is the Legendary Striker in the World");

		addVideoItem("c3AzU1bXRkw", "Harry Kane Greatest Goals Ever Born to Score", "Watch in this video the Harry Kane Greatest Goals Ever Born to Score");

		addVideoItem("-qw69sBofKI", " Harry Kane Mind blind Goals", "Watch in this video the Harry Kane Mind blind Goals");

		createPlayList("Kane", R.drawable.kane);
		//==========================================================================

//30==========================================================================
		addVideoItem("9_O6TSyYAlE", "Legendary N'Golo Kante Moments", "Watch in this video the Legendary N'Golo Kante Moments");

		addVideoItem("Y-XtMhkekhs", "N'Golo Kante Legendary Strength & Defensive Skills", "N'Golo Kante Legendary Strength & Defensive Skills");

		addVideoItem("y3VnAWU6r1g", "Never Forget The Brilliance of N'Golo Kante", "Watch in this video the Never Forget The Brilliance of N'Golo Kante");

		addVideoItem("r5dOVejJA1Y", "LEGENDARY Goals and Assists from N'Golo Kante", "Watch in this video the LEGENDARY Goals and Assists from N'Golo Kante");

		addVideoItem("NPEsm5o4-rs", "50+ Players Humiliated by N'Golo Kante", "Watch in this video the 50+ Players Humiliated by N'Golo Kante");

		addVideoItem("XnzYbCe-dpE", "N'Golo Kante Mind blind Goals", "Watch in this video the N'Golo Kante Mind blind Goals");

		addVideoItem("3Di1BtMD-vA", "N'Golo Kante 2022 - Skills, Goals & Assists", "N'Golo Kante 2022 - Skills, Goals & Assists");

		addVideoItem("2--7twsNeBY", "N'Golo Kante Goals That SHOCKED the WORLD", "N'Golo Kante Goals That SHOCKED the WORLD");

		addVideoItem("j62F1QQmF-Q", "N'Golo Kante Legendary 11 Goals ", "Watch in this video the N'Golo Kante Legendary 11 Goals");

		addVideoItem("yPegdvjlx0Y", "N'Golo Kante Crazy Defensive Skills", "Watch in this video the N'Golo Kante Crazy Defensive Skills");

		createPlayList("Kante", R.drawable.kante);
		//==========================================================================

		//31==========================================================================
		addVideoItem("Y7mdgvlTlmo", "Robert Lewandowski When Football Becomes Legend", "Watch in this video the Robert Lewandowski - When Football Becomes Legend");

		addVideoItem("TthnLjCrMTg", "Robert Lewandowski Legendary Goals", "Watch in this video the Robert Lewandowski Legendary Goals");

		addVideoItem("r4tJZOpj3f0", "Robert Lewandowski When Football Becomes Art", "Watch in this video the Robert Lewandowski When Football Becomes Art");

		addVideoItem("zH5eqij-GGw", "Robert Lewandowski Magical Skills & Goals", "Watch in this video the Robert Lewandowski Magical Skills & Goals");

		addVideoItem("dFgCKz9P9xA", "Lewandowski is the BEST STRIKER in the World", "Watch in this video the Lewandowski is the BEST STRIKER in the World");

		addVideoItem("JUfLQv0Hxbw", "Robert Lewandowski is Making La Liga Defenders Look Stupid", "Watch in this video the Lewandowski is Making La Liga Defenders Look Stupid");

		addVideoItem("pBipC0M63Yk", "Robert Lewandowski Amazing Skills, Goals & Assists", "Watch in this video the Robert Lewandowski Amazing Skills, Goals & Assists");

		addVideoItem("IF29f_FuveI", "Robert Lewandowski - The Greatest Striker Of The Decade", "Robert Lewandowski - The Greatest Striker Of The Decade");

		addVideoItem("TthnLjCrMTg", "5 Goals in 9 Minutes – The Legendary Lewandowski Show ", "Watch in this video the 5 Goals in 9 Minutes – The Legendary Robert Lewandowski Show" );

		addVideoItem("fzjVuni5r6s", "Robert Lewandowski Skills & Goals 2015-2016", "Watch in this video the Robert Lewandowski Skills & Goals 2015-2016");

		createPlayList("Lewandowski", R.drawable.lewandowski);
		//==========================================================================

		//32==========================================================================
		addVideoItem("qWy0kq_ubWk", "This is Why Luka Modric Was The Midfielder of The Decade", "This is Why Luka Modric Was The Midfielder of The Decade!");

		addVideoItem("FdDhDeZYNkk", "Luka Modric Legendary 20 Goals ", "Watch in this video the Luka Modric Legendary 20 Goals ");

		addVideoItem("yN-8hyZxdyg", "Luka Modric - When Football Becomes Legend", "Watch in this video the Luka Modric When Football Becomes Legend");

		addVideoItem("atReonbrBbk", "Luka Modric 2018 Ballon d'Or", "Watch in this video the Luka Modric 2018 Ballon d'Or");

		addVideoItem("k57ko_QtXlU", "Luka Modric LEGENDARY Goals and Skills", "Watch in this video the Luka Modric LEGENDARY Goals and Skills");

		addVideoItem("ER_TBuuYrLM", "Luka Modric Best Skills & Goals, Assists", "Watch in this video the Luka Modric Best Skills & Goals, Assists");

		addVideoItem("uFA59A1b8MY", "Luka Modrić - Amazing Skills, Goals & Assists jus a wow", "Watch in this video the Luka Modrić - Amazing Skills, Goals & Assists jus a wow");

		addVideoItem("aHU2lIBXiMA", "Luka Modric Legendary Moments", "Watch in this video the Luka Modric Legendary Moments");

		addVideoItem("TjKA5CAd7ck", "Luka Modric All 33 goals for Real Madrid", "Watch in this video the Luka Modric All 33 goals for Real Madrid");

		addVideoItem("m9OjQfekY6Q", "Luka Modric - Long Range Goals", "Watch in this video the Luka Modric - Long Range Goals");

		createPlayList("Luka", R.drawable.luka);
		//==========================================================================


		//33==========================================================================
		addVideoItem("Pah2arSLVlg", "Football's Greatest - Paolo Maldini", "Watch in this video the Football's Greatest - Paolo Maldini");

		addVideoItem("tIpiQLklGqY", "Paolo Maldini The Greatest Defender Ever ", "Watch in this video the Paolo Maldini The Greatest Defender Ever ");

		addVideoItem("H8ZnIAama1A", "Paolo Maldini - The Art of Technique", "Watch in this video the Paolo Maldini - The Art of Technique");

		addVideoItem("V4-p31SoqwA", "Paolo Maldini had a time when he was defending defenders", "Paolo Maldini had a time when he was defending defenders");

		addVideoItem("Ct-4gNW7ajg", "Paolo Maldini The Art Of Defending The Legend", "Watch in this video the Paolo Maldini The Art Of Defending The Legend");

		addVideoItem("mCz6nW-ets4", "Legend Paolo Maldini is the Greatest Defender of All Time!", "Watch in this video the Legend Paolo Maldini is the Greatest Defender of All Time");

		addVideoItem("loeDYHV32uQ", "Paolo Maldini ●King Of Dribbling Skills●", "Watch in this video the Paolo Maldini ●King Of Dribbling Skills● ");

		addVideoItem("j_ZkEeuHaec", "Paolo Maldini Best Defensive Skills & Goals", "Watch in this video the Paolo Maldini [Best Defensive Skills & Goals]");

		createPlayList("Maldini", R.drawable.maldini);
		//==========================================================================


		//34==========================================================================
		addVideoItem("HuxehLNcz40", " Sadio Mane Magical Skills & Legendary Goals", "Sadio Mane Magical Skills & Legendary Goals 2021/2022");

		addVideoItem("qvV9ur53eUA", "Sadio Mane  Magical Skills & Goals", "Sadio Mane  Magical Skills & Goals in the world");

		addVideoItem("TL6akmm9AGk", "Sadio Mane Moments Liverpool Will never Forget", "Watch in this video the Sadio Mane Moments Liverpool Will never Forget");

		addVideoItem("PqU6isCLbeA", " WOW! Sadio Mane Unbelievable Moments That Surprised The World", "WOW! Sadio Mane Unbelievable Moments That Surprised The World");

		addVideoItem("zRDxzmpfId4", "Sadio Mané 15 LEGENDARY GOALS", "Sadio Mane- 15 magical and rare moments of 2022");

		addVideoItem("96aWw8c7FPE", "AMAZING GOALS Sadio Mane SHOCKED The World", "See the 19 amazing goals Sadio Mane stunned the world with");

		addVideoItem("p1BS3KzgSuc", "Sadio Mane Legendary Goals for Bayern Munich", "OMG! Watch Sadio Mane unstoppable scoring goals for Bayern Munich");

		addVideoItem("3ol89BYl2Lo", " Sadio Mane Speed Show – Skills & Goals for Bayern", "Watch Sadio Mane 2022/2023 – Speed Show – Skills & Goals for Bayern");

		addVideoItem("Z5mBBsbC02U", " Sadio Mane | Crazy Skills, Goals & Assists", "Sadio Mane | Crazy Skills, Goals & Assists 2023");

		addVideoItem("moVnC3GmYXo", "Sadio Mane All BRILLIANT 25 Goals & Assists", "Sadio Mane All BRILLIANT 25 Goals & Assists in 2021/22 for Liverpool");

		createPlayList("Mane", R.drawable.mane);
		//==========================================================================

//35==========================================================================
		addVideoItem("fobutxiH-3o", "Lautaro Martínez - Skills, Goals & Assists", " watch Lautaro Martínez 2023 - Skills, Goals & Assists");

		addVideoItem("c9aERn8N1f0", "Lautaro Martinez ToP LEGENDARY 10 Goals", "Watch Lautaro Martinez ToP LEGENDARY 10 Goals");

		addVideoItem("rmqZ6I0MrhU", "Lautaro Martinez - Best Skills, Goals & Assists", "Lautaro Martinez 2022 - Best Skills, Goals & Assists");

		addVideoItem("9CnhqkH3H4Y", "Lautaro Martinez Is WORLD CLASS", "Watch in this video the Lautaro Martinez Is WORLD CLASS In 2022/23!");

		addVideoItem("1RJpQN0n_e0", "Lautaro Martinez - Complete Attacker • International  ", " Watch in this video the Lautaro Martinez - Complete Attacker • International  ");

		addVideoItem("DOmYi8br2Gw", "Lautaro Martinez Crazy Skills, Goals & Assists", "Watch in this video the Lautaro Martinez Crazy Skills, Goals & Assists");

		addVideoItem("A2f_X__ihsw", "Lautaro Martinez The YOUNG STAR ", "Watch in this video the Lautaro Martinez The YOUNG STAR  ");

		addVideoItem("PqvomtxFQgA", "Lautaro Martínez - Technical golas", "Watch in this video the Lautaro Martínez - Technical golas");

		addVideoItem("zuvYSmkACX8", "YOUNG STAR Lautaro Martínez returned at his BEST LEVEL to INTER", "Watch  Martínez returned at his BEST LEVEL to INTER");

		addVideoItem("lyjzIHAeDLw", "Lautaro Martínez- Amazing Skills,GOALS Assists ", "Watch in this video the Lautaro Martínez ToP BEST GOALS - 2021");

		createPlayList("Martinez", R.drawable.martinez);
		//==========================================================================

//36==========================================================================
		addVideoItem("-aBRhjMEeNU", "Thomas Muller LEGENDARY- Dribbling Skills, Passes & Goals.", "Watch Thomas Muller 2022 LEGENDARY - Dribbling Skills, Passes & Goals.");

		addVideoItem("tSYL4KZRqas", "Thomas Muller - The LEGENDARY of Passing", "Watch in this video the Thomas Muller - The LEGENDARY of Passing");

		addVideoItem("VjjifzCs3p0", "Thomas Muller ToP 10 LEGENDARY GOALS", "Watch in this video the Thomas Muller ToP 10 LEGENDARY GOALS");

		addVideoItem("QQcR5f5si4U", "Thomas Muller – Amazing Skills & Goals, Assists", "Watch in this video the Thomas Muller 2023 – Amazing Skills & Goals, Assists");

		addVideoItem("1HgfWr-jUm0", "LEGENDARY Moment by Thomas Muller", "Watch in this video the LEGENDARY Moment by Thomas Muller 2022");

		addVideoItem("64goZy8hw1I", "Thomas Muller's Top 10 Goals", "Watch in this video the Thomas Muller's Top 10 Goals for FC Bayern!");

		addVideoItem("FGinJXwAJqk", "Thomas Muller Doing Muller Mind Blind Things", "Watch Thomas Muller Doing Muller Things - The Most Intelligent Player");

		addVideoItem("ImFQsh5r16c", "Thomas Muller - Skills, Passes & Goals", "Watch in this video the Thomas Muller 2018/19 - Skills, Passes & Goals");

		createPlayList("Muller", R.drawable.muller);
		//==========================================================================

		//37==========================================================================
		addVideoItem("pa0KU8Jgfzw", "Manuel Neuer One Of The BEST Goalkeeper", "Manuel Neuer: 11 seasons, 11 incredible saves");

		addVideoItem("mKPIBTXpaVM", "Manuel Neuer The Legend Miraculous Saves & Best Passes", "Manuel Neuer ● The Legend ● Miraculous Saves & Best Passes - 2021/2022 ");

		addVideoItem("UKoIo5JheEo", "Manuel Neuer is a legendary goalkeeper", "Watch in this video the Manuel Neuer is a legendary goalkeeper");

		addVideoItem("y4FzKIJoDbU", "100 Brilliant Saves by Legend Manuel Neuer", "Watch in this video the 100 Brilliant Saves by Legend Manuel Neuer");

		addVideoItem("lwxmnDOTus8", "Manuel Neuer: Best Saves & Skills", "Manuel Neuer: Best Saves & Skills in the Champions League | FC Bayern");

		addVideoItem("Xg8IlYwrLzQ", "Manuel Neuer king of the king", "Manuel Neuer Saves Vs. Great Players In The World");

		addVideoItem("KVvN19vV-a0", "Manuel Neuer - Craziest Saves Ever", "Watch in this video the Manuel Neuer - Craziest Saves Ever");

		addVideoItem("tO1A5DfPem4", "Manuel Neuer  Amazing Saves & Crazy Long Pass", "Manuel Neuer  Amazing Saves & Crazy Long Pass - 2021/22 ");

		addVideoItem("q2A4H183vdw", "LEGENDARY Moment by Manuel Neuer", "Watch in this video the LEGENDARY Moment by Manuel Neuer");

		addVideoItem("WXbMlzgXSOE", "legend MANUEL NEUER THE BEST", "Legend MANUEL NEUER - 2022 - THE BEST");

		createPlayList("Neuer", R.drawable.neuer);
		//==========================================================================


		//38==========================================================================
		addVideoItem("YlczweXGOx8", "Legend Oliver Kahn - Best Goalkeeper Ever", "Legend Oliver Kahn - Best Goalkeeper Ever ● 1994-2008");

		addVideoItem("nMAjDtr1GoI", "Oliver Kahn - Top 10 Saves for", "Oliver Kahn - Top 10 Saves for FC Bayern");

		addVideoItem("rDKD4kdkpFo", "Oliver Kahn, the king of goalkeepers", "Watch in this video the Oliver Kahn, the king of goalkeepers");

		addVideoItem("gLKIE-8iWGk", "Oliver Kahn is a legendary goalkeeper", "Watch in this video the Oliver Kahn is a legendary goalkeeper");

		addVideoItem("hNOzHvsEmg4", "Oliver Kahn Legendary Moments", "Watch in this video the Oliver Kahn Legendary Moments");

		addVideoItem("_AABY3hPguI", "Oliver Kahn Legendary Saves", "Watch in this video the Oliver Kahn Legendary Saves");

		addVideoItem("ZMlOaFUQh30", "Oliver Kahn The Best- Legendary Goalkeeper", "Watch in this video the Oliver Kahn The Best- Legendary Goalkeeper");

		addVideoItem("yRMwx2pnebI", "Oliver Kahn His Last Season Legend Farewell", "Oliver Kahn 2007/08 - His Last Season - Legend Farewell");

		addVideoItem("QrYCg0N7teM", "Oliver Kahn The Best Moment", "Watch in this video the Oliver Kahn The Best Moment");


		createPlayList("Oilver", R.drawable.oilver);
		//==========================================================================


		//39==========================================================================
		addVideoItem("rfaYKFdIVQ8", "Andrea Pirlo Moments of Genius", "Watch in this video the Andrea Pirlo Moments of Genius");

		addVideoItem("eUg9Sx28MlA", "Andrea Pirlo The Best Of The Master Ever", "Watch Andrea Pirlo The Best Of The Master Ever");

		addVideoItem("w8ks50cVSYE", "Andrea Pirlo's LEGENDARY Goals , pass, and skill ", "Watch Andrea Pirlo's legendary goals, passes and skills");

		addVideoItem("wS769-A5urU", "Andrea Pirlo is the smartest player in football", "Watch Andrea Pirlo is the smartest player in football");

		addVideoItem("peov8-75-V0", "Andrea Pirlo king of the FootBall", "Watch ndrea Pirlo king of the FootBall");

		addVideoItem("dIjENMRxRaE", "Andrea Pirlo Vision Was UNREAL!", "Watch Andrea Pirlo Vision Was UNREAL!");

		addVideoItem("f72weauHySg", "The Brilliance of Andrea Pirlo", "Watch The Brilliance of Andrea Pirlo");

		addVideoItem("1yb7OSxEyFk", "Andrea Pirlo's LEGENDARY Goals in the World", "Watch Andrea Pirlo's LEGENDARY Goals in the World");

		addVideoItem("FkTng-tGamk", "Andrea Pirlo Top 10 Goals Ever", "Watch Andrea Pirlo  Top 10 Goals Ever! 1994-2017");

		addVideoItem("BgtnDT1l9uM", "Andrea Pirlo Mind Blind pass and Goals", "Watch Andrea Pirlo Mind Blind pass and Goals");

		createPlayList("Pirlo", R.drawable.pirlo);
		//==========================================================================

//40==========================================================================
		addVideoItem("oMpozVWERe4", "Paul Pogba Best Skills & Goals, Assists", "Watch Paul Pogba 2021/22 Best Skills & Goals, Assists");

		addVideoItem("s-exVbMRW3o", "Paul Pogba goals and skills of the French genius legend", "Watch Paul Pogba goals and skills of the French genius legend");

		addVideoItem("nODqFooQv7w", "Paul Pogba - The Legend of Passing", "Watch Paul Pogba - The Legend of Passing");

		addVideoItem("yfKQZE6j3mE", "Passes Only Paul Pogba Can Do", "Watch in this video the Passes Only Paul Pogba Can Do");

		addVideoItem("S2CsTSa9jYY", "There is no point in pushing Paul Pogba", "Watch There is no point in pushing Paul Pogba");

		addVideoItem("WG9NM8SdiiA", "Paul Pogba - When Passing Becomes Legend", "Watch Paul Pogba - When Passing Becomes Legend");

		addVideoItem("u-9RRPuGoIM", "Paul Pogba Legendary Goals in the World", "Paul Pogba The Art of Passing Best Passes Through Balls Goals ");

		addVideoItem("DCVGxhX376E", "Paul Pogba World Cup Skills & Goals France", "Watch Paul Pogba World Cup Skills & Goals France");

		addVideoItem("bWi86lZyyX8", "Never Forget the Brilliance of Paul Pogba", "Watch Never Forget the Brilliance of Paul Pogba");

		addVideoItem("obAOyosx0fk", "10 AMAZING GOALS Paul Pogba SHOCKED The World", "Top 10 Goals Paul Pogba Showed His Class at United The Best Paul Pogba's moments all In one Enjoy!");

		createPlayList("Pogba", R.drawable.pogba);
		//==========================================================================

//41==========================================================================
		addVideoItem("k7G0IUw1g_k", "Carles Puyol `Legendary Defender in the World", "Watch Carles Puyol `Legendary Defender in the World");

		addVideoItem("YfOSZJRknW8", "Carles Puyol Respect moments & defending skills", "Watch Carles Puyol Respect moments & defending skills");

		addVideoItem("iMENrpOUf1k", "This is Why Carles Puyol is a LEGEND", "Watch This is Why Carles Puyol is a LEGEND");

		addVideoItem("SI4uiXwMEmA", "Carles Puyol LEGENDARY Saves", "Watch Carles Puyol LEGENDARY Saves");

		addVideoItem("MVqU89pyxnI", "Legend Carles Puyol Best Defending Skills ever", "Legend Carles Puyol ● Best Defending Skills ever");

		addVideoItem("j9IpgxncDCg", "CARLES PUYOL NEVER GIVE UP", "Watch CARLES PUYOL NEVER GIVE UP");

		addVideoItem("53W3eYdEGgc", "Carles Puyol Legendary Defender Skills And Goals ", "Carles Puyol - 1999-2014 - Legendary Defender - Skills And Goals ");

		addVideoItem("Nn9wJRAOyyA", "Carles Puyol The Last of His Kind", "Watch Carles Puyol The Last of His Kind");

		addVideoItem("RfnR1LeLd1c", "Carles Puyol FC Barcelona Best Moments Eve", "Carles Puyol ● FC Barcelona ● Best Moments Eve");

		addVideoItem("o5VRywy-GKE", "Carles Puyol The Art of Technique", "Watch Carles Puyol The Art of Technique");

		createPlayList("Puyol", R.drawable.puyol);
		//==========================================================================

		//42==========================================================================
		addVideoItem("MGYdPVuqXy8", "Sergio Ramos Beast Crazy Defensive Skills", "Watch Sergio Ramos Beast Crazy Defensive Skills 2016");

		addVideoItem("ZL54xup_WLw", "Sergio Ramos GREATEST Defender EVER", "Watch Sergio Ramos GREATEST Defender EVER");

		addVideoItem("1IsE8zt3C6o", "Sergio Ramos - THE END", "Sergio Ramos - THE END | 2005-2021");

		addVideoItem("jxqh7IrkAss", "Sergio Ramos vs Lionel Messi", "Lionel Messi vs. Sergio Ramos (Best fights & Angry moments) 2009/2020");

		addVideoItem("hDnMQhJnrbI", "5 Red Cards vs One Club | Sergio Ramos", "Watch 5 Red Cards vs One Club | Sergio Ramos");

		addVideoItem("7MVU65xdoJs", "Sergio Ramos ⚽ Best Fights & Angry Moments Ever! ", "Sergio Ramos owns the most yellow cards and red cards in football history ");

		addVideoItem("UxnmEPF9ANQ", "Sergio Ramos Best Fights & Angry Moments Ever part 2", "Sergio Ramos owns the most yellow cards and red cards in football history ");

		addVideoItem("hSU4FmYIiNQ", "Legend Sergio Ramos The Attacker ", "Sergio Ramos The Attacker Attack on players and Fights Bad boy Ramos");

		addVideoItem("GmSDE2lZ-4U", "Sergio Ramos vs Zlatan Ibrahimovic Crazy Fights", "Sergio Ramos vs Zlatan Ibrahimovic Crazy Fights Fouls,Yellow and Red cards & Bad Boy moments");

		addVideoItem("04Q6ybR1bLc", "Sergio Ramos One of The best Defender", "Watch Sergio Ramos One of The best Defender");
		createPlayList("Ramos", R.drawable.ramos);
		//==========================================================================


		//43==========================================================================
		addVideoItem("eoSL0bj0BLU", "Arjen Robben Magical Skills and Goals", "Watch Arjen Robben - Magical Skills and Goals");

		addVideoItem("34C9lTVbtHY", "Arjen Robben is the most predictable move in football.", "Watch Arjen Robben is the most predictable move in football.");

		addVideoItem("zDHij9D63MA", "Arjen Robben - Flying Dutchman - Insane Skill Show", "Watch Arjen Robben - Flying Dutchman - Insane Skill Show");

		addVideoItem("CeV1xtbzwbA", "Arjen Robben Cutting Inside His Signature Moves", "Watch Arjen Robben Cutting Inside - His Signature Moves");

		addVideoItem("EupCe8TJITg", "Arjen Robben's best Legendary goals In The World", "Arjen Robben's best Legendary goals In The World for FC Bayern");

		addVideoItem("gAPxcVioyQk", "Robben's World Record Speed World Cup Fastest Run Ever", "Robben's World Record Speed ● World Cup 2014 ● Fastest Run Ever\n");

		addVideoItem("iXXq0D-Rh1A", "Arjen Robben |10 AMAZING GOALS Arjen Robben's SHOCKED The World", "Watch 10 AMAZING GOALS Arjen Robben's SHOCKED The World");

		addVideoItem("FxKv25gXou8", "Arjen Robben Amazing Dribbling", "Arjen Robben - Amazing Dribbling & Runs - 2014-2015");

		addVideoItem("X6eNjHl-sJo", "Arjen robben speed and goals driblling skills", "Watch Arjen robben ● speed and goals ● driblling skills");

		addVideoItem("hLU1XDaMLGM", "Arjen Robben Crazy Skills & Goals", "Arjen Robben ● Crazy Skills & Goals ● 2012-2018");

		createPlayList("Robben", R.drawable.robben);
		//==========================================================================


		//44==========================================================================
		addVideoItem("PO4C73iPc9w", "Wayne Rooney Crazy Longshots Goals| ", "Wayne Rooney Crazy Longshots! l All Goals From Beyond Midfield");

		addVideoItem("QjXsIYcwIsQ", "Wayne Rooney [Best Skills & Goals]", "Watch Wayne Rooney [Best Skills & Goals]");

		addVideoItem("mK893wwweZ8", "Legend Wayne Rooney Showing Amazing Dribbling Skills", "Watch Legend Wayne Rooney Showing Amazing Dribbling Skills");

		addVideoItem("aGVq0QcWv3A", "Wayne Rooney10 AMAZING GOALS Wayne Rooney's SHOCKED The World", "Wayne Rooney 10 AMAZING GOALS Wayne Rooney's SHOCKED The World");

		addVideoItem("s4uj6FrZlQI", "Legendary Moments by Wayne Rooney", "Legendary Moments by Wayne Rooney");

		addVideoItem("7n2rvupiKaY", "Wayne Rooney All 53 Goals", "Wayne Rooney All 53 Goals For England Goodbye Legend");

		addVideoItem("mO35A7lzpZY", "Wayne Rooney's Top 5 FIFA Cup Goals", "Wayne Rooney's Top 5 FA Cup Goals");

		addVideoItem("zVeJhQwKWCw", "WOW! Wayne Rooney Unbelievable Moments That Surprised The World", " Watch WOW! Wayne Rooney Unbelievable Moments That Surprised The World");

		addVideoItem("pLLaNgWmXbg", "There Won't be Another Player Like Wayne Rooney", "Watch There Won't be Another Player Like Wayne Rooney");

		addVideoItem("LtqI4Gc_sPs", "Wayne Rooney Dribbling/Skills/Runs/Goals/Assists", "Watch Wayne Rooney 2013/14 | Dribbling/Skills/Runs/Goals/Assists");

		createPlayList("Rooney", R.drawable.rooney1);
		//==========================================================================

//45==========================================================================
		addVideoItem("E-OqNdt-FgQ", "Luis Suarez - Best Legendary Goals ", "Watch Luis Suarez - Best Legendary Goals");

		addVideoItem("jZBs4vR23EU", "Luis Suarez - Barcelona Legend", "Watch Luis Suarez - Barcelona Legend");

		addVideoItem("KTEgduWt3hQ", "11 Legendary Goals Luis Suarez Shocked The World", "Watch 11 Legendary Goals Luis Suarez Shocked The World");

		addVideoItem("IZ82qGSp5Os", "Luis Suarez 2023 - Amazing Skills Show & Goals", "Watch Luis Suarez 2023 - Amazing Skills Show & Goals");

		addVideoItem("NIFJVCDDG4s", "One of The Best TOP 10 GOALS La Liga Luis Suarez", "One of The Best TOP 10 GOALS La Liga Luis Suarez");

		addVideoItem("RLBvH-AvkdU", "When Luis Suarez Made History!", "When Luis Suarez Made History! | Liverpool 5-1 ");

		addVideoItem("JI1QphDKEug", "WOW! Wayne Luis Suarez Unbelievable Moments That Surprised The World", "WOW! Wayne Luis Suarez Unbelievable Moments That Surprised The World");

		addVideoItem("dcu7y45EwYE", "Luis Suarez 2016-17 | Amazing Skill", "Luis Suarez 2016-17 | Amazing Skill");

		addVideoItem("vrd50PrlCOI", "50+ Players Humiliated by Luis Suárez", "Watch 50+ Players Humiliated by Luis Suárez");

		addVideoItem("LP9_Bj78osM", "20 Luis Suarez Goals That Shocked The World", "Watch 20 Luis Suarez Goals That Shocked The World");

		createPlayList("Suarez", R.drawable.suarez);
		//==========================================================================

//46==========================================================================
		addVideoItem("h0N67Mh7htE", "Never Forget the Brilliance of Fernando Torres", "Watch Never Forget the Brilliance of Fernando Torres");

		addVideoItem("Ec72ojiGnIs", "Fernando Torres All 70 Goals For Liverpool", "Fernando Torres All 70 Goals For Liverpool 2007-2010");

		addVideoItem("G5XjOFuQdw8", "When Legend Fernando Torres Was The Best Striker In The World", "When Legend Fernando Torres Was The Best Striker In The World");

		addVideoItem("Juab8E31KL0", "Legendary Goals Fernando Torres Shocked The World", "Watch Legendary Goals Fernando Torres Shocked The World");

		addVideoItem("FNkUqRwyNXY", "Fernando Torres Best Skills and Goals", "Watch Fernando Torres Best Skills and Goals");

		addVideoItem("LyuGg_TMDjA", "Fernando Torres Legendary Skills ", "Watch Fernando Torres Legendary Skills ");

		addVideoItem("HNK7HgSF3LE", "Fernando Torres Goals & Skills", "Fernando Torres Goals & Skills - 2016 ");

		addVideoItem("eLV01bPyRpw", "The Brilliance of Fernando Torres", "The Brilliance of Fernando Torres at Liverpool");

		addVideoItem("gk3R3uH3r_o", "Fernando Torres Top 50 Legendary Goals", "Fernando Torres Top 50 Legendary Goals (All Clubs)");

		createPlayList("Torres", R.drawable.torres);
		//==========================================================================

		//47==========================================================================
		addVideoItem("90br29FhY04", "David Villa•Amazing Skills Show & Goals", "David Villa•Amazing Skills Show & Goals");

		addVideoItem("qbZPQf7JEJI", "David Villa All legendary Goals", "David Villa All 48 Goals For FC Barcelona 2010-2013");

		addVideoItem("63_kmYCm_pM", "David Villa speed and goals driblling skills", "David Villa ● speed and goals ● driblling skills");

		addVideoItem("FTTiQIFuYTw", "David Villa king of the king", "David Villa king of the king");

		addVideoItem("neaZWPgmX3M", "David Villa - When Football Becomes Legend", "David Silva - When Football Becomes Legend");

		addVideoItem("qOwOfi4wZTQ", "Legendary Goals David Villa Shocked The World", "Legendary Goals David Villa Shocked The World Copa 2010");

		addVideoItem("W_coa3iJhBQ", "David Villa ● Skills & Goals", "David Villa ● Skills & Goals in Japan ● 2019");

		addVideoItem("QwA671hhq10", "David Villa Atletico Madrid All goals", "David Villa ● Atletico Madrid ● All goals 2013-2014");

		addVideoItem("YzYO-1Q1sWE", "THE LEGENDS David Villa Goals, Assists, Passing,Skills", "THE LEGENDS David Villa Goals, Assists, Passing,Skills");

		addVideoItem("IocXkRd2Bus", "David Villa Crazy Skills & Goals", "Watch in this video the David Villa Crazy Skills & Goals");

		createPlayList("Villa", R.drawable.villa);
		//==========================================================================


		//48==========================================================================
		addVideoItem("7yuEt7GzbiU", "Xavi Hernandez When Football Becomes Legend", "Watch Xavi Hernández - When Football Becomes Legend");

		addVideoItem("W6Tjz_weKOY", "Xavi Hernandez - The Legend of Passing", "Watch Xavi Hernandez - The Legend of Passing");

		addVideoItem("TbvRQEkO93U", "THE LEGENDS Xavi Hernandez Goals, Assists, Passing,Skills", "Watch THE LEGENDS Xavi Hernandez Goals, Assists, Passing,Skills");

		addVideoItem("_VM7LOjjntA", "Xavi Hernandez The Pass Master", "Watch in this video the Xavi Hernandez The Pass Master");

		addVideoItem("PQ4vo28qMj8", "Legend Xavi Hernández | Pass & Assists", "Xavi Hernández | Pass & Assists | FC Barcelona | 2010-2011 Season");

		addVideoItem("cfHhhyWAUZE", "Legend Xavi Hernández - A Ball Retention Master", "Watch in this video the Legend Xavi Hernández - A Ball Retention Master");

		addVideoItem("V3vkyu0uyHw", "Xavi Hernández ToP Legendary goals", "Watch in this video the  Xavi Hernández ToP Legendary goals");

		addVideoItem("Pw58yJf5HIs", "This is What Makes Xavi So Special.", "Watch in this video the This is What Makes Xavi So Special.");

		addVideoItem("tettGpF4fBY", "Xavi Hernandez - World Cup", "Watch in this video the This Xavi Hernandez - World Cup 2010");

		addVideoItem("k_lAQ957d7o", "Xavi Hernández Legendary Goals and Skills ", "Watch in this video the This Xavi Hernández Legendary Goals and Skills");

		createPlayList("Xavi", R.drawable.xavi);
		//==========================================================================


		//49==========================================================================
		addVideoItem("AVfZHc_WXvs", "Kevin De Bruyne Perfect Midfielder Magical Skills, Passes & Goals", "Kevin De Bruyne 2022 - Perfect Midfielder - Magical Skills, Passes & Goals");

		addVideoItem("0XaiAIUisq4", "Kevin De Bruyne - When Football Becomes Legend", "Watch in this video the Kevin De Bruyne - When Football Becomes Legend");

		addVideoItem("xKX6Q2fHC3c", "Kevin De Bruyne Just Plays Beautiful Football", "Watch in this video the Kevin De Bruyne Just Plays Beautiful Football");

		addVideoItem("ZpJlWZl6zew", "Kevin De Bruyne Top LEGENDARY 20 Goals", "Kevin De Bruyne Top 20 Goals For Man City");

		addVideoItem("e8Pisj4y9MY", "Kevin De Bruyne - The Legend of Passing", "Kevin De Bruyne - The Legend of Passing");

		addVideoItem("8ZtcxAVGpJ8", "Kevin De Bruyne Magic Skills & Goals, Assists", "Kevin De Bruyne 2023 – Magic Skills & Goals, Assists");

		addVideoItem("Uw9M93qN0FE", "Kevin De Bruyne The Master of Passing", "Watch in this video the Kevin De Bruyne The Master of Passing");

		addVideoItem("LMaXN3tixZE", "Kevin De Bruyne Sublime Dribbling Skills, Goals & Assists", "Kevin De Bruyne 2021 - Sublime Dribbling Skills, Goals & Assists");

		addVideoItem("PWXTj9HQ6ok", "Legend Kevin De Bruyne Top 20 Magical Things That Prove His Genius ", "Kevin De Bruyne Top 20 Magical Things That Prove His Genius ");

		addVideoItem("pKOxLZvm2oc", "Legend Kevin De Bruyne Dribbling Skills & Goals.", "Legend Kevin De Bruyne 2022/23 - Dribbling Skills & Goals.");

		createPlayList("De bruyne", R.drawable.bruyne);
		//==========================================================================

		//50==========================================================================
		addVideoItem("OKxa5ZYeNdI", "Legend Gianluigi Buffon ● Best Saves Eve", "Watch in this video the Legend Gianluigi Buffon ● Best Saves Eve");

		addVideoItem("8-YBByPKRrA", "Gianluigi Buffon - Top Ten LEGENDARY Saves", "Watch in this video the Gianluigi Buffon - Top Ten LEGENDARY Saves");

		addVideoItem("IIjvzLI_PM0", "Gianluigi Buffon  Impossible Saves", "Gianluigi Buffon  Impossible Save Compilation  Still The Best LEGENDARY GK");

		addVideoItem("6G0sDXXEs60", "Gianluigi Buffon One Of The BEST Goalkeeper in the world", "Watch Gianluigi Buffon One Of The BEST Goalkeeper in the world");

		addVideoItem("lvDrpXbFLZ8", "Gianluigi Buffon is a legendary goalkeeper", "Watch Gianluigi Buffon is a legendary goalkeeper");

		addVideoItem("GObP7K8HOSI", "Legend Gianluigi Buffon TOP 40 LEGENDARY Saves", "Legend Gianluigi Buffon TOP 40 LEGENDARY Saves 2011-2018");

		addVideoItem("Z7ZaRzGhc_8", "Gianluigi Buffon - Best 100 Saves", "Watch in this video the Gianluigi Buffon - Best 100 Saves");

		addVideoItem("14idUN_GMpc", "LEGENDARY Moment by Gianluigi Buffon", "LEGENDARY Moment by Gianluigi Buffon");

		addVideoItem("J_-D33HBNro", "Gianluigi Buffon Amazing Saves Today and Forever The Superhero Superman", "Amazing Saves - Today and Forever The Superhero Superman 1978-2014");

		addVideoItem("uvBBA1o1g3g", "Gianluigi Buffon  Best Saves at 44 Years Old", "Gianluigi Buffon  Best Saves at 44 Years Old 2022/23 ");

		createPlayList("Buffon", R.drawable.buffon);
		//==========================================================================











	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}


package Proje2.data_proje2;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {


		String[] karadeniz = {"Artvin", "Rize", "Bayburt", "Trabzon", "Gümüşhane", "Giresun", "Ordu", "Tokat",
			"Amasya", "Samsun", "Sinop", "Çorum", "Kastamonu", "Bartın", "Karabük", "Zonguldak", "Düzce", "Bolu"};
		String[] marmara = {"İstanbul","Edirne", "Bursa", "Balıkesir", "Kocaeli",
			"Tekirdağ", "Yalova","Kırklareli","Sakarya","Yalova","Çanakkale"};
		String[] ege = {"İzmir", "Manisa", "Aydın", "Uşak", "Kütahya", "Afyon", "Denizli", "Muğla",  "Balıkesir","Bilecik"};
		String[] içAnadolu = {"Ankara", "Konya", "Eskişehir","Nevşehir", "Kayseri", "Aksaray", "Kırıkkale", "Karaman","Sivas" };
		String[] akdeniz = {"Antalya", "Mersin", "Adana", "Hatay", "Isparta", "Burdur", "Osmaniye"};
		String[] doğuAnadolu = {"Ağrı", "Ardahan", "Bingöl", "Bitlis", "Elazığ", "Erzincan", "Erzurum", "Hakkari",
			"Iğdır", "Kars", "Malatya", "Muş", "Tunceli", "Van" };
		String[] güneydoğuAnadolu = {"Adıyaman", "Batman", "Diyarbakır", "Gaziantep", "Kilis", "Mardin", "Siirt", "Şanlıurfa" , "Şırnak" };

		String[][] regions = {karadeniz,marmara,ege,içAnadolu,akdeniz,doğuAnadolu,güneydoğuAnadolu};





		UmAlanı m2 = new UmAlanı("Divriği Ulu Camii ve Darüşşifası", "Sivas", 1985);
		UmAlanı m3 = new UmAlanı("İstanbul'un Tarihi Alanları", "İstanbul", 1985);
		UmAlanı m4 = new UmAlanı("Göreme Millî Parkı ve Kapadokya", "Nevşehir", 1985);
		UmAlanı m5 = new UmAlanı("Hattuşa: Hitit Başkenti", "Çorum", 1986);
		UmAlanı m6 = new UmAlanı("Nemrut Dağı", "Adıyaman", 1987);
		UmAlanı m7 = new UmAlanı("Hieropolis-Pamukkale", "Denizli", 1988);
		UmAlanı m8 = new UmAlanı("Xanthos-Letoon", "Antalya", 1988);
		UmAlanı m8_2 = new UmAlanı("Xanthos-Letoon", "Muğla", 1988);

		UmAlanı m9 = new UmAlanı("Safranbolu Şehri", "Karabük", 1994);
		UmAlanı m10 = new UmAlanı("Truva Arkeolojik Alanı", "Çanakkale", 1998);
		UmAlanı m11 = new UmAlanı("Edirne Selimiye Camii ve Külliyesi", "Edirne", 2011);
		UmAlanı m12 = new UmAlanı("Çatalhöyük Neolitik Alanı", "Konya", 2012);
		UmAlanı m13 = new UmAlanı("Bursa ve Cumalıkızık: Osmanlı İmparatorluğunun Doğuşu", "Bursa", 2014);
		UmAlanı m14 = new UmAlanı("Bergama Çok Katmanlı Kültürel Peyzaj Alanı", "İzmir", 2014);
		UmAlanı m15 = new UmAlanı("Diyarbakır Kalesi ve Hevsel Bahçeleri Kültürel Peyzajı", "Diyarbakır", 2015);
		UmAlanı m16 = new UmAlanı("Efes", "İzmir", 2015);
		UmAlanı m17 = new UmAlanı("Ani Arkeolojik Alanı", "Kars", 2016);
		UmAlanı m18 = new UmAlanı("Aphrodisias", "Aydın", 2017);
		UmAlanı m19 = new UmAlanı("Göbekli Tepe", "Şanlıurfa", 2018);
		UmAlanı m20 = new UmAlanı("Arslantepe Höyüğü", "Malatya", 2021);
		UmAlanı m21 = new UmAlanı("Gordion", "Ankara", 2023);

		UmAlanı m22 = new UmAlanı("Eşrefoğlu Camii","Konya",2023);
		UmAlanı m23 = new UmAlanı("Mahmut-Bey Cami","Kastamonu",2023);
		UmAlanı m24 = new UmAlanı("Sivrihisar Camiii","Eskişehir",2023);
		UmAlanı m25 = new UmAlanı("Afyon Yeni camii","Afyon",2023);
		UmAlanı m26 = new UmAlanı("ArslanHane Camii","Ankara",2023);

		UmAlanı [] dd = {m2,m3,m4,m5,m6,m7,m8,m8_2,m9,m10,m11,m12,m13,
						m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26};

		List<List<UmAlanı>> genericList = new ArrayList<>();
		List<UmAlanı> innerKaradeniz = new ArrayList<>();
		List<UmAlanı> innerMarmara = new ArrayList<>();
		List<UmAlanı> innerEge = new ArrayList<>();
		List<UmAlanı> innerİcAnadolu = new ArrayList<>();
		List<UmAlanı> innerAkdeniz = new ArrayList<>();
		List<UmAlanı> innerDoguAnadolu = new ArrayList<>();
		List<UmAlanı> innerGuneyDogu = new ArrayList<>();

		genericList.add(0,innerKaradeniz);
		genericList.add(1,innerMarmara);
		genericList.add(2,innerEge);
		genericList.add(3,innerİcAnadolu);
		genericList.add(4,innerAkdeniz);
		genericList.add(5,innerDoguAnadolu);
		genericList.add(6,innerGuneyDogu);


		addToGenerics(dd,regions,genericList);
		printUm(genericList);


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: \n" +
			" '1' To insert and delete um from queue \n" +
			" '2' To insert and delete um from stack \n" +
			" '3' To insert and delete um from priority queue \n" +
			" '9' To exit");

		boolean isCont = true;
		while (isCont){
			int	input = scanner.nextInt();

			if(input == 1){
				// Inserting Um objects to Queue
					QueueArray qa1 = new QueueArray(dd.length);
					for (int i = 0; i < dd.length; i++){
						qa1.enque(dd[i]);
					}

					//  Deleting Um objects from Queue
					for (int i = 0; i < dd.length; i++){

						System.out.println(qa1.deque());
					}
			}
			if(input == 2 ){
				// Inserting Um objects to Stack

				StackArray s1 = new StackArray(dd.length);
				for (int i = 0; i < dd.length; i++){
					s1.push(dd[i]);
				}
				//  Deleting Um objects from Queue
				for (int i = 0; i < dd.length; i++){

					System.out.println(s1.pop());
				}
			}
			if (input == 3 ){
			// Inserting Priority Queue
				PriorityQueue prq1 = new PriorityQueue();
				for(int i = 0 ; i < dd.length ; i++){
					prq1.enqueu(dd[i]);
				}
				// Deque from Priority Queue
				prq1.deq();

		}
			if(input == 9){
				isCont = false;
				System.out.println("Program is over.");
			}
		}

	}



	public static void printUm(List<List<UmAlanı>> genericList ){
		String [] regionsOfStrings = {"Karadeniz","Marmara","Ege","İç Anadolu","Akdeniz","Doğu Anadolu","Güney Doğu Anadolu"};
		int firstIndex = 0;
		for(List <UmAlanı> umAlanListesi : genericList ){
			int numberOfUm = 0;
			System.out.println();
			System.out.println(regionsOfStrings[firstIndex]);
			for(UmAlanı birUmAlanı : umAlanListesi ){
				System.out.println(birUmAlanı.name + ", ");
				numberOfUm++;
			}
			System.out.println("The number of Um is: " + numberOfUm);
			firstIndex++;
		}
	}


	public static void  addToGenerics(UmAlanı[] dd, String[][]  regions,List<List<UmAlanı>> genericList  ){
		int indexOfRegion = 0 ;
		for(UmAlanı x1 : dd){
			for(String[] region : regions ){
				for(String city : region){
					if (x1.city == city ){
						genericList.get(indexOfRegion).add(x1);
						System.out.println(x1.name + " (is  added to generic!)");
						break;
					}
				}
				indexOfRegion++;
			}
			indexOfRegion = 0;
		}
	}












}
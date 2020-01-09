package com.example.placesofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private ImageView areaImage;
    private TextView areaName,areaLocation,areaDescription;
    //private ImageButton callButton, locationButton,shareButton;

    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        extras = getIntent().getExtras();

        areaName = (TextView) findViewById(R.id.areaName);
        areaLocation = (TextView) findViewById(R.id.areaLocation);
        areaImage = (ImageView) findViewById(R.id.areaImage);
        areaDescription = (TextView) findViewById(R.id.areadescription);

        if(extras != null){

            areaName.setText(extras.getString("name"));
            areaLocation.setText(extras.getString("description"));


            if(extras.getString("name").equals("Sundarban")){

                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.sban));
                areaDescription.setText("Sundarbans, The largest single block of tidal halophytic mangrove forest in the world, located in the southwestern part of Bangladesh. It lies on the Ganges-Brahmaputra Delta at the point where it merges with the bay of bengal. The forest lies a little south to the Tropic of Cancer between the latitudes 21°30'N and 22°30'N, and longitudes 89°00'E and 89°55'E. With its array of trees and wildlife the forest is a showpiece of natural history. It is also a centre of economic activities, such as extraction of timber, fishing and collection of honey. The forest consists of about 200 islands," +
                        " separated by about 400 interconnected tidal rivers, creeks and canals. " +
                        "The Sundarbans was originally measured (about 200 years ago) to be of about 16,700 sq km. Now it has dwindled to about 1/3 of the original size. Because of the partition of India, Bangladesh received about 2/3 of the forest; the rest is on the Indian side. It is now estimated to be about 6,000 sq km, of which about 1,700 sq km is occupied by waterbodies. The forest lies under two forest divisions, and four administrative ranges viz Chandpai, Sarankhola, Khulna and Burigoalini and has 16 forest stations. It is further divided into 55 compartments and 9 blocks. The Sundarbans was declared as a Reserve Forest in 1875. About 32,400 hectares of the Sundarbans have been declared as three wildlife sanctuaries, and came under the UNESCO World Heritage Site in 1997. These wildlife sanctuaries were established in 1977 under the Bangladesh Wildlife (Preservation) (Amendment) Act, 1974. These are Sundarbans West (9,069 ha), Sundarbans South (17,878 ha), and Sundarbans East (5,439 ha).\n" +
                        "\n" +
                        "The Bangla word ban means forest, and the name Sundarban was coined either from the forests of Sundari tree ie Sundari-ban, or from the forests of the samudra (sea) ie, Samudra-ban, or from its association with the primitive tribe Chandra-bandhe which was corrupted into Sundarban. The generally accepted explanation, however, is its derivation from the sundari tree, the most common tree in these forests.\n" +
                        "\n" +
                        "Geology The tract of the Sundarbans is of recent origin, raised by the deposition of sediments formed due to soil erosion in the Himalayas. The process has been accelerated by tides from the sea face. The substratum consists mainly of Quaternary Era sediments, sand and silt mixed with marine salt deposits and clay. Geologists have detected a southeastern slope and tilting of the Bengal basin during the Tertiary. Because of neo-tectonic movements during the 10th-12th century AD, the Bengal Basin titled eastward. Evidence from borehole studies indicate that while the westernside of the Sundarbans is relatively stable, the southeastern corner is an active sedimentary area and is subsiding.\n" +
                        "\n" +
                        "Soil Soils of the Sundarbans mangrove forest differ from other inland soils in that they are subjected to the effects of salinity and waterlogging, which naturally affect the vegetation. In places soils are semi-solid and poorly consolidated. The pH ranges widely from 5.3 to 8.0. Although the Sundarbans soil is in general medium textured, sandy loam, silt loam or clay loam, the grain size distribution is highly variable. Silt loam is dominant textural class. Sodium and calcium contents of the soil vary from 5.7 to 29.8 meq/100g dry soil and are generally low in the eastern region and higher towards the west. The available potassium content of the soil is low, 0.3-1.3 meq/100g dry soil. Organic matter content varies between 4% and 10% in dry soil. Soil salinity increases from east (slight to moderate) to west (highly saline), but the salinity is not uniform from north to south throughout the forest. ");


            }
            else if(extras.getString("name").equals("Cox’s Bazar")){
                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.coxs));
                areaDescription.setText("Cox’s Bazaar is the tourist capital of Bangladesh. " +
                        "Sloping down to the blue water of the Bay of Bengal against the " +
                        "picturesque backdrop of a series of hills covered with dense forest," +
                        " Cox’s Bazaar sea beach is the" +
                        " longest sea beach in the world. It’s total length is 120km." +
                        "  Located 150 km south of Chittagong, this place got its name from " +
                        "Captain Hiram Cox, an officer of the British East India Company. It is the" +
                        " place of miles of golden sands, lofty cliffs, surfing waves, amazing conch" +
                        " shells, beautiful pagodas, Buddhist temples and tribes and mouth watering" +
                        " sea foods.\n" +
                        "\n" +
                        "The shark-free beach has its own reputation for bathing," +
                        " sunbathing, swimming and surfing. The breathtaking beauty of the setting" +
                        " sun behind the vast sea is fascinating. Visits to the beautiful places like " +
                        "Himchari, Teknaf, Inani Beach, Buddhist temples at Ramu and islands such as " +
                        "Sonadia, St. Martin and Maheshkhali can make your journey memorable.");

            }

            else if(extras.getString("name").equals("The St. Martin’s Island")){

                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.saint));
                areaDescription.setText("The St. Martin’s Island, also known as Narikel Jinjira (an island" +
                        " of coconut) and Daruchinir Deep (an island of cinnamon), is one of the" +
                        " most visited tourist’s spots in Bangladesh. The only coral island in" +
                        " Bangladesh is about 8 km in length and rarely more than 1km wide. It " +
                        "is about 10 km (6mi) south-west of the southern tip of the Cox’s " +
                        "Bazar-Teknaf peninsula. Beaches fringed with coconut palms," +
                        " panoramic beauty of the island and pristine marine life attract the" +
                        " tourists. Magnificent landscapes, crystal clear sea water, coral colony," +
                        " and the roar of the Bay of Bengal are the main attraction of the" +
                        " visitors. ");

            }
            else if(extras.getString("name").equals("Kuakata")){
                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.kuakata));
                areaDescription.setText("kuakata sea beach Known as Sagar Kannya or the Daughter " +
                        "of the sea, Kuakata is famous for its panoramic sea beach. This 18 km " +
                        "long and 3 km wide sea beach is located at Kalapara Police Station of " +
                        "Patuakhali district. Kuakata sea beach about 320 km from Dhaka and 70 km " +
                        "from Patuakhali Sadar. It is a unique place where you can witness both " +
                        "sunrise and sunset unobstructed. This beach is a lovely combination of " +
                        "picturesque natural beauty, blue sky, sandy beach, vast bay, and evergreen jhaubon. Here one can see " +
                        "100 years old Buddhist temple and two wells of about 200 years old.In 1780s Rakhaines settlers came here after being expelled from Arakan (Myanmar) by the Mughals. To collect fresh water, they used to dig wells on the seashore." +
                        " As the Bengali word for “well” is kua, this place got its name Kuakata. ");
            }




            else if(extras.getString("name").equals("Jaflong")){
                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.jaflong));
                areaDescription.setText("Situated at the border between Bangladesh and Indian state Meghalaya, Jaflong is one of the most popular tourist destinations in Sylhet. Overshadowed by subtropical mountains and rain-forests, this place is about 60 km from Sylhet town. This scenic spot is situated on the river Piain. Its landscape beauty among gardens and hills enchants the tourists. The Mari River coming from the Himalayan Mountain range brings tons of stone boulders with its stream. This place is famous for its stone collection activities. It is the home of the Khasi tribe. Tourists come here mainly in winter to see the stone collecting process but during monsoon, Jaflong reveals its different type of beauty with numerous falls cascading from lush green mountains. The amazing beauty of white clouds and gushing waterfalls streaming from the green mountains enthrall locals as well as tourists");
            }





            else if(extras.getString("name").equals("Sajek Valley")){
                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.sajek));
                areaDescription.setText("Sajek Valley is one of the topmost tourist destinations in Bangladesh. Located among " +
                        "the hills of the Kasalong range of Baghaichhari Upazila in the Rangamai" +
                        " District, this place is about 1800 feet above the sea level.  It is" +
                        " known as the queen of hills and roof of Rangamati. Sajek valley is 80" +
                        " km away from Khagrachari town and 90 km northwest from Rangamati town." +
                        " It is only 8 km away from Mizoram, India. It’s lush green, scenic beauty of hills, wilderness, " +
                        "the opportunity of playing with clouds attract the tourists to come here.To enjoy its natural beauty every day thousands of the tourists come here. No word is enough to define the beauty of Sajek Valley. The deep forest, grassland, hilly areas make it a wonderful tourist spot and one of the best choices among the traveler, adventure lover and digital nomads.  At the peak of the valley, you will see the passing clouds around you even you can touch them. This picturesque beauty will make you feel the view of heaven on earth. The curvy hilly roads, small rivers among the hills make this place thrilling. The weather of Sajek changes frequently");
            }




            else if(extras.getString("name").equals("The Shat Gambuj Mosque")){
                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.mosque));
                areaDescription.setText("The Shat Gambuj Mosque is a UNESCO World Heritage Site and one of the topmost Tourist Attraction in Bangladesh. It is one of the largest historical mosques of the Sultanate period. The great Ulugh Khan Jahan established this mosque three miles west of the present Bagerhat town. This serene and imposing monument stands on the eastern back of an enormous sweet-water-tank. The mosque is famous for its sheer size and architectural beauty.\n" +
                        "\n" +
                        "The archaeological elegance of it enthralls the tourists even now. The simple look of this aristocratic structure with its absolute plainness but solid shape reflects the potency and simplicity of its designer. Besides using it as a prayer hall, Ulugh Khan Jahan used the mosque as his assembly hall. Beside this mosque, there is an archaeological museum where you can find different archaeological and historical materials of that time.");
            }




            else if(extras.getString("name").equals("Paharpur")){
                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.paharpur));
                areaDescription.setText("Sompur Mahabihar or Paharpur Buddhist Vihara is one of the largest well known" +
                        " Buddhist Bihar’s in the Indian Subcontinent and one of the most " +
                        "popular tourist destinations in the country." +
                        " This very important archaeological site was designated as a " +
                        "UNESCO World Heritage Site in 1985. The Bihar is located at " +
                        "Paharpur village, Badalgachhi Upazila in Naogaon District. This Buddhist Monastery is famous for its unparalleled architectural design.  The wonderful terracotta plaques of the then musicians, snake charmers, different types ofanimlas are the key attractions to see. The outer walls of the temple are decorated with the lifestyle plaques of ordinary folks of hundreds of years.\n" +
                        "\n" +
                        "From the excavation work and the inscriptions found on the seals, it has been found that Sompur  Mahavihara was built by  the second Pala king Dharmapala (782-821) of Pala Dynasty. Other sources say that it was built by  Dharmapala’s successor Devpala (circa 810-850) after his conquest of Varendra. The monastery got its first renovation work during the reign of Mahipala (circa 995-1043AD). Then in the 11th century, the monastery was destroyed by fire during a conquest by the Vanga army. After about 100 years Vipulashrimitra  rebuilt the Bihar and constructed a temple of Tara. ");
            }



            else if(extras.getString("name").equals("National Memorial")){
                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.na));
                areaDescription.setText("National Martyrs Memorial or Jatiyo Sriti Shoudho is the national monument of Bangladesh, erected as an iconic structure in the memory of those valiant sons and daughters who laid down their lives in the Liberation war of 1971. This monument is situated at Savar, about 35km northwest of Dhaka. Architect Moinul Hossain designed the monument. The whole complex area is of about 84 acres which are surrounded by a green belt of about 24.7 acres. Some mass graves and a water body is located in front of the monument. From the main entrance, visitors get a strong axial view of this structure. To reach to it one has to cross jagged and uneven path and a manmade lake by a bridge that symbolizes the nation’s difficult path to independence and the troublesome journey lies ahead.\n" +
                        "Tourist Attraction in Bangladesh\n" +
                        "\n" +
                        "Visitors can watch this monument from different perspectives and one can enjoy its dramatically differing configurations depending on the viewing location. From the front, the monument appears to be a single structure but in reality, it is composed of seven standing isosceles triangular concrete plates. Each of these plates varies in size and height from others.  The highest plate has a smaller base and the broadest base has the lowest height. These plates are folded in the center at a 90 -degree angle and this unique configuration help this structure to change its configuration when viewed from different angles. This wonderful structure tells the story of a nation’s journey to independence. For its amazingly choreographed architecture, it is considered to be one of the finest monuments in the world. ");
            }

            else if(extras.getString("name").equals("Sonargaon")){
                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.sonargaon));
                areaDescription.setText("Sonargaon or The village of gold was the old capital of Bengal in the medieval period. It was a significant administrative and business center at that time. During the medieval period, it was the mint capital.  From the 13th century, Sonargaon was used as the capital city by different rulers of eastern Bengal. In the mid-13th century, it was the capital of the Hindu Deva dynasty. But after a short time, Muslim rulers acquired it and made it their capital city.\n" +
                        "Tourist Attraction in Bangladesh\n" +
                        "\n" +
                        "First it was ruled by independent rulers and then it became a subsidiary capital of the Bengal Sultanate and then Delhi Sultanate. Then it was acquired by the Mughals.   It lost its pride of being the capital in 1610 when the Mughals shifted the capital of Bengal to Jahangirnagar which was later named Dhaka. During the British period, wealthy Hindu merchants settled a new neighborhood named Panam city near Sonargaon.\n" +
                        "\n" +
                        "Most of the Hindu and Mughal structures are ruined but some of the structures built in the British period are still present today. Very little trace of the original capital now remains in Sonargaon. Now, most of the tourists visit Sonargaon to see Panam Nagar, A decaying street with some decayed edifices by wealthy Hindu merchants and Sardar Bari a beautifully renovated king’s palace with a gorgeous pond and amazing folk-art museum. ");


            }

           // setUp(areaName,areaLocation);

        }
    }




}

package com.mostoles.cdp.pruebareciclye

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dramaList: ArrayList<Drama>
    private lateinit var dramaAdapter: DramaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this)

        dramaList = ArrayList()

        dramaList.add(Drama(R.drawable.boysoverflower,"Torre Eiffel"," inicialmente llamada Tour de 300 mètres (Torre de 300 metros) es una estructura de hierro pudelado diseñada inicialmente por los ingenieros civiles Maurice Koechlin y Émile Nouguier y construida, tras el rediseño estético de Stephen Sauvestre, por el ingeniero civil francés Gustave Eiffel y sus colaboradores para la Exposición Universal de 1889 en París."))
        dramaList.add(Drama(R.drawable.tjml,"Taj Mahal ","El Taj Mahal \u200B\u200B es un monumento funerario construido entre 1632 y 1654 en la ciudad de Agra, estado de Uttar Pradesh, a orillas del río Yamuna, por el emperador musulmán Shah Jahan de la dinastía mogol."))
        dramaList.add(Drama(R.drawable.lmchina,"La Gran Muralla","La Gran Muralla china es una antigua fortificación china,1\u200B construida y reconstruida entre el siglo v a. C. y el siglo xvi para proteger la frontera norte del Imperio chino durante las sucesivas dinastías imperiales de los ataques de los nómadas xiongnu de Mongolia y Manchuria."))
        dramaList.add(Drama(
            R.drawable.libertad,"\n" +
                "Estatua de la Libertad","La Libertad iluminando el mundo, más conocida como la Estatua de la Libertad, es uno de los monumentos más famosos de Nueva York, de los Estados Unidos y de todo el mundo. Se encuentra en la isla de la Libertad al sur de la isla de Manhattan, junto a la desembocadura del río Hudson y cerca de la isla Ellis."))
        dramaList.add(Drama(R.drawable.sidney,"Ópera de Sídney","La Ópera de Sídney, situada en la ciudad de Sídney, estado de Nueva Gales del Sur, Australia, es uno de los edificios más famosos y distintivos del siglo XX. Declarado en 2007 Patrimonio de la Humanidad, fue diseñado por el arquitecto danés Jørn Utzon en 1957 e inaugurado el 20 de octubre de 1973."))
        dramaList.add(Drama(R.drawable.lincon,"Lincoln Memorial","El Monumento a Lincoln (Lincoln Memorial en inglés), situado en uno de los extremos horizontales del National Mall de Washington D. C., Estados Unidos, es un monumento conmemorativo creado para honrar la memoria del presidente Abraham Lincoln. El edificio tiene forma de templo griego dórico, y tiene una gran escultura de Abraham Lincoln sentado e inscripciones de dos conocidos discursos de Lincoln. "))
        dramaList.add(Drama(R.drawable.notredame,"Notre Dame","La catedral de Notre Dame (en francés: Cathédrale Notre-Dame, lit. Catedral de Nuestra Señora) es una catedral de culto católico, sede de la archidiócesis de París, la capital de Francia. Dedicada a la Virgen María, madre de Jesucristo, se sitúa en la pequeña isla de la Cité, rodeada por las aguas del río Sena. Es uno de los monumentos más populares de la capital francesa."))
        dramaList.add(Drama(R.drawable.coliseo,"Coliseo","El Coliseo o Anfiteatro Flavio \u200B es un anfiteatro de la época del Imperio romano, construido en el siglo I. Está ubicado en el este del Foro Romano, y fue el más grande de los que se construyeron en el Imperio romano. "))
        dramaList.add(Drama(R.drawable.saint,"Mont Saint Michel ","Monte Saint-Michel es una comuna francesa situada en el departamento de Mancha, de la región de Normandía que incluye tanto una porción de territorio continental como el famoso Monte Saint-Michel. "))
        dramaList.add(Drama(R.drawable.alhambra,"La Alhambra","La Alhambra es un complejo monumental sobre una ciudad palatina andalusí situado en Granada, España. Consiste en un conjunto de antiguos palacios, jardines y fortalezas (alcazaba, del árabe: القصبة al-qaṣbah ‘ciudadela’) inicialmente concebido para alojar al emir y la corte del Reino Nazarí, más tarde como residencia de los reyes de Castilla y de sus representantes. Su singularidad artística radica en los interiores de los palacios nazaríes, cuya decoración está entre las cumbres del arte andalusí, así como en su localización y adaptación, que generó un paisaje nuevo pero totalmente integrado con la naturaleza preexistente."))
        dramaList.add(Drama(R.drawable.piramide,"Pirámides de Giza","La Gran Pirámide de Guiza es, además de la mayor de las pirámides de Egipto, la más antigua de las siete maravillas del mundo antiguo y la única que todavía perdura. Fue ordenada a construir por el faraón Keops de la cuarta dinastía del Antiguo Egipto. "))
        dramaList.add(Drama(R.drawable.bridge,"Golden Gate ","El puente Golden Gate es un puente colgante situado en California, Estados Unidos; que une la península de San Francisco por el norte con el sur del condado de Marin, cerca de Sausalito."))
        dramaList.add(Drama(R.drawable.redentor,"Cristo Redentor","El Cristo Redentor o Cristo del Corcovado es una estatua art déco que representa a Jesús de Nazaret, con los brazos abiertos, mostrando a la ciudad de Río de Janeiro, Brasil. La estatua tiene una altura de treinta metros sobre un pedestal de ocho metros.\u200B\u200B"))
        dramaList.add(Drama(R.drawable.acropolis,"Acrópolis","Con la intención de disponer de una mejor defensa, los primitivos pobladores emplazaban sus asentamientos en elevaciones naturales del terreno, preferiblemente con bordes escarpados \u200B Con el tiempo, esta zona elevada se convertía en el núcleo a partir del cual iba desarrollándose el crecimiento urbano. Así nacieron ciudades como Atenas o Esparta, la cual fue resultado de la unificación de siete poblados ubicados en sus respectivas colinas. Debido a la situación privilegiada, las acrópolis solían albergar los edificios más emblemáticos, como templos, y en ellas se reunían las personalidades de la ciudad o se celebraban actos importantes, los ciudadanos podían refugiarse en ella en caso de peligro."))
        dramaList.add(Drama(R.drawable.itza,"Chichén Itzá ","Chichén Itzá (del maya yucateco: Chiꞌ Chꞌeꞌen Its Jaꞌ ‘Boca del pozo de los brujos del agua’)1\u200B es uno de los principales sitios arqueológicos mayas de la península de Yucatán, en México. Se encuentra a escasos 2.5 km de la localidad de Pisté, en el municipio de Tinum, en el estado de Yucatán, al sureste del país. Consistió en una ciudad o un centro ceremonial que pasó por diversas épocas constructivas e influencias de los distintos pueblos que la ocuparon y que la impulsaron desde su fundación."))
        dramaList.add(Drama(R.drawable.roja,"Plaza Roja","La plaza Roja (en ruso Красная площадь, Krásnaya plóshchad') es la plaza más famosa de Moscú en el barrio comercial conocido como Kitay-górod. Posee 330 m de longitud y 70 m de ancho, sumando una superficie de 23 100 m²."))
        dramaList.add(Drama(R.drawable.ben,"Big Ben","Big Ben es el nombre con el que se conoce a la gran campana del reloj situado en el lado noroeste del Palacio de Westminster, la sede del Parlamento del Reino Unido, en Londres.\u200B Popularmente, por extensión, se utiliza también este nombre para el reloj de la torre."))
        dramaList.add(Drama(R.drawable.petra,"Petra ","Petra (en griego antiguo, Πέτρα, en árabe, البتراء, al-Batrā´) es un importante enclave arqueológico en Jordania y la capital del antiguo reino nabateo, cuyos pobladores la llamaban Raqmu (en árabe nabateo: الرقيم).1\u200B El nombre de Petra proviene del griego πέτρα, que significa piedra,el asentamiento de Petra se localiza en un valle angosto, al este del valle de la Aravá que se extiende desde el mar Muerto hasta el Golfo de Aqaba. Los restos más célebres de Petra son sin duda sus construcciones labradas en la misma roca del valle (hemispeos), en particular, los edificios conocidos como el Khazneh (‘el Tesoro’) y el Deir (‘el Monasterio’)."))
        dramaList.add(Drama(R.drawable.pedro,"Basílica de San Pedro","La basílica papal de San Pedro, conocida comúnmente como basílica de San Pedro, es un templo católico situado en la Ciudad del Vaticano. La basílica cuenta con el mayor espacio interior de una iglesia cristiana en el mundo, \u200B presenta 193 m de longitud, 44,5 m de altura, y abarca una superficie de 2,3 hectáreas."))

        dramaAdapter = DramaAdapter(dramaList)
        recyclerView.adapter= dramaAdapter
        dramaAdapter.onItemClick={
            val intent= Intent(this, Detalle::class.java)
            intent.putExtra("drama", it)
            startActivity(intent)
        }
    }
}
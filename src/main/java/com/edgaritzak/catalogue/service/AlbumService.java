package com.edgaritzak.catalogue.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.edgaritzak.catalogue.model.Album;

@Service
public class AlbumService {
	
	List<Album> albumList = new ArrayList<Album>();	
	
	public AlbumService() {
		albumList.add(new Album("新しい日の誕生", "2814", "Dreampunk", 2015, "/images/a0274520166_10.jpg","https://2814.bandcamp.com/album/birth-of-a-new-day"));
		albumList.add(new Album("2814", "2814", "Dreampunk", 2014, "/images/a4040760086_10.jpg","https://2814.bandcamp.com/album/2814"));
		albumList.add(new Album("Rain Temple", "2814", "Dreampunk", 2016, "/images/a2072876809_10.jpg","https://2814.bandcamp.com/album/rain-temple"));
		albumList.add(new Album("we could die here", "we could die here", "Ambient", 2018, "/images/a1740364494_10.jpg","https://bludhoney.bandcamp.com/album/we-could-die-here"));
		albumList.add(new Album("小​圈​子", "輕描淡寫", "Dark Ambient", 2017, "/images/a0622182274_10.jpg","https://qingmiaodanxie.bandcamp.com/album/-"));
		albumList.add(new Album("HK", "HKE", "Dreampunk", 2015, "/images/a1098892932_10.jpg","https://dreamcatalogue.bandcamp.com/album/hk"));
		albumList.add(new Album("Walking To Heartbreak", "Remember", "Dreampunk", 2015, "/images/a0701944800_10.jpg","https://remember48.bandcamp.com/album/walking-to-heartbreak"));
		albumList.add(new Album("Route Back Home", "Remember", "Dreampunk", 2015, "/images/a1333916174_10.jpg","https://remember48.bandcamp.com/album/route-back-home"));
		albumList.add(new Album("Until", "Sangam", "Ambient, Dreampunk", 2016, "/images/a0884693048_16.jpg","https://seaovclouds.bandcamp.com/album/until"));
		albumList.add(new Album("Distance Amongst Us", "Sangam", "Ambient", 2017, "/images/a3137090358_10.jpg","https://kudatah.bandcamp.com/album/distance-amongst-us"));
		albumList.add(new Album("You Forget This", "Sangam", "Ambient", 2016, "/images/a2755728874_10.jpg","https://dreamcatalogue.bandcamp.com/album/you-forget-this"));
		albumList.add(new Album("Goner", "Sangam", "Ambient", 2018, "/images/a3277141062_10.jpg","https://hellscaperecords.bandcamp.com/album/goner"));
		albumList.add(new Album("Pop", "Gas", "Ambient", 2016, "/images/a3083601247_10.jpg","https://kompakt-gas.bandcamp.com/album/pop"));
		albumList.add(new Album("For Life", "CMD094 X Sangam", "Dreampunk", 2019, "/images/a3443236544_10.jpg","https://cmd094music.bandcamp.com/album/for-life"));
	}
	
	public List<Album> getAlbumList(){
		return albumList;
	}
	public List<Album> getAlbumsByArtist(List<Album> allAlbums, String artistName){
		List<Album> albumsbyArtist = new ArrayList<>();
		return albumsbyArtist;
	}
	public List<Album> getAlbumsByCategory(List<Album> allAlbums, String category){
		List<Album> albumsbyCategory = new ArrayList<>();
		return albumsbyCategory;
	}
	
	
	
}

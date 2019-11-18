package csce247.assignments.iterator;
//noah snell

public class Album {
	static final int MAX_SONGS = 20;
	private Song[] songs;
	private int count;
	private String name;
	
	/**
	 * sets the max limit of songs as well as the name of the album
	 * @param name is the name of the album
	 */
	public Album(String name) {
		songs = new Song[MAX_SONGS];
		this.name = name;
	}
	
	
	/**
	 * adds a song to the list of songs
	 * @param name is the name of the song
	 * @param artist is the artist of the song
	 * @param length is the duration of the song
	 * @param genre is the type of song
	 */
	public void addSong(String name, String artist, double length, String genre) {
		songs[count] = new Song(name, artist, length, genre);
		count++;
	}
	
	/**
	 *  starts the album iterator
	 */
	public AlbumIterator createIterator() {
		return new AlbumIterator(songs);
	}
}

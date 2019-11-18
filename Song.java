package csce247.assignments.iterator;
//noah snell

public class Song {
	private String name, artist, genre;
	private double length;
	
	/**
	 * sets the song values equal to the values coming in
	 * @param name is the name of the song
	 * @param artist is the artist of the song
	 * @param length is the length of the song
	 * @param genre is the genre of the song
	 */
	public Song(String name, String artist, double length, String genre) {
		this.name = name;
		this.artist = artist;
		this.length = length;
		this.genre = genre;
	}

	/**
	 * prints the data values of song
	 */
	public void print() {
		System.out.print(this.name + " by ");
		System.out.print(this.artist + " category: ");
		System.out.print(this.genre + " length: ");
		System.out.println(this.length + " mins");
	}



}

package csce247.assignments.iterator;
//noah snell

public class AlbumIterator implements Iterator {
	
	private Song[] song;
	private int position = 0;
	/**
	 * constructor that sets the song coming in as the main song for the class
	 * @param song is the current song being used
	 */
	public AlbumIterator(Song[] song) {
		this.song = song;
	}

	/**
	 * moves to the next song using position
	 */
	public Song next() {
		Song nextSong = song[position];
		position = position + 1;
		return nextSong;
	}
	
	/**
	 * basic boolean class that checks if there is another song using position
	 */
	public boolean hasNext() {
		if(position >= song.length || song[position] == null) {
			return false;
		} else {
			return true;
		}
	}

}
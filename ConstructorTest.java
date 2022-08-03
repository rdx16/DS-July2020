
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Songs songObj1 = new Songs(1, "Shoorveer", "RapperyaBalam", "Patriotic", "Vinod", "Shivaji", 1000000);
		 System.out.println("Songs "+songObj1);
	}

}

class Songs
{
	private int songFavouriteSequece;
	private String songName;
	private String songArtist;
	private String songGenere;
	private String songComposer;
	private String songCast;
	private int songHits;
	
	
	public Songs(int songFavouriteSequece, String songName, String songArtist, String songGenere, String songComposer,
			String songCast, int songHits) {
		super();
		this.songFavouriteSequece = songFavouriteSequece;
		this.songName = songName;
		this.songArtist = songArtist;
		this.songGenere = songGenere;
		this.songComposer = songComposer;
		this.songCast = songCast;
		this.songHits = songHits;
	}


	@Override
	public String toString() {
		return "Songs [songFavouriteSequece=" + songFavouriteSequece + ", songName=" + songName + ", songArtist="
				+ songArtist + ", songGenere=" + songGenere + ", songComposer=" + songComposer + ", songCast="
				+ songCast + ", songHits=" + songHits + "]";
	}
	
	
}
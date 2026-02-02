interface MediaPlayer{
	public void play();
}
class MusicPlayer implements MediaPlayer{
	public void play(){
		System.out.println("Playing music...");
	}
}
class VideoPlayer implements MediaPlayer{
	public void play(){
		System.out.println("Playing video...");
	}
}

class MainClass3{
	public static void main(String[] args){
		MediaPlayer myMusicPlayer = new MusicPlayer();
		MediaPlayer myVideoPlayer = new VideoPlayer();
		
		myMusicPlayer.play();
		myVideoPlayer.play();
	}
}
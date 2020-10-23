package oops.interfaces;

import oops.abstraction.VideoEditor;

public abstract interface Youtuber extends VideoEditor {
	
	abstract void makeVideo();
	
	
	//added after java 8
	default void uploadVideo() {
		System.out.println("upload the video");
	}

}

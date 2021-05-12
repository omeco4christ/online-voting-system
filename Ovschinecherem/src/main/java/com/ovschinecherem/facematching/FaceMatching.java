package com.ovschinecherem.facematching;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class FaceMatching {
	
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		System.out.println("Done");
		
		String imgFile = "images/messivsronaldo.png";
		
		Mat src = Imgcodecs.imread(imgFile);
		
	}
}

package org.sample;

public class Sample {
	public int solution(String direction, int radius, int[] X, int[] Y) {
		int count=0;
		switch (direction) {
		case "U":
			for(int i=0;i<X.length;i++) {
				double z=180*(Math.atan2(X[i],Y[i]))/(Math.PI);
				double r=Math.sqrt((X[i]*X[i])+(Y[i]*Y[i]));
				if(r<=radius && (z<=45 && z>=-45)){
					count++;
				}
			}
			break;
			
			
		case "R":
			for(int i=0;i<X.length;i++) {
				double z=180*(Math.atan2(X[i],Y[i]))/(Math.PI);
				double r=Math.sqrt((X[i]*X[i])+(Y[i]*Y[i]));
				if(r<=radius && (z<=135 && z>=45)){
					count++;
				}
			}
			break;
			
			
		case "D":
			for(int i=0;i<X.length;i++) {
				double z=180*(Math.atan2(X[i],Y[i]))/(Math.PI);
				double r=Math.sqrt((X[i]*X[i])+(Y[i]*Y[i]));
				if(r<=radius && ((z<=180 & z>=135) || (z<=-135 & z>=-180))){
					count++;
				}
			}
			break;
			
		case "L":
			for(int i=0;i<X.length;i++) {
				double z=180*(Math.atan2(X[i],Y[i]))/(Math.PI);
				double r=Math.sqrt((X[i]*X[i])+(Y[i]*Y[i]));
				if(r<=radius && (z<=-45 && z>=-135)){
					count++;
				}
			}
			break;
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

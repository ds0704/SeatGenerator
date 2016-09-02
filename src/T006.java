

public class T006 {
	
	public char[] indexGenerator() {
		char[] index = new char[26];
		char a = 'A';
		int i = 0;
		for(a ='A'; a <= 'Z'; a++) {
			a=(char)(a);
			index[i] = a;	
			i++;
		}
		
		return index;
	}
	public void plex1(String startTime) {
		char index[] = indexGenerator();
		int i = 0;
		int j = 0;
		for(i=0; i < 11; i++) {
			for(j = 0; j < 13; j++){
				if(i < 3) {
					if(j < 12) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','1','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','1','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 2) {
					if(j < 12) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','1','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','1','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else {
					if(j < 12) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','1','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','1','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				}
			}
		}
	}
	
	public void plex2(String startTime) {
		char index[] = indexGenerator();
		int i = 0;
		int j = 0;
		for(i=0; i < 14; i++) {
			for(j = 0; j < 17; j++){
				if(i < 2) {
					if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 3) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 5) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 7) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 9) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 17) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 19) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 10) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','sweetbox','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 17) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 19) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else {
					if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 19) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','2','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				}
			}
		}	
			
	}
	
	public void plex3(String startTime) {
		char index[] = indexGenerator();
		int i = 0;
		int j = 0;
		for(i=0; i < 11; i++) {
			for(j = 0; j < 20; j++){
				if(i < 1) {
					if(j < 1) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 2){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','handicapped','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 4){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 15){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','economy ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 17){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 18){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','handicapped ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 2) {
					if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 17){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 19){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','economy ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 3) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 15){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','standard ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 17){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 19){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','economy ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 5) {
					if(j < 5) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 17){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 19){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','standard ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 7) {
					if(j < 5) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 17){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 19){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','standard ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 9) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 15){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','prime ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 17){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 19){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','standard ','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 10) {
					if(j < 2){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','sweetbox','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 17) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 19) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else {
					if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 19) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','3','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				}
			}
		}
		
	}
	
	public void plex4(String startTime) {
		char index[] = indexGenerator();
		int i = 0;
		int j = 0;
		for(i=0; i < 11; i++) {
			for(j = 0; j < 18; j++){
				if(i < 1) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 13) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 16) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','handicapped','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 2) {
					if(j < 13) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 16) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','handicapped','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 3) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 13) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 17) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 5) {
					if(j < 12) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 7) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 12) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 9) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 13) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 17) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 10) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 12) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','sweetbox','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 15) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 17) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 13) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 17) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','4','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				}
			}
		}
		
	}
	
	public void plex5(String startTime) {
		char index[] = indexGenerator();
		int i = 0;
		int j = 0;
		for(i=0; i < 13; i++) {
			for(j = 0; j < 21; j++){
				if(i < 1) {
					if(j < 1) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 6){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 19){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','handicapped','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 2) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 6){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 20){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 3) {
					if(j < 1) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 6){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 20){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','economy','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 5) {
					if(j < 5) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 20){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				}  else if(i < 6) {
					if(j < 5) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 19){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 7) {
					if(j < 5) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 19){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 8) {
					if(j < 6) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 20){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 9) {
					if(j < 2) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 4){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 6){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 20){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 10) {
					if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 6){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 20){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','standard','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else if(i < 12) {
					if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 6){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 20){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','prime','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				} else {
					if(j < 4) {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','sweetbox','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					} else if(j < 6){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 14){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','sweetbox','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 16){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else if(j < 20){
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','sweetbox','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");					
					} else {
						System.out.println("Insert into YZR.SEAT (THEATER_ID,PLEX_NUMBER,SEAT_TYPE,SEAT_INDEX,SEAT_NUMBER,RESERVATION_EXIST,START_TIME) values ('T006','5','empty','" + index[i] +"','" + (j+1) + "','0','" + startTime + "');");
					}
				}
			}
		}
		
	}
}

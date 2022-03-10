package practices;

public class ArrayFundamentals {
		public static void main(String[] args)
		{
			//float[] raceCompletion = new float[16];
			float[] raceCompletion={
				10.5f,
				5.2f,
				5.2f,
				6.0f,
				5.2f,
				5.2f,
				5.2f,
				5.2f,
				5.2f,
				5.1f,
				5.2f,
				5.2f,
				4.9f,
				5.2f,
				5.2f,
				5.6f
			};

			//raceCompletion[0]=10.5f;
			//raceCompletion[1]=5.2f;
			//raceCompletion[2]=5.2f;
			//raceCompletion[3]=6.0f;
			//raceCompletion[4]=5.2f;
			//raceCompletion[5]=5.2f;
			//raceCompletion[6]=5.2f;
			//raceCompletion[7]=5.2f;
			//raceCompletion[8]=5.2f;
			//raceCompletion[9]=5.1f;
			//raceCompletion[10]=5.2f;
			//raceCompletion[11]=5.2f;
			//raceCompletion[12]=4.9f;
			//raceCompletion[13]=5.2f;
			//raceCompletion[14]=5.2f;
			//raceCompletion[15]=5.6f;
			
			fastestStudent(raceCompletion);

			
		}
		static void fastestStudent(float[] raceCompletion)
		{
			float fastest=raceCompletion[0];
			int student=0;
			for(int i=0; i<raceCompletion.length;i++)
			{
				//System.out.println("student " +(i+1)+ " completed running in "+raceCompletion[i]+" seconds.");
				
				if(fastest>raceCompletion[i])
				{
					fastest=raceCompletion[i];
					student=i;
				}

			}
			System.out.println("Student "+(student+1)+" completed race fastest in "+fastest+" seconds.");
		}
	}



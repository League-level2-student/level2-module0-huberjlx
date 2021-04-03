import java.util.Random;

int [] intArray;
void setup() {
  size(400, 500);
  intArray = new int[width];
  Random rand = new Random();
  for (int j = 0; j < intArray.length; j++) {
     intArray[j] = rand.nextInt(height);
  }
  noStroke();
}

void draw() {
  background(#1529D3);
  fill(81, 240, 34);
  for (int i = 0; i < intArray.length; i++) {

      rect(i, height - intArray[i], 1, 1);                            
  }  
  if (mousePressed == true) {
  stepSort(intArray);
}       
}

                                              
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}

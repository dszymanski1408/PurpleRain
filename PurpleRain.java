// Purple Rain 
// (138, 43, 226)
// (230, 230, 250) // background

Drop[] drops = new Drop[600];

void setup(){
  size(700, 400);
  for(int i = 0; i < drops.length; i++){
      drops[i] = new Drop();
  }
}

void draw(){
  background(230, 230, 250);
  for(int i = 0; i < drops.length; i++){
      drops[i].show();
      drops[i].fall();
  }
}

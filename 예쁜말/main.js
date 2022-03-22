var canvas = document.getElementById('canvas');
var ctx = canvas.getContext('2d');

canvas.width = window.innerWidth - 100;
canvas.height = window.innerHeight - 100;

var snail = {
  x : 10,
  y : 200,
  width : 50,
  height : 50,
  drow(){
    ctx.fillStyle = 'green';
    ctx.fillRect(this.x, this.y, this.width, this.height);
  }
}

var snail2 = {
  x : 10,
  y : 300,
  width : 50,
  height : 50,
  drow(){
    ctx.fillStyle = 'blue';
    ctx.fillRect(this.x, this.y, this.width, this.height);
  }
}

snail.drow();
snail2.drow();

var play = 0;
var set_meter = 1000;
var set_speed = 4;
var set_number = 2;

function start(){
  requestAnimationFrame(start);
  rand=Math.floor(Math.random()*100%set_speed);
  rand2=Math.floor(Math.random()*100%set_speed);
  snail.x += rand;
  snail2.x += rand2;
  snail.drow();
  snail2.drow();
}

// function start(){
//   play=1;
//
//   for(i=1;i<=set_number;i++){
//       //자 다왔으면 등수를 매기자~
//       if(document.all['m['+i+']'].value>=set_meter && document.all['r['+i+']'].value == 0){document.all['r['+i+']'].value=cnt; cnt++;}
//       //다안왔으면
//       if(document.all['m['+i+']'].value<set_meter){
//           //랜덤값만큼
//           rand=Math.floor(Math.random()*100%set_speed);
//           //움직이자구~
//           document.all['m['+i+']'].value=(document.all['m['+i+']'].value*1+rand);
//           document.all['bar['+i+']'].width=document.all['m['+i+']'].value;
//       }
//   }
//
//   if(cnt==set_number+1) raceend();
//   else LQtime=setTimeout("racing()",10);
// }

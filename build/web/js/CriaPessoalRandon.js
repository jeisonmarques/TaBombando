function generateRandomPoints(data) {
  var points = [];
  for (var i=0; i< data.qtd; i++) {
    points.push(generateRandomPoint(data));
  }
  return points;
}
function generateRandomPoint(data) {
  var x0 = data.lng;
  var y0 = data.lat;

  var rd = data.raio/111300;

  var u = Math.random();
  var v = Math.random();

  var w = rd * Math.sqrt(u);
  var t = 2 * Math.PI * v;
  var x = w * Math.cos(t);
  var y = w * Math.sin(t);

  var xp = x/Math.cos(y0);

  return {'lat': y+y0, 'lng': xp+x0};
}

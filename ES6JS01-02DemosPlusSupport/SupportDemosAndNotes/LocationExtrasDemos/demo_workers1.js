/**
 * @author Sony
 */

var i = 0;

function timedCount() {
	i = i + 10;
	postMessage(i);
	setTimeout("timedCount()", 1500);
}

timedCount();

var node_list = document.getElementsByTagName("LI");
var a;

for (a = 0; a < node_list.length; a++)
{
  var sp = document.createElement("SPAN");
  var text = document.createTextNode("\u00D7");

  sp.className = "close";
  sp.appendChild(text);
  node_list[a].appendChild(sp);

}

var cls = document.getElementsByClassName("close");
var a;

for(a = 0; a < cls.length; a++)
{
  cls[a].onclick = function() 
  {
    var d = this.parentElement;
    d.style.display = "none";
  }
}

var lst = document.querySelector('ul');
lst.addEventListener('click', function(ev) {
  if (ev.target.tagName == 'li') {
    ev.target.classList.toggle('checked');
  }
}, false);

function new_element() 
{
  var list = document.createElement("li");
  var input_val = document.getElementById("myInput").value;
  var t = document.createTextNode(input_val);

  list.appendChild(t);

  if (input_val === '')
  {
    alert("You must write something!");
  }
  else
  {
    document.getElementById("myUnordered").appendChild(list);
  }

  document.getElementById("myInput").value = "";

  var sp = document.createElement("SPAN");
  var text = document.createTextNode("\u00D7");

  sp.className = "close";
  sp.appendChild(text)
  list.appendChild(sp)

  for(a = 0; a < cls.length; a++)
  {
    cls[a].onclick = function () 
    {
      var dv = this.parentElement;
      dv.style.display = "none";  
    }
  }
}

function allowDrop(ev) 
{
  ev.preventDefault();
}

function drag(ev) 
{
  ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev) 
{
  ev.preventDefault();
  var data = ev.dataTransfer.getData("text");
  ev.target.appendChild(document.getElementById(data));
}

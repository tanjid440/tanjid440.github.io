window.onload = init;

document.onkeydown = function (t) {
   if(t.which == 9){ return false;}
}

function init() {
    textarea = document.getElementById("code");
    iframe = document.getElementById("view");
    textarea.value = `<html>
<head>
    <title>CODE IT</title>
    <style>
        <!-- CSS CODE GOES HERE -->
    </style>
    <script>
        <!-- JAVASCRIPT CODE GOES HERE -->
    </script>
</head>
<body>

<h1 align="center">Hello World!</h1>





</body>
</html>

`;
    refresh();
}

function refresh() {
    iframe.srcdoc = textarea.value;
}

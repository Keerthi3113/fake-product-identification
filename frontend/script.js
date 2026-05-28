function checkProduct() {

    const product = {
        productName: document.getElementById("name").value,
        brand: document.getElementById("brand").value,
        productCode: document.getElementById("code").value,
        seller: document.getElementById("seller").value
    };

    fetch("http://localhost:8080/verify", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(product)
    })
    .then(res => res.text())
    .then(data => {
        document.getElementById("result").innerText = data;
    });
}


// QR SCANNER
function startScan() {

    const html5QrCode = new Html5Qrcode("reader");

    Html5Qrcode.getCameras().then(devices => {

        const cameraId = devices[0].id;

        html5QrCode.start(
            cameraId,
            { fps: 10, qrbox: 250 },
            (decodedText) => {

                document.getElementById("code").value = decodedText;
                document.getElementById("scanResult").innerText =
                    "Scanned: " + decodedText;

                html5QrCode.stop();
            }
        );

    });
}
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

    document.getElementById("result").innerHTML = `

    <h3 style="color:green;">✔ Verification Completed</h3>

    <hr>

    <p><b>Product Name :</b> ${product.productName}</p>

    <p><b>Brand :</b> ${product.brand}</p>

    <p><b>Product Code :</b> ${product.productCode}</p>

    <p><b>Seller :</b> ${product.seller}</p>

    <hr>

    <h2>${data}</h2>

    <hr>

    <p>
    This verification is performed using product information
    entered by the user.
    </p>

    `;
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
localStorage.clear();
let cart = JSON.parse(localStorage.getItem("cart")) || [];
let total = 0;

// Page load
window.onload = function () {
    displayCart();
};

function addToCart(name, price, image) {

    let existingItem = cart.find(item => item.name === name);

    if (existingItem) {
        // 🔥 safe quantity update
        existingItem.quantity = (existingItem.quantity || 1) + 1;
    } else {
        cart.push({ name, price, image, quantity: 1 });
    }

    saveCart();
    displayCart();
}

// ➕ Increase quantity
function increaseQty(index) {
    cart[index].quantity = (cart[index].quantity || 1) + 1;
    saveCart();
    displayCart();
}

// ➖ Decrease quantity
function decreaseQty(index) {
    if ((cart[index].quantity || 1) > 1) {
        cart[index].quantity--;
    } else {
        cart.splice(index, 1);
    }
    saveCart();
    displayCart();
}

// ❌ Remove item
function removeFromCart(index) {
    cart.splice(index, 1);
    saveCart();
    displayCart();
}

// 🗑 Clear cart
function clearCart() {
    cart = [];
    saveCart();
    displayCart();
}

// 💾 Save data
function saveCart() {
    localStorage.setItem("cart", JSON.stringify(cart));
}

// 🧠 Display cart
function displayCart() {
    const cartList = document.getElementById("cart");
    cartList.innerHTML = "";

    total = 0;

    // 🛡 Empty cart check
    if (!cart || cart.length === 0) {
        cartList.innerHTML = "Cart is empty 🛒";
        document.getElementById("total").textContent = 0;
        return;
    }

    cart.forEach((item, index) => {
        const qty = item.quantity || 1;
        const price = item.price || 0;

        total += price * qty;

        const li = document.createElement("li");

        li.innerHTML = `
            <img src="${item.image}">
            ${item.name} - ₹${price}

            <button onclick="decreaseQty(${index})">➖</button>
            ${qty}
            <button onclick="increaseQty(${index})">➕</button>

            = ₹${price * qty}

            <button onclick="removeFromCart(${index})">❌</button>
        `;

        cartList.appendChild(li);
    });

    document.getElementById("total").textContent = total;
}
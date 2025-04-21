function openPopup(title, description) {
  document.getElementById('popup-title').innerText = title;
  document.getElementById('popup-description').innerText = description;
  document.getElementById('popup').style.display = 'flex';
}

function closePopup() {
  document.getElementById('popup').style.display = 'none';
}
Feature: Automation Practice

  Yo como usuario de Automation Practice
  Quiero poder agregar productos al carrito y revisar que hayan sido agregados correctamente
  para realizar compras por internet

Scenario: agregar productos al carrito
  Given que leidy quiere realizar una compra
  When busca el producto dress y lo agrega al carrito
  Then se visualiza el mensaje Product successfully added to your shopping cart

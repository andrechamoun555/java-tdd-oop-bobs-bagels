
---
# Domain Model – Bob’s Bagels

| Class | Fields                                                        | Methods                          | What it does                                     | Return values     |
|--|----------------------------------------------------------------|----------------------------------|--------------------------------------------------|-------------------|
| **Inventory** | `static Map<String, ItemInfo> items`                           | `has(sku): boolean`              | If given SKU exists in inventory                 | `true` otherwise `false` if not exist |
|  |                               | `priceOf(sku): double`           | Looks up price of given SKU                      | `double`          |
|  |                               | `typeOf(sku): String`            | Tells which type of item                         | `String`          |
|  |                               | `nameOf(sku): String`            | Which name the SKU has                           | `String`          |
|  |                               | `variantOf(sku): String`         | Which variant --> Onion, ham, latte              | `String`          |
|  |                               | `allSkus(): ArrayList<String>`   | List all SKU                                     |  `ArrayList<String>` |
| **ItemInfo**  | `price: double`<br>`type: String`<br>`name: String`<br>`variant: String`    |                                  | container for SKU --> type, price, name, variant |                |
| **BasketEntry** | `sku: String`<br>`qty: int`                                                | `inc(n): void`                   | Increases quantity                               | `void`         |
|  |                                                 | `dec(n): void`                   | Decreases quanitiy                               | `void`         |
|  |                                             | `lineTotal(): double`            | Calculate sum                                    | `double`       |
| **Basket**    | `capacity: int`<br>`entries: ArrayList<BasketEntry>`                        | `add(sku): String`               | Tries to add item                                | `String` |
|     |                          | `remove(sku): String`            | Removes one item                                 | `String` |
|     |                         | `isFull(): boolean`              | Check if basket is full                          |  `boolean` |
|     |                         | `setCapacity(newCap: int): void` | Change capacity (manager)                        |  `void` |
|     |                         | `total(): double`                | Sums up all the cost (call linetotal())          | `void` |
|     |                         | `checkPrice(sku): double`        | Looks up price                                   |`double` |





---

## User Stories

1. **Add bagel to basket**
2. **Remove bagel from basket**
3. **Know when basket is full**
4. **Manager changes basket capacity**
5. **Remove non-existent item shows message**
6. **Total cost of basket**
7. **Cost of item before adding**
8. **Choose fillings for bagel**
9. **Know cost of fillings**
10. **Only order things in stock**

---

---
title: Collection - ksonbin
---

[ksonbin](../../index.html) / [in.zeromod.ksonbin.api](../index.html) / [Collection](./index.html)

# Collection

`class Collection`

### Constructors

| [&lt;init&gt;](-init-.html) | `Collection(ksonbin: `[`Ksonbin`](../../in.zeromod.ksonbin/-ksonbin/index.html)`)` |

### Functions

| [create](create.html) | Using the COLLECTIONS CREATE API, you can CREATE Collections to group the records which later, can be fetched usin the Query Builder.`suspend fun create(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`CollectionCreate`](../-collection-create/index.html) |
| [update](update.html) | Using the COLLECTIONS UPDATE API, you can UPDATE Collections name for now. We might add more meta data to the Collections which you can use the Update API for.`suspend fun update(collectionID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, schemaDocId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, removeSchemaDoc: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`CollectionUpdate`](../-collection-update/index.html) |


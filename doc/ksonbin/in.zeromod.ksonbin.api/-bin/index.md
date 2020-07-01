---
title: Bin - ksonbin
---

[ksonbin](../../index.html) / [in.zeromod.ksonbin.api](../index.html) / [Bin](./index.html)

# Bin

`class Bin`

### Constructors

| [&lt;init&gt;](-init-.html) | `Bin(ksonbin: `[`Ksonbin`](../../in.zeromod.ksonbin/-ksonbin/index.html)`)` |

### Properties

| [ksonbin](ksonbin.html) | `val ksonbin: `[`Ksonbin`](../../in.zeromod.ksonbin/-ksonbin/index.html) |

### Functions

| [create](create.html) | Using the CREATE API, you can Create Public and Private bins.`suspend fun <JSON : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(data: JSON, collectionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, private: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`BinCreate`](../-bin-create/index.html)`<JSON>` |
| [delete](delete.html) | Using the DELETE API, you can Delete the Public  or a Private bins.`suspend fun delete(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`BinDelete`](../-bin-delete/index.html) |
| [read](read.html) | Using the READ API, you can Read Public and Private bins.`suspend fun <JSON : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> read(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, binVersion: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, secretKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = ksonbin.secretKey): JSON` |
| [update](update.html) | Using the UPDATE API, you can Update Public and Private bins.`suspend fun <JSON : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> update(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, data: JSON, versioning: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, secretKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = ksonbin.secretKey): `[`BinUpdate`](../-bin-update/index.html)`<JSON>` |


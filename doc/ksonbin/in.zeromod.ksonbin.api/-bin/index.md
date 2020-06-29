[ksonbin](../../index.md) / [in.zeromod.ksonbin.api](../index.md) / [Bin](./index.md)

# Bin

`class Bin`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Bin(ksonbin: `[`Ksonbin`](../../in.zeromod.ksonbin/-ksonbin/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [ksonbin](ksonbin.md) | `val ksonbin: `[`Ksonbin`](../../in.zeromod.ksonbin/-ksonbin/index.md) |

### Functions

| Name | Summary |
|---|---|
| [create](create.md) | Using the CREATE API, you can Create Public and Private bins.`suspend fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(data: T, private: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`BinCreate`](../-bin-create/index.md)`<T>` |
| [delete](delete.md) | Using the DELETE API, you can Delete the Public  or a Private bins.`suspend fun delete(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`BinDelete`](../-bin-delete/index.md) |
| [read](read.md) | Using the READ API, you can Read Public and Private bins.`suspend fun <R : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> read(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, secretKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = ksonbin.secretKey): R` |
| [update](update.md) | Using the UPDATE API, you can Update Public and Private bins.`suspend fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> update(binId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, data: T, secretKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = ksonbin.secretKey): `[`BinUpdate`](../-bin-update/index.md)`<T>` |

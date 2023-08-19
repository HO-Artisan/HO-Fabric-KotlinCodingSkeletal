package org.hoartisan.example

import net.minecraft.core.Registry
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.state.BlockBehaviour

object ExampleMain {
    const val MODID: String = "example_kotlin_mod"

    /**
     * 可以是任何名称，需要在fabric.mod.json中申明到此处。依照习惯可用class,object或函数方法.
     *
     * 1.20 可参考 https://github.com/HO-Artisan/PineappleCoffee
     */
    fun jumpIn() {
        Registry.register(Registry.ITEM, getRL("example_item"), Item(Item.Properties()))

        val block = Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD))
        Registry.register(Registry.BLOCK, getRL("example_block"), block)
        Registry.register(Registry.ITEM, getRL("example_block_item"), BlockItem(block, Item.Properties()))
    }
}

// 作为全局高阶函数使用
fun getRL(name: String) = ResourceLocation(ExampleMain.MODID, name)
package com.example.examplemod

import net.minecraft.block.Block

public class TestBlock extends Block {


    TestBlock(final Properties prop) {
        super(prop)
        this.setRegistryName("examplemod", "testblock")
    }


}

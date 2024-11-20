package com.hi.dhl.pokemon.data.mapper

import android.util.Log
import com.hi.dhl.pokemon.data.entity.PokemonEntity
import com.hi.dhl.pokemon.ext.TAG
import com.hi.dhl.pokemon.model.PokemonItemModel
import timber.log.Timber

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/7/11
 *     desc  :
 * </pre>
 */
class Entity2ItemModelMapper : Mapper<PokemonEntity, PokemonItemModel> {

    override fun map(input: PokemonEntity): PokemonItemModel {
        // Timber.tag(TAG).i("map: url->https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg") //随机的图片
        return PokemonItemModel(name = input.name, url = "https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg")
    }


}
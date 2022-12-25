import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args){
        List<String> pokemonParty = new ArrayList<>();
        pokemonParty.add("Sprigatito");
        pokemonParty.add("Quaxly");
        pokemonParty.add("Fuecoco");
        System.out.println(pokemonParty);

        pokemonParty.add(0,"Pikachu");
        pokemonParty.remove(2);
        System.out.println(pokemonParty);

        pokemonParty.add("Bulbasaur");
        pokemonParty.add("Charmander");
        pokemonParty.add("Squirtle");

        // ポケモンを6体以上連れて行こうとした時の例外処理
        try{
            if(pokemonParty.size() >= 6){
                throw new NumberOfPokemonLimitException();
            }else {
                pokemonParty.add("Squirtle");
                System.out.println("Squirtleを手持ちに追加しました。");
            }
        }catch(NumberOfPokemonLimitException e){
            int target = pokemonParty.size() - 1;
            pokemonParty.remove(target);
            System.out.println("ポケモンを6体以上連れて歩くことはできません。");
        }

        Map<String, String> pokemonInfo = new HashMap<>();
        pokemonInfo.put("Sprigatito","It can use its plant powers to soak up whatever water you throw at it");
        pokemonInfo.put("Quaxly","The burning-hot sparks it scatters will fry any and all plants in a flash");
        pokemonInfo.put("Fuecoco","It may seem quiet, but its mighty stream of water can put out any fire - you'll see");
        pokemonInfo.put("Pikachu","Pikachu that can generate powerful electricity have check sacs that are extra soft and super strechy.");
        System.out.println(pokemonInfo);
        System.out.println(pokemonInfo.get("Sprigatito"));
        pokemonInfo.remove("Sprigatito");
        System.out.println(pokemonInfo);

        // Hashmapに指定したキー：val が存在しない時、例外としてメッセージを表示させる。 null表示をさせない
        try {
            String val = "Picachu";
            if(pokemonInfo.get(val) == null) throw new NullPointerException();
            else System.out.println(pokemonInfo.get(val));
        }catch (Exception e){
            System.out.println("指定したkeyは存在しません。keyの名前が正しいか確認してください。");
        }
    }
}

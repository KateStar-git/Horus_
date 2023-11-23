import java.util.List;
import java.util.Optional;

public class Wall implements Structure, CompositeBlock, Block {

        List<Block> blocks;



    public Wall(){}
    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    //        String color;
//        String material;
//        int count;
//


//        public Wall(List<Block> blocks, String color, String material, int count) {
//        this.blocks = blocks;
//        this.color = color;
//        this.material = material;
//        this.count = count;
//    }

    @Override
        public String getColor() {

           return getColor(); //z interface Block
        }

    @Override
    public String getMaterial() {
        return getMaterial(); //z interface Block
    }

    @Override
    public List<Block> getBlocks() { //z interface CompositeBlock
        return blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return findBlockByColor(getColor()); //metoda z interface Structure;parametr jest metod¹ z interface Block.
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {

            return findBlocksByMaterial(getMaterial()); //metoda z interface Structure parametr jest metod¹ z interface Block.
    }

    @Override
    public int count() {
        return getBlocks().size(); //metoda z interface CompositeBlock
    }
}
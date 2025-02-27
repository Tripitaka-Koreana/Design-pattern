public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Mage(new Staff());
    }

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }
}

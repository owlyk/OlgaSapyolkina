package homework5;

public class RubberDuck extends Birds implements CanSwim
{
 private String material;
 private String beak;

 public RubberDuck(String name, String type, String material, String beak) {
  super(name, type);
 }

 @Override
 public void canSwim() {

 }

 public String getMaterial() {
  return material;
 }

 public void setMaterial(String material) {
  this.material = material;
 }

 public String getBeak() {
  return beak;
 }

 public void setBeak(String beak) {
  this.beak = beak;
 }
}

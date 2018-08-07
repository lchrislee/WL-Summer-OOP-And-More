package pizzeria.internal.food;

import pizzeria.Pizzeria;
import pizzeria.internal.Kitchen;
import pizzeria.internal.Pizza;
import pizzeria.internal.menu.Topping;

/**
 * A dedicated Builder that is the intended way to create instances of {@link Pizza}.
 *
 * TODO: Implement in full.
 */
public class PizzaBuilder {

        private boolean hasTomatoSauce;
        private boolean hasMozzarellaCheese;
        private boolean hasBasil;
        private boolean hasTomatoSlices;
        private boolean hasPepperoni;
        private boolean hasSausage;
        private boolean hasGroundBeef;
        private boolean hasBaconBits;
        private boolean hasSpinach;
        private boolean hasMushrooms;
        private boolean hasCaramelizedOnions;
        private boolean hasGreenPeppers;
        private boolean hasOlives;
        private boolean hasPineapples;
        private boolean hasSlicedHam;


        public PizzaBuilder withTomatoSauce(boolean TomatoSauce) {
            this.hasTomatoSauce = true;
            return this;
        }

        public PizzaBuilder withMozzarella(boolean MozzarellaCheese) {
            this.hasMozzarellaCheese = true;
            return this;
        }

        public PizzaBuilder withBasil(boolean Basil) {
            this.hasBasil = true;
            return this;
        }

        public PizzaBuilder withTomatoSlices(boolean TomatoSlices) {
            this.hasTomatoSlices = true;
            return this;
        }

        public PizzaBuilder withPepperoni(boolean Pepperoni) {
            this.hasPepperoni = true;
            return this;
        }

        public PizzaBuilder withSausage(boolean Sausage) {
            this.hasSausage = true;
            return this;
        }

        public PizzaBuilder withGroundBeef(boolean GroundBeef) {
            this.hasGroundBeef = true;
            return this;
        }

        public PizzaBuilder withBaconBits(boolean BaconBits) {
            this.hasBaconBits = true;
            return this;
        }

        public PizzaBuilder withSpinach(boolean Spinach) {
            this.hasSpinach = true;
            return this;
        }

        public PizzaBuilder withMushrooms(boolean Mushrooms) {
            this.hasMushrooms = true;
            return this;
        }

        public PizzaBuilder withCaramelizedOnions(boolean CaramelizedOnions) {
            this.hasCaramelizedOnions = true;
            return this;
        }

        public PizzaBuilder withGreenPeppers(boolean GreenPeppers) {
            this.hasGreenPeppers = true;
            return this;
        }

        public PizzaBuilder withOlives(boolean Olives) {
            this.hasOlives = true;
            return this;
        }

        public PizzaBuilder withPineapples(boolean Pineapples) {
            this.hasPineapples = true;
            return this;
        }

        public PizzaBuilder withSlicedHam(boolean SlicedHam) {
            this.hasSlicedHam = true;
            return this;
        }

        /**
         * Use the information established to create a {@link Pizza}.
         * TODO: Implement in full.
         *
         * @return The created {@link Pizza};
         */

        public Pizza build() {
             int count = 0;

            if (this.hasTomatoSauce) {
                count++;
            } else if (this.hasMozzarellaCheese) {
                count++;
            } else if (this.hasBasil) {
                count++;
            } else if (this.hasTomatoSlices) {
                count++;
            } else if (this.hasPepperoni) {
                count++;
            } else if (this.hasSausage) {
                count++;
            } else if (this.hasGroundBeef) {
                count++;
            } else if (this.hasBaconBits) {
                count++;
            } else if (this.hasSpinach) {
                count++;
            } else if (this.hasMushrooms) {
                count++;
            } else if (this.hasCaramelizedOnions) {
                count++;
            } else if (this.hasGreenPeppers) {
                count++;
            } else if (this.hasOlives) {
                count++;
            } else if (this.hasPineapples) {
                count++;
            } else {
                count++;
            }

            Topping[] topping = new Topping [count];

            if (this.hasTomatoSauce) {
                topping [0] = Topping.TOMATO_SAUCE;
            }
            if (this.hasMozzarellaCheese) {
                topping [1] = Topping.MOZZARELLA_CHEESE;
            }
            if (this.hasBasil) {
                topping[2] = Topping.BASIL;
            }
            if(this.hasTomatoSlices) {
                topping[3] = Topping.TOMATO_SLICES;
            }
            if(this.hasPepperoni) {
                topping[4] = Topping.PEPPERONI;
            }
            if (this.hasSausage) {
                topping[5] = Topping.SAUSAGE;
            }
            if(this.hasGroundBeef) {
                topping[6] = Topping.GROUND_BEEF;
            }
            if (this.hasBaconBits) {
                topping[7] = Topping.BACON_BITS;
            }
            if(this.hasSpinach) {
                topping[8] = Topping.SPINACH;
            }
            if(this.hasMushrooms) {
                topping[9] = Topping.MUSHROOMS;
            }
            if (this.hasCaramelizedOnions) {
                topping[10] = Topping.CARAMELIZED_ONIONS;
            }
            if(this.hasGreenPeppers) {
                topping[11] = Topping.GREEN_PEPPERS;
            }
            if(this.hasOlives) {
                topping[12] = Topping.OLIVES;
            }
            if (this.hasPineapples) {
                topping[13] = Topping.PINEAPPLES;
            }
            if (this.hasSlicedHam) {
                topping[14] = Topping.SLICED_HAM;
            }
            if(this.hasPineapples) {
                topping[15] = Topping.PINEAPPLES;
            }
            return new Pizza(topping);
        }
}
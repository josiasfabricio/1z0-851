/**
 * 
 */
package aula04;

/**
 * @author jfsilva 03/03/2015
 */
enum Horse {
	PONE(10), 
	ICELANDIC(13) {
		/* (non-Javadoc)
		 * @see certificacao.aula4.Horse#getWeight()
		 */
		@Override
		int getWeight() {
			return 800;
		}
	},
	HORSE(15);

	Horse(int hands) {
		this.height = hands;
		this.weight = hands * 100;
	}

	int height, weight;

	int getWeight() {
		return weight;
	}

	void setWeight(int w) {
		weight = w;
	}
}



package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_L_sideskirt_4 extends Sideskirt
{
	public Baiern_L_sideskirt_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM left sideskirt";

		description = "The left sideskirt of the CoupeSport DTM. Features enhanced air dynamics and air passages to the rear brake system to enhance efficiency. It has also gained an accurate cut for the direct exhaust system which ensures compact placement of exhaust system parts without affecting the aerodynamics critically.";

		value = tHUF2USD(2384.3);
		brand_new_prestige_value = 70.0;
		setMaxWear(kmToMaxWear(400000.0));
	}
}

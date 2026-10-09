package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class Baiern_R_headlights_5 extends Headlights
{
	public Baiern_R_headlights_5( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM right headlights";

		description = "The right side headlights for the CoupeSport DTM. It's based on headlights for the CoupeSport GTIII, the DTM ones gained a more rectangular profile and included improved lamp which ensures best lighting in dark weather what it very important while racing. Also, the updated front case made from pressed glass defenses the headlights in tough racing conditions.";

		value = tHUF2USD(1388.38);
		brand_new_prestige_value = 60.0;
		setMaxWear(kmToMaxWear(200000.0));
	}
}

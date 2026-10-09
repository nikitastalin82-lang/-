package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_sideskirt_2 extends Sideskirt
{
	public Axis_R_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200XT right sideskirt";
		description = "The stock right sideskirt for Axis 200XT models.";

		value = tHUF2USD(128.921);
		brand_new_prestige_value = 43.61;
	}
}

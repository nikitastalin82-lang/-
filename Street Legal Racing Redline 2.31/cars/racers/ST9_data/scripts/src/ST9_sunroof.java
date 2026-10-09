package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_sunroof extends TargaTop
{
	public ST9_sunroof( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 sunroof";
		description = "Stock sunroof for ST9 models.";

		value = tHUF2USD(50.218);
		brand_new_prestige_value = 25.76;
	}
}

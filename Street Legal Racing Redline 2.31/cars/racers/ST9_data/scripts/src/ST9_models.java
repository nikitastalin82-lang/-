package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_models extends Chassis
{
	static int	MODEL_CHALLENGE		= 4;
	static int	MODEL_FUSION		= 5;

	public ST9_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_SHIMUTSHIBU;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}
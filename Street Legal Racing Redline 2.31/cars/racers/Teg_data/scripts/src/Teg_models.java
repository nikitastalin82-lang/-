package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_models extends Chassis
{
	static int	MODEL_S199		= 10;
	static int	MODEL_T267		= 11;

	public Teg_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_EINVAGEN;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}
/**
 * ***************************************************************************
 * <p>
 * $RCSfile: Ingredient.java,v $
 * <p>
 * <p>
 * <p>
 * ***************************************************************************
 * <p>
 * $Revision: 1.0 $
 * <p>
 * $Id: Ingredient.java,v 2019/05/27 3:47 PM mkaroune Exp $
 * <p>
 * ***************************************************************************
 * <p>
 * Copyright (c) 2019 Nokia . All Rights Reserved.
 * Please read the associated COPYRIGHTS file for more details.
 * <p>
 * ***************************************************************************
 */

package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient
{
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type
    {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}

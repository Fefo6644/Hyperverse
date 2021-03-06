//
// Hyperverse - A Minecraft world management plugin
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program. If not, see <http://www.gnu.org/licenses/>.
//

package se.hyperver.hyperverse.flags.implementation;

import org.jetbrains.annotations.NotNull;
import se.hyperver.hyperverse.configuration.Messages;

public class IgnoreBedsFlag extends BooleanFlag<IgnoreBedsFlag> {

    public static final IgnoreBedsFlag IGNORE_BEDS_TRUE  = new IgnoreBedsFlag(true);
    public static final IgnoreBedsFlag IGNORE_BEDS_FALSE = new IgnoreBedsFlag(false);

    private IgnoreBedsFlag(final boolean value) {
        super(value, Messages.flagDescriptionIgnoreBeds);
    }

    @Override protected IgnoreBedsFlag flagOf(@NotNull final Boolean value) {
        return value ? IGNORE_BEDS_TRUE : IGNORE_BEDS_FALSE;
    }

}

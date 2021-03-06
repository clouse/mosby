/*
 * Copyright 2015 Hannes Dorfmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hannesdorfmann.mosby.sample.mvp.customviewstate;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.hannesdorfmann.mosby.sample.mvp.model.custom.A;
import com.hannesdorfmann.mosby.sample.mvp.model.custom.B;

/**
 * @author Hannes Dorfmann
 */
public interface MyCustomView extends MvpView {


  public void showA(A a);

  public void showB(B b);
}
